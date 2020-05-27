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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "siteId",
    "siteDescriptorId",
    "siteLocaleDescriptorId",
    "channelDescriptorId",
    "channelLocaleDescriptorId",
    "contentTypeAssociation",
    "adhocReferences",
    "acl"
})
@XmlRootElement(name = "siteContentType")
public class SiteContentType {

    @XmlElement(required = true)
    protected CTId siteId;
    protected CTId siteDescriptorId;
    protected CTId siteLocaleDescriptorId;
    protected CTId channelDescriptorId;
    protected CTId channelLocaleDescriptorId;
    protected List<CTSiteContentTypeAssociation> contentTypeAssociation;
    protected CTAdhocReferences adhocReferences;
    protected CTAcl acl;
    @XmlAttribute(name = "mgmtId")
    protected String mgmtId;
    @XmlAttribute(name = "vcmId")
    protected String vcmId;
    @XmlAttribute(name = "vcmStatus")
    protected String vcmStatus;
    @XmlAttribute(name = "vcmName")
    protected String vcmName;
    @XmlAttribute(name = "vcmLogicalPath")
    protected String vcmLogicalPath;

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setSiteId(CTId value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the siteDescriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getSiteDescriptorId() {
        return siteDescriptorId;
    }

    /**
     * Sets the value of the siteDescriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setSiteDescriptorId(CTId value) {
        this.siteDescriptorId = value;
    }

    /**
     * Gets the value of the siteLocaleDescriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getSiteLocaleDescriptorId() {
        return siteLocaleDescriptorId;
    }

    /**
     * Sets the value of the siteLocaleDescriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setSiteLocaleDescriptorId(CTId value) {
        this.siteLocaleDescriptorId = value;
    }

    /**
     * Gets the value of the channelDescriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getChannelDescriptorId() {
        return channelDescriptorId;
    }

    /**
     * Sets the value of the channelDescriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setChannelDescriptorId(CTId value) {
        this.channelDescriptorId = value;
    }

    /**
     * Gets the value of the channelLocaleDescriptorId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getChannelLocaleDescriptorId() {
        return channelLocaleDescriptorId;
    }

    /**
     * Sets the value of the channelLocaleDescriptorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setChannelLocaleDescriptorId(CTId value) {
        this.channelLocaleDescriptorId = value;
    }

    /**
     * Gets the value of the contentTypeAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentTypeAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentTypeAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSiteContentTypeAssociation }
     * 
     * 
     */
    public List<CTSiteContentTypeAssociation> getContentTypeAssociation() {
        if (contentTypeAssociation == null) {
            contentTypeAssociation = new ArrayList<CTSiteContentTypeAssociation>();
        }
        return this.contentTypeAssociation;
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

}
