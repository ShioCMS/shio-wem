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

package com.viglet.shio.wem.v085.importexport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_siteContentTypeAssociation", propOrder = {
    "contentTypeId"
})
public class CTSiteContentTypeAssociation {

    @XmlElement(required = true)
    protected CTId contentTypeId;
    @XmlAttribute(name = "mgmtId")
    protected String mgmtId;

    /**
     * Gets the value of the contentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getContentTypeId() {
        return contentTypeId;
    }

    /**
     * Sets the value of the contentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setContentTypeId(CTId value) {
        this.contentTypeId = value;
    }

    /**
     * Gets the value of the mgmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMgmtId() {
        return mgmtId;
    }

    /**
     * Sets the value of the mgmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMgmtId(String value) {
        this.mgmtId = value;
    }

}
