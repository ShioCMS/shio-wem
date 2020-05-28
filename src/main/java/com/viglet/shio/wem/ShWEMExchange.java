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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.viglet.shio.exchange.ShExchange;
import com.viglet.shio.exchange.ShFolderExchange;
import com.viglet.shio.exchange.ShSiteExchange;
import com.viglet.shio.wem.utils.ShUtils;
import com.viglet.shio.wem.v085.importexport.CTId;
import com.viglet.shio.wem.v085.importexport.Channel;
import com.viglet.shio.wem.v085.importexport.ImportSite;
import com.viglet.shio.wem.v085.importexport.PackageBody;
import com.viglet.shio.wem.v085.importexport.Site;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Convert WEM Export to Shio Export
 * 
 * @author Alexandre Oliveira
 */
public class ShWEMExchange {
	private static final Log logger = LogFactory.getLog(ShWEMExchange.class);

	private static final String DEFAULT_OWNER = "admin";
	private static Map<String, String> wemIds = new HashMap<>();

	private static PackageBody packageBody;

	public static void main(String[] args) throws JAXBException {

		File file = new File(args[0]);
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageBody.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		packageBody = (PackageBody) unmarshaller.unmarshal(file);

		ShExchange shExchange = new ShExchange();

		shExchange.setSites(createSites(packageBody.getImportSite()));
		shExchange.setFolders(createFolders(packageBody));
		createExportFile(shExchange);

	}

	private static List<ShFolderExchange> createFolders(PackageBody packageBody) {

		getAllChannelIds(packageBody);

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

	private static void createExportFile(ShExchange shExchange) {
		String folderName = UUID.randomUUID().toString();
		File userDir = new File(System.getProperty("user.dir"));
		File tmpDir = new File(userDir.getAbsolutePath().concat(File.separator + "store" + File.separator + "tmp"));
		if (!tmpDir.exists()) {
			tmpDir.mkdirs();
		}

		File exportDir = new File(tmpDir.getAbsolutePath().concat(File.separator + folderName));
		if (!exportDir.exists()) {
			exportDir.mkdirs();
		}
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

		File zipFile = new File(tmpDir.getAbsolutePath().concat(File.separator + zipFileName));

		ShUtils.addFilesToZip(exportDir, zipFile);
	}

	private static List<ShSiteExchange> createSites(List<ImportSite> sites) {
		List<ShSiteExchange> shSiteExchanges = new ArrayList<>();
		sites.forEach(siteImport -> {
			Site site = siteImport.getSite();
			System.out.println(site.getName());

			List<String> rootFoldersUUID = new ArrayList<String>();
			site.getChannel().forEach(channel -> {
				rootFoldersUUID.add(channel.getVcmId());
			});

			ShSiteExchange shSiteExchange = new ShSiteExchange();
			shSiteExchange.setName(site.getName());
			shSiteExchange.setDescription(site.getDescription());
			shSiteExchange.setFurl(site.getFurlName());
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