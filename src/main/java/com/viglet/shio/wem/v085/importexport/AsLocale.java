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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "language",
    "country",
    "variant",
    "flagPathTiny",
    "flagPathSmall",
    "active",
    "attribute",
    "adhocReferences",
    "acl"
})
@XmlRootElement(name = "asLocale")
public class AsLocale {

    protected String language;
    protected String country;
    protected String variant;
    protected String flagPathTiny;
    protected String flagPathSmall;
    protected boolean active;
    protected List<CTAttribute> attribute;
    protected CTAdhocReferences adhocReferences;
    protected CTAcl acl;
    @XmlAttribute(name = "vcmId")
    protected String vcmId;
    @XmlAttribute(name = "vcmStatus")
    protected String vcmStatus;
    @XmlAttribute(name = "vcmName")
    protected String vcmName;
    @XmlAttribute(name = "vcmLogicalPath")
    protected String vcmLogicalPath;
    @XmlAttribute(name = "mgmtId")
    protected String mgmtId;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

    /**
     * Gets the value of the flagPathTiny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPathTiny() {
        return flagPathTiny;
    }

    /**
     * Sets the value of the flagPathTiny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPathTiny(String value) {
        this.flagPathTiny = value;
    }

    /**
     * Gets the value of the flagPathSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagPathSmall() {
        return flagPathSmall;
    }

    /**
     * Sets the value of the flagPathSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagPathSmall(String value) {
        this.flagPathSmall = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAttribute }
     * 
     * 
     */
    public List<CTAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<CTAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the adhocReferences property.
     * 
     * @return
     *     possible object is
     *     {@link CTAdhocReferences }
     *     
     */
    public CTAdhocReferences getAdhocReferences() {
        return adhocReferences;
    }

    /**
     * Sets the value of the adhocReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAdhocReferences }
     *     
     */
    public void setAdhocReferences(CTAdhocReferences value) {
        this.adhocReferences = value;
    }

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link CTAcl }
     *     
     */
    public CTAcl getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTAcl }
     *     
     */
    public void setAcl(CTAcl value) {
        this.acl = value;
    }

    /**
     * Gets the value of the vcmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcmId() {
        return vcmId;
    }

    /**
     * Sets the value of the vcmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcmId(String value) {
        this.vcmId = value;
    }

    /**
     * Gets the value of the vcmStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcmStatus() {
        return vcmStatus;
    }

    /**
     * Sets the value of the vcmStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcmStatus(String value) {
        this.vcmStatus = value;
    }

    /**
     * Gets the value of the vcmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcmName() {
        return vcmName;
    }

    /**
     * Sets the value of the vcmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcmName(String value) {
        this.vcmName = value;
    }

    /**
     * Gets the value of the vcmLogicalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcmLogicalPath() {
        return vcmLogicalPath;
    }

    /**
     * Sets the value of the vcmLogicalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcmLogicalPath(String value) {
        this.vcmLogicalPath = value;
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
