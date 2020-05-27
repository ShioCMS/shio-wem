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

import com.viglet.shio.wem.v085.importexport.PackageBody;

import java.io.File;

public class ShWEMImportExport {

	private static PackageBody packageBody;
	
	public static void main(String[] args) throws JAXBException {

		System.out.println("Hello World" + args[0]);
		
		File file = new File(args[0]);
		JAXBContext jaxbContext = JAXBContext.newInstance(PackageBody.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		packageBody = (PackageBody) unmarshaller.unmarshal(file);
		
		System.out.println(packageBody.getImportSite().get(0).getSite().getName());

	}

}