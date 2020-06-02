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
import com.viglet.shio.exchange.ShSiteExchange;
import com.viglet.shio.wem.url.ShURLFormatter;
import com.viglet.shio.wem.utils.ShUtils;
import com.viglet.shio.wem.v085.importexport.Channel;
import com.viglet.shio.wem.v085.importexport.ContentInstance;
import com.viglet.shio.wem.v085.importexport.ImportSite;
import com.viglet.shio.wem.v085.importexport.PackageBody;
import com.viglet.shio.wem.v085.importexport.Project;
import com.viglet.shio.wem.v085.importexport.Site;
import com.viglet.shio.wem.v085.importexport.StaticFile;

import java.io.File;
import java.io.IOException;
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

	public static void main(String[] args) throws JAXBException {
		File packageBodyFile = new File(args[0]);
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageBody.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		packageBody = (PackageBody) unmarshaller.unmarshal(packageBodyFile);

		getAllChannelIds(packageBody);
		
		ShExchange shExchange = new ShExchange();		
		shExchange.setSites(createSites(packageBody.getImportSite()));
		shExchange.setPosts(createPosts(packageBody, packageBodyFile.getParentFile()));
		shExchange.setFolders(createFolders(packageBody));
		
		createExportFile(shExchange);
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
			fields.put("TEXT", contentInstance.getVcmName());

			ShPostExchange shPostExchange = new ShPostExchange();
			shPostExchange.setId(contentInstance.getVcmId());
			shPostExchange.setDate(new Date());
			shPostExchange.setOwner(DEFAULT_OWNER);
			shPostExchange.setPostType("Text");
			shPostExchange.setFurl(StringUtils.substring(contentInstance.getFurlName(), 0, 254));
			shPostExchange.setFields(fields);
			if (contentInstance.getChannelAssociation() != null
					&& contentInstance.getChannelAssociation().getReferenceId() != null) {
				contentInstance.getChannelAssociation().getReferenceId().forEach(referenceId -> {
					if (referenceId != null && referenceId.getContent() != null
							&& referenceId.getContent().size() > 0) {
						String channelId = referenceId.getContent().get(0).toString();
						String vcmId = wemIds.get(channelId);
						if (StringUtils.isEmpty(vcmId)) {
							setFolderUsingProject(contentInstance.getVcmLogicalPath(), shPostExchange);
						}
						else {
						shPostExchange.setFolder(vcmId);
						}
					}
				});
			} else {
				setFolderUsingProject(contentInstance.getVcmLogicalPath(), shPostExchange);
			}
			shPostExchanges.add(shPostExchange);
		});

		return shPostExchanges;
	}

	private static void setFolderUsingProject(String logicalPath, ShPostExchange shPostExchange) {
		if (!StringUtils.isEmpty(logicalPath)) {
			if (!projects.containsKey(logicalPath))
				createFolderWithoutID(logicalPath, shPostExchange);
			shPostExchange.setFolder(projects.get(logicalPath));
		} else {
			shPostExchange.setFolder(ROOT_PROJECT_ID);
		}
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
		if (!tmpDir.exists()) {
			tmpDir.mkdirs();
		}

		File exportDir = new File(tmpDir.getAbsolutePath().concat(File.separator + EXPORT_DIR_NAME));
		if (!exportDir.exists()) {
			exportDir.mkdirs();
		}
		return exportDir;
	}

	private static void createExportFile(ShExchange shExchange) {

		File exportDir = getExportDir();

		// Object to JSON in file
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