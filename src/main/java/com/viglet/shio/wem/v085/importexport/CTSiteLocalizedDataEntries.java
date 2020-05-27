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
@XmlType(name = "CT_siteLocalizedDataEntries", propOrder = {
    "localizedData"
})
public class CTSiteLocalizedDataEntries {

    protected List<CTSiteLocalizedDataEntries.LocalizedData> localizedData;

    /**
     * Gets the value of the localizedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSiteLocalizedDataEntries.LocalizedData }
     * 
     * 
     */
    public List<CTSiteLocalizedDataEntries.LocalizedData> getLocalizedData() {
        if (localizedData == null) {
            localizedData = new ArrayList<CTSiteLocalizedDataEntries.LocalizedData>();
        }
        return this.localizedData;
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
     *         &lt;element name="locale" type="{http://www.vignette.com/xmlschemas/importexport}CT_id"/>
     *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="furlName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "locale",
        "active",
        "required",
        "_default",
        "name",
        "furlName",
        "descriptor"
    })
    public static class LocalizedData {

        @XmlElement(required = true)
        protected CTId locale;
        protected Boolean active;
        protected Boolean required;
        @XmlElement(name = "default")
        protected Boolean _default;
        protected String name;
        protected String furlName;
        protected String descriptor;

        /**
         * Gets the value of the locale property.
         * 
         * @return
         *     possible object is
         *     {@link CTId }
         *     
         */
        public CTId getLocale() {
            return locale;
        }

        /**
         * Sets the value of the locale property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTId }
         *     
         */
        public void setLocale(CTId value) {
            this.locale = value;
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
         * Gets the value of the required property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequired() {
            return required;
        }

        /**
         * Sets the value of the required property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRequired(Boolean value) {
            this.required = value;
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

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the furlName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFurlName() {
            return furlName;
        }

        /**
         * Sets the value of the furlName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFurlName(String value) {
            this.furlName = value;
        }

        /**
         * Gets the value of the descriptor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptor() {
            return descriptor;
        }

        /**
         * Sets the value of the descriptor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptor(String value) {
            this.descriptor = value;
        }

    }

}
