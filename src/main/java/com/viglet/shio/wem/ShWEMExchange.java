/*
 * Copyright (C) 2016-2020 the original author or authors. 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.shio.wem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.viglet.shio.exchange.ShExchange;
import com.viglet.shio.exchange.ShFolderExchange;
import com.viglet.shio.exchange.ShPostExchange;
import com.viglet.shio.exchange.ShPostTypeExchange;
import com.viglet.shio.exchange.ShPostTypeFieldExchange;
import com.viglet.shio.exchange.ShSiteExchange;
import com.viglet.shio.wem.url.ShURLFormatter;
import com.viglet.shio.wem.utils.ShUtils;
import com.viglet.shio.wem.v085.importexport.CTId;
import com.viglet.shio.wem.v085.importexport.Channel;
import com.viglet.shio.wem.v085.importexport.ContentInstance;
import com.viglet.shio.wem.v085.importexport.ContentType;
import com.viglet.shio.wem.v085.importexport.ImportSite;
import com.viglet.shio.wem.v085.importexport.PackageBody;
import com.viglet.shio.wem.v085.importexport.Project;
import com.viglet.shio.wem.v085.importexport.Site;
import com.viglet.shio.wem.v085.importexport.StaticFile;
import com.viglet.shio.wem.v085.widgets.statiselect.StaticSelectWidget;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Convert WEM Export file to Shio Export file
 * 
 * @author Alexandre Oliveira
 * @since 0.3.7
 *
 */
public class ShWEMExchange {
	private static final Log logger = LogFactory.getLog(ShWEMExchange.class);

	private static final String DEFAULT_OWNER = "admin";
	private static Map<String, String> wemIds = new HashMap<>();
	private static Map<String, String> projects = new HashMap<>();
	private static Map<String, String> parentProjects = new HashMap<>();
	private static final String ROOT_PROJECT_ID = UUID.randomUUID().toString();
	private static final String ROOT_PROJECT_NAME = "Projects";
	private static final String EXPORT_DIR_NAME = UUID.randomUUID().toString();
	private static final String SLASH = "/";
	private static PackageBody packageBody;

	public static final String HIDDEN = "Hidden";
	public static final String TEXT = "Text";
	public static final String ACE_JS = "Ace Editor - Javascript";
	public static final String ACE_HTML = "Ace Editor - HTML";
	public static final String HTML_EDITOR = "HTML Editor";
	public static final String FILE = "File";
	public static final String TEXT_AREA = "Text Area";
	public static final String COMBO_BOX = "Combo Box";
	public static final String CONTENT_SELECT = "Content Select";
	public static final String RELATOR = "Relator";
	public static final String RECAPTCHA = "reCAPTCHA";
	public static final String FORM_CONFIGURATION = "Form Configuration";
	public static final String DATE = "Date";
	public static final String MULTI_SELECT = "Multi Select";
	public static final String TAB = "Tab";
	public static final String CHECK_BOX = "Check Box";

	public static void main(String[] args) throws JAXBException {
		File packageBodyFile = new File(args[0]);
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageBody.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		packageBody = (PackageBody) unmarshaller.unmarshal(packageBodyFile);

		getAllChannelIds(packageBody);

		ShExchange shExchange = new ShExchange();
		shExchange.setPostTypes(createPostTypes(packageBody));
		shExchange.setSites(createSites(packageBody.getImportSite()));
		shExchange.setPosts(createPosts(packageBody, packageBodyFile.getParentFile()));
		shExchange.setFolders(createFolders(packageBody));

		createExportFile(shExchange);
	}

	private static List<ShPostTypeExchange> createPostTypes(PackageBody packageBody) {

		Map<String, String> ctd2pt = contentType2PostType();

		List<ShPostTypeExchange> shPostTypeExchanges = new ArrayList<>();
		packageBody.getImportContentType().forEach(importContentType -> {
			ContentType contentType = importContentType.getContentType();

			wemIds.put(contentType.getMgmtId(), contentType.getName());
			Map<String, ShPostTypeFieldExchange> fields = new HashMap<>();
			contentType.getRelation().forEach(relation -> {
				relation.getAttributeDefinition().forEach(attributeDefinition -> {

					ShPostTypeFieldExchange shPostTypeFieldExchange = new ShPostTypeFieldExchange();
					shPostTypeFieldExchange.setDescription(attributeDefinition.getDisplayName());
					shPostTypeFieldExchange.setId(attributeDefinition.getMgmtId());
					shPostTypeFieldExchange.setLabel(attributeDefinition.getDisplayName());
					shPostTypeFieldExchange.setOrdinal(attributeDefinition.getOrdering().intValue());
					shPostTypeFieldExchange.setRequired(attributeDefinition.isRequired());
					shPostTypeFieldExchange.setSummary(false);
					shPostTypeFieldExchange.setTitle(attributeDefinition.isDefaultLabel());

					if (ctd2pt.containsKey(attributeDefinition.getWidgetName()))
						shPostTypeFieldExchange.setWidget(ctd2pt.get(attributeDefinition.getWidgetName()));
					else
						shPostTypeFieldExchange.setWidget(TEXT);
					fields.put(attributeDefinition.getName(), shPostTypeFieldExchange);

					if (shPostTypeFieldExchange.getWidget().equals(COMBO_BOX)) {
						String widgetDataXml = String.format("<staticSelectWidget>%s</staticSelectWidget>",
								attributeDefinition.getWidgetData());
						JAXBContext jaxbContext;
						try {
							jaxbContext = JAXBContext.newInstance(StaticSelectWidget.class);
							StringBuffer choices = new StringBuffer();
							Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
							StringReader reader = new StringReader(widgetDataXml);
							StaticSelectWidget staticSelect = (StaticSelectWidget) unmarshaller.unmarshal(reader);
							staticSelect.getSelectOptions().getSelectOption().forEach(option -> {
								choices.append(String.format("%s: %s\\n", option.getValue(), option.getLabel()));
							});
							shPostTypeFieldExchange.setWidgetSettings(String.format("{\"choices\":\"%s\"}", choices));
						} catch (JAXBException e) {
							e.printStackTrace();
						}

					}
				});

			});
			ShPostTypeExchange shPostTypeExchange = new ShPostTypeExchange();
			shPostTypeExchange.setId(contentType.getVcmId());
			shPostTypeExchange.setDate(new Date());
			shPostTypeExchange.setDescription(contentType.getDescription());
			shPostTypeExchange.setFields(fields);
			shPostTypeExchange.setLabel(contentType.getDisplayName());
			shPostTypeExchange.setName(contentType.getName());
			shPostTypeExchange.setNamePlural(contentType.getName().concat("s"));
			shPostTypeExchange.setOwner(DEFAULT_OWNER);
			shPostTypeExchange.setSystem(false);

			shPostTypeExchanges.add(shPostTypeExchange);
		});
		return shPostTypeExchanges;
	}

	private static Map<String, String> contentType2PostType() {
		Map<String, String> ctd2pt = new HashMap<>();
		ctd2pt.put("ComponentKeyWidget", TEXT);
		ctd2pt.put("ComponentListWidget", TEXT);
		ctd2pt.put("FeatureXMLWidget", TEXT);
		ctd2pt.put("FormatSelectionWidget", TEXT);
		ctd2pt.put("NamingSelectWidget", TEXT);
		ctd2pt.put("PageFormatMapRelatorWidget", TEXT);
		ctd2pt.put("QueryXMLWidget", TEXT);
		ctd2pt.put("RiGeneralSelectWidget", TEXT);
		ctd2pt.put("StalePagePolicyWidget", TEXT);
		ctd2pt.put("TemplateSiteURIWidget", TEXT);
		ctd2pt.put("TemplateURIWidget", TEXT);
		ctd2pt.put("TimeBasedInvPolicyWidget", TEXT);
		ctd2pt.put("URLSchemeMapperWidget", TEXT);
		ctd2pt.put("VCMCheckboxWidget", CHECK_BOX);
		ctd2pt.put("VCMDateWidget", DATE);
		ctd2pt.put("VCMEditLiveJavaWidget", HTML_EDITOR);
		ctd2pt.put("VCMFileWidget", FILE);
		ctd2pt.put("VCMGUIDWidget", TEXT);
		ctd2pt.put("VCMHiddenWidget", HIDDEN);
		ctd2pt.put("VCMRadiobuttonWidget", TEXT);
		ctd2pt.put("VCMStaticSelectWidget", COMBO_BOX);
		ctd2pt.put("VCMTextAreaWidget", TEXT_AREA);
		ctd2pt.put("VCMTextWidget", TEXT);
		ctd2pt.put("WCMChainSelectWidget", TEXT);
		ctd2pt.put("WCMChannelSelectWidget", TEXT);
		ctd2pt.put("WCMCheckboxWidget", CHECK_BOX);
		ctd2pt.put("WCMContentMultiSelectWidget", MULTI_SELECT);
		ctd2pt.put("WCMContentRelatorMultiCOEWidget", TEXT);
		ctd2pt.put("WCMContentRelatorWidget", TEXT);
		ctd2pt.put("WCMContentSelectWidget", CONTENT_SELECT);
		ctd2pt.put("WCMDataMultiSelectWidget", MULTI_SELECT);
		ctd2pt.put("WCMDataSelectSessionWidget", TEXT);
		ctd2pt.put("WCMDataSelectWidget", TEXT);
		ctd2pt.put("WCMDateTimeSelectorWidget", TEXT);
		ctd2pt.put("WCMHiddenWidget", HIDDEN);
		ctd2pt.put("WCMLinkWidget", TEXT);
		ctd2pt.put("WCMMediaWidget", TEXT);
		ctd2pt.put("WCMRadiobuttonWidget", TEXT);
		ctd2pt.put("WCMRelatorWidget", TEXT);
		ctd2pt.put("WCMStaticSelectWidget", TEXT);
		ctd2pt.put("WCMTextAreaWidget", TEXT_AREA);
		ctd2pt.put("WCMTextWidget", TEXT);
		ctd2pt.put("WCMTinyMCEWidget", HTML_EDITOR);
		ctd2pt.put("WCMUnstructuredContentWidget", TEXT);

		return ctd2pt;
	}

	private static List<ShPostExchange> createPosts(PackageBody packageBody, File staticFilesFolder) {
		List<ShPostExchange> shPostExchanges = new ArrayList<>();
		shPostExchanges.addAll(createOtherPosts(packageBody));
		shPostExchanges.addAll(createStaticFiles(packageBody, staticFilesFolder));
		return shPostExchanges;
	}

	private static List<ShPostExchange> createOtherPosts(PackageBody packageBody) {
		List<ShPostExchange> shPostExchanges = new ArrayList<>();
		packageBody.getImportContentInstance().forEach(importContentInstance -> {
			ContentInstance contentInstance = importContentInstance.getContentInstance();
			Map<String, Object> fields = new HashMap<>();
			contentInstance.getAttribute().forEach(attribute -> {
				fields.put(attribute.getName(),
						attribute.getValueString() != null ? attribute.getValueString().getValue() : null);
			});
			contentInstance.getRelation().forEach(relation -> {
				relation.getAttribute().forEach(attribute -> {
					fields.put(attribute.getName(),
							attribute.getValueString() != null ? attribute.getValueString().getValue() : null);
				});

			});

			ShPostExchange shPostExchange = new ShPostExchange();
			shPostExchange.setId(contentInstance.getVcmId());
			shPostExchange.setDate(new Date());
			shPostExchange.setOwner(DEFAULT_OWNER);
			CTId contentTypeId = contentInstance.getContentTypeId();
			if (contentTypeId != null && contentTypeId.getContent() != null && contentTypeId.getContent().size() > 0
					&& wemIds.containsKey(contentTypeId.getContent().get(0).toString())) {
				shPostExchange.setPostType(wemIds.get(contentTypeId.getContent().get(0).toString()));
			} else {
				shPostExchange.setPostType(TEXT);
			}
			shPostExchange.setFurl(StringUtils.substring(contentInstance.getFurlName(), 0, 254));
			shPostExchange.setFields(fields);
			if (contentInstance.getChannelAssociation() != null
					&& contentInstance.getChannelAssociation().getReferenceId() != null) {
				contentInstance.getChannelAssociation().getReferenceId().forEach(referenceId -> {
					if (referenceId != null && referenceId.getContent() != null
							&& referenceId.getContent().size() > 0) {
						String channelId = referenceId.getContent().get(0).toString();
						String vcmId = wemIds.get(channelId);
						if (StringUtils.isEmpty(vcmId))
							setFolderUsingProject(contentInstance.getVcmLogicalPath(), shPostExchange);
						else
							shPostExchange.setFolder(vcmId);
					}
				});
			} else
				setFolderUsingProject(contentInstance.getVcmLogicalPath(), shPostExchange);

			shPostExchanges.add(shPostExchange);
		});

		return shPostExchanges;
	}

	private static void setFolderUsingProject(String logicalPath, ShPostExchange shPostExchange) {
		if (!StringUtils.isEmpty(logicalPath)) {
			if (!projects.containsKey(logicalPath))
				createFolderWithoutID(logicalPath, shPostExchange);
			shPostExchange.setFolder(projects.get(logicalPath));
		} else
			shPostExchange.setFolder(ROOT_PROJECT_ID);
	}

	private static List<ShPostExchange> createStaticFiles(PackageBody packageBody, File staticFilesFolder) {
		List<ShPostExchange> shPostExchanges = new ArrayList<>();
		packageBody.getImportStaticFile().forEach(importStaticFile -> {
			StaticFile staticFile = importStaticFile.getStaticFile();
			String importFile = importStaticFile.getContents().getEntry();
			File exportDir = getExportDir();
			try {
				File source = new File(staticFilesFolder.getAbsolutePath().concat(File.separator + importFile));
				File dest = new File(exportDir.getAbsolutePath().concat(File.separator + staticFile.getVcmId()));
				FileUtils.copyFile(source, dest);
			} catch (IOException e) {
				logger.error("createPosts copyFile:", e);
			}

			Map<String, Object> fields = new HashMap<>();
			fields.put("FILE", staticFile.getVcmName());

			ShPostExchange shPostExchange = new ShPostExchange();
			shPostExchange.setId(staticFile.getVcmId());
			shPostExchange.setDate(new Date());
			shPostExchange.setOwner(DEFAULT_OWNER);
			shPostExchange.setPostType("File");
			shPostExchange.setFurl(StringUtils.substring(staticFile.getFurlName(), 0, 254));
			shPostExchange.setFields(fields);

			setFolderUsingProject(staticFile.getVcmLogicalPath(), shPostExchange);

			shPostExchanges.add(shPostExchange);
		});
		return shPostExchanges;
	}

	private static void createFolderWithoutID(String logicalPath, ShPostExchange shPostExchange) {
		if (logicalPath != null) {
			String[] staticFileFolders = logicalPath.split(SLASH);
			for (int i = 1; i < staticFileFolders.length; i++) {
				String path = String.join(SLASH, Arrays.copyOfRange(staticFileFolders, 0, i + 1));
				if (!projects.containsKey(path)) {
					String id = UUID.randomUUID().toString();
					projects.put(path, id);
					if (i > 0) {
						String parentPath = String.join(SLASH, Arrays.copyOfRange(staticFileFolders, 0, i));
						parentProjects.put(id,
								projects.containsKey(parentPath) ? projects.get(parentPath) : ROOT_PROJECT_ID);

					}
				}
			}
		}
	}

	private static List<ShFolderExchange> createFolders(PackageBody packageBody) {

		List<ShFolderExchange> shFolderExchanges = new ArrayList<>();

		packageBody.getImportSite().forEach(importSite -> {
			Site site = importSite.getSite();
			site.getChannel().forEach(channel -> {
				shFolderExchanges.add(convertChannelToShFolder(channel));
			});
		});

		packageBody.getImportChannel().forEach(importChannel -> {
			Channel channel = importChannel.getChannel();
			shFolderExchanges.add(convertChannelToShFolder(channel));

		});

		shFolderExchanges.add(createRootProject());

		packageBody.getImportProject().forEach(importProject -> {
			Project project = importProject.getProject();
			shFolderExchanges.add(convertProjectToShFolder(project));
		});
		projects.entrySet().forEach(project -> {
			String[] pathArray = project.getKey().split(SLASH);

			String name = pathArray[pathArray.length - 1];
			ShFolderExchange shFolderExchange = new ShFolderExchange();
			shFolderExchange.setDate(new Date());
			shFolderExchange.setFurl(StringUtils.substring(ShURLFormatter.format(name), 0, 254));
			shFolderExchange.setId(project.getValue());
			shFolderExchange.setName(name);
			shFolderExchange.setOwner(DEFAULT_OWNER);
			if (parentProjects.containsKey(project.getValue()))
				shFolderExchange.setParentFolder(parentProjects.get(project.getValue()));
			else
				shFolderExchange.setParentFolder(ROOT_PROJECT_ID);

			shFolderExchanges.add(shFolderExchange);
		});
		return shFolderExchanges;
	}

	private static void getAllChannelIds(PackageBody packageBody) {
		packageBody.getImportSite().forEach(importSite -> {
			Site site = importSite.getSite();
			site.getChannel().forEach(channel -> {
				wemIds.put(channel.getMgmtId(), channel.getVcmId());
			});
		});

		packageBody.getImportChannel().forEach(importChannel -> {
			Channel channel = importChannel.getChannel();
			wemIds.put(channel.getMgmtId(), channel.getVcmId());

		});
	}

	private static ShFolderExchange createRootProject() {
		ShFolderExchange shFolderExchange = new ShFolderExchange();
		shFolderExchange.setDate(new Date());
		shFolderExchange.setFurl(ShURLFormatter.format(ROOT_PROJECT_NAME));
		shFolderExchange.setId(ROOT_PROJECT_ID);
		shFolderExchange.setName(ROOT_PROJECT_NAME);
		shFolderExchange.setOwner(DEFAULT_OWNER);
		return shFolderExchange;
	}

	private static ShFolderExchange convertChannelToShFolder(Channel channel) {
		ShFolderExchange shFolderExchange = new ShFolderExchange();
		shFolderExchange.setDate(new Date());
		shFolderExchange.setFurl(channel.getFurlName());
		shFolderExchange.setId(channel.getVcmId());
		shFolderExchange.setName(channel.getName());
		shFolderExchange.setOwner(DEFAULT_OWNER);
		shFolderExchange.setPosition(channel.getOrderAsSibling().intValue());
		if (channel.getParentChannelId() != null && channel.getParentChannelId().getContent() != null
				&& channel.getParentChannelId().getContent().size() > 0) {
			String channelId = channel.getParentChannelId().getContent().get(0).toString();
			String vcmId = wemIds.get(channelId);
			shFolderExchange.setParentFolder(vcmId);
		}
		return shFolderExchange;
	}

	private static ShFolderExchange convertProjectToShFolder(Project project) {
		ShFolderExchange shFolderExchange = new ShFolderExchange();
		shFolderExchange.setDate(new Date());
		shFolderExchange.setFurl(StringUtils.substring(ShURLFormatter.format(project.getName()), 0, 254));
		shFolderExchange.setId(project.getVcmId());
		shFolderExchange.setName(project.getName());
		shFolderExchange.setOwner(DEFAULT_OWNER);
		shFolderExchange.setParentFolder(ROOT_PROJECT_ID);
		return shFolderExchange;
	}

	private static File getExportDir() {
		File userDir = new File(System.getProperty("user.dir"));
		File tmpDir = new File(userDir.getAbsolutePath().concat(File.separator + "store" + File.separator + "tmp"));
		if (!tmpDir.exists())
			tmpDir.mkdirs();

		File exportDir = new File(tmpDir.getAbsolutePath().concat(File.separator + EXPORT_DIR_NAME));
		if (!exportDir.exists())
			exportDir.mkdirs();

		return exportDir;
	}

	private static void createExportFile(ShExchange shExchange) {

		File exportDir = getExportDir();

		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(
					new File(exportDir.getAbsolutePath().concat(File.separator + "export.json")), shExchange);
		} catch (IOException mapperException) {
			logger.error("exportObject, MapperObject", mapperException);
		}
		String strDate = new SimpleDateFormat("yyyy-MM-dd_HHmmss").format(new Date());

		String zipFileName = "WEM_" + strDate + ".zip";

		File zipFile = new File(exportDir.getParentFile().getAbsolutePath().concat(File.separator + zipFileName));

		ShUtils.addFilesToZip(exportDir, zipFile);
	}

	private static List<ShSiteExchange> createSites(List<ImportSite> sites) {
		List<ShSiteExchange> shSiteExchanges = new ArrayList<>();
		sites.forEach(siteImport -> {
			Site site = siteImport.getSite();

			List<String> rootFoldersUUID = new ArrayList<String>();
			site.getChannel().forEach(channel -> {
				rootFoldersUUID.add(channel.getVcmId());
			});
			rootFoldersUUID.add(ROOT_PROJECT_ID);

			ShSiteExchange shSiteExchange = new ShSiteExchange();
			shSiteExchange.setName(site.getName());
			shSiteExchange.setDescription(site.getDescription());
			shSiteExchange.setFurl(StringUtils.substring(site.getFurlName(), 0, 254));
			shSiteExchange.setId(site.getVcmId());
			shSiteExchange.setUrl(site.getSiteURL());
			shSiteExchange.setRootFolders(rootFoldersUUID);
			shSiteExchange.setDate(new Date());
			shSiteExchange.setOwner(DEFAULT_OWNER);
			shSiteExchanges.add(shSiteExchange);
		});

		return shSiteExchanges;
	}

}