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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_siteFormatAssociations", propOrder = {
    "siteFormatAssocData"
})
public class CTSiteFormatAssociations {

    protected List<CTSiteFormatAssociations.SiteFormatAssocData> siteFormatAssocData;

    /**
     * Gets the value of the siteFormatAssocData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteFormatAssocData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteFormatAssocData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSiteFormatAssociations.SiteFormatAssocData }
     * 
     * 
     */
    public List<CTSiteFormatAssociations.SiteFormatAssocData> getSiteFormatAssocData() {
        if (siteFormatAssocData == null) {
            siteFormatAssocData = new ArrayList<CTSiteFormatAssociations.SiteFormatAssocData>();
        }
        return this.siteFormatAssocData;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="formatId" type="{http://www.vignette.com/xmlschemas/importexport}CT_id"/>
     *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "formatId",
        "active",
        "_default"
    })
    public static class SiteFormatAssocData {

        @XmlElement(required = true)
        protected CTId formatId;
        protected Boolean active;
        @XmlElement(name = "default")
        protected Boolean _default;

        /**
         * Gets the value of the formatId property.
         * 
         * @return
         *     possible object is
         *     {@link CTId }
         *     
         */
        public CTId getFormatId() {
            return formatId;
        }

        /**
         * Sets the value of the formatId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTId }
         *     
         */
        public void setFormatId(CTId value) {
            this.formatId = value;
        }

        /**
         * Gets the value of the active property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActive() {
            return active;
        }

        /**
         * Sets the value of the active property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActive(Boolean value) {
            this.active = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

    }

}
