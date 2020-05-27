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

import java.math.BigInteger;
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
    "name",
    "description",
    "parentChannelId",
    "active",
    "pageRef",
    "orderAsSibling",
    "wrapperSpec",
    "hideMissingLocales",
    "hideMissingFormats",
    "furlName",
    "descriptor",
    "targetingRuleId",
    "attribute",
    "localizedDataEntries",
    "inactiveFormatAssociations",
    "adhocReferences",
    "classification",
    "acl"
})
@XmlRootElement(name = "channel")
public class Channel {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected CTId parentChannelId;
    protected boolean active;
    protected String pageRef;
    @XmlElement(required = true)
    protected BigInteger orderAsSibling;
    protected String wrapperSpec;
    protected Boolean hideMissingLocales;
    protected Boolean hideMissingFormats;
    protected String furlName;
    protected String descriptor;
    protected CTId targetingRuleId;
    protected List<CTAttribute> attribute;
    protected List<CTChannelLocalizedDataEntries> localizedDataEntries;
    protected List<CTChannelInactiveFormatAssociations> inactiveFormatAssociations;
    protected CTAdhocReferences adhocReferences;
    protected List<CTClassification> classification;
    protected CTAcl acl;
    @XmlAttribute(name = "channelType", required = true)
    protected ENChannelType channelType;
    @XmlAttribute(name = "publishDate")
    protected String publishDate;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parentChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getParentChannelId() {
        return parentChannelId;
    }

    /**
     * Sets the value of the parentChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setParentChannelId(CTId value) {
        this.parentChannelId = value;
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
     * Gets the value of the pageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageRef() {
        return pageRef;
    }

    /**
     * Sets the value of the pageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageRef(String value) {
        this.pageRef = value;
    }

    /**
     * Gets the value of the orderAsSibling property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderAsSibling() {
        return orderAsSibling;
    }

    /**
     * Sets the value of the orderAsSibling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderAsSibling(BigInteger value) {
        this.orderAsSibling = value;
    }

    /**
     * Gets the value of the wrapperSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapperSpec() {
        return wrapperSpec;
    }

    /**
     * Sets the value of the wrapperSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapperSpec(String value) {
        this.wrapperSpec = value;
    }

    /**
     * Gets the value of the hideMissingLocales property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideMissingLocales() {
        return hideMissingLocales;
    }

    /**
     * Sets the value of the hideMissingLocales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideMissingLocales(Boolean value) {
        this.hideMissingLocales = value;
    }

    /**
     * Gets the value of the hideMissingFormats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideMissingFormats() {
        return hideMissingFormats;
    }

    /**
     * Sets the value of the hideMissingFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideMissingFormats(Boolean value) {
        this.hideMissingFormats = value;
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

    /**
     * Gets the value of the targetingRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getTargetingRuleId() {
        return targetingRuleId;
    }

    /**
     * Sets the value of the targetingRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setTargetingRuleId(CTId value) {
        this.targetingRuleId = value;
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
     * Gets the value of the localizedDataEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedDataEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedDataEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTChannelLocalizedDataEntries }
     * 
     * 
     */
    public List<CTChannelLocalizedDataEntries> getLocalizedDataEntries() {
        if (localizedDataEntries == null) {
            localizedDataEntries = new ArrayList<CTChannelLocalizedDataEntries>();
        }
        return this.localizedDataEntries;
    }

    /**
     * Gets the value of the inactiveFormatAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inactiveFormatAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInactiveFormatAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTChannelInactiveFormatAssociations }
     * 
     * 
     */
    public List<CTChannelInactiveFormatAssociations> getInactiveFormatAssociations() {
        if (inactiveFormatAssociations == null) {
            inactiveFormatAssociations = new ArrayList<CTChannelInactiveFormatAssociations>();
        }
        return this.inactiveFormatAssociations;
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
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTClassification }
     * 
     * 
     */
    public List<CTClassification> getClassification() {
        if (classification == null) {
            classification = new ArrayList<CTClassification>();
        }
        return this.classification;
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
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link ENChannelType }
     *     
     */
    public ENChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENChannelType }
     *     
     */
    public void setChannelType(ENChannelType value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishDate(String value) {
        this.publishDate = value;
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
