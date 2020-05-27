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
    "name",
    "description",
    "template",
    "siteURL",
    "appInstanceName",
    "ttl",
    "stalePagePolicy",
    "workflowDeployId",
    "underConstruction",
    "templateSpec",
    "defaultTemplate",
    "defaultTheme",
    "defaultLayout",
    "thumbnail",
    "wrapperSpec",
    "furlName",
    "mgmtUrlScheme",
    "deliveryUrlScheme",
    "descriptor",
    "attribute",
    "channel",
    "stageAssociation",
    "localizedDataEntries",
    "siteFormatAssociations",
    "segmentProfileAssociations",
    "adhocReferences",
    "classification",
    "acl"
})
@XmlRootElement(name = "site")
public class Site {

    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected boolean template;
    @XmlElement(required = true)
    protected String siteURL;
    protected String appInstanceName;
    protected String ttl;
    protected Boolean stalePagePolicy;
    protected CTId workflowDeployId;
    protected Boolean underConstruction;
    protected String templateSpec;
    protected CTId defaultTemplate;
    protected CTId defaultTheme;
    protected CTId defaultLayout;
    protected CTId thumbnail;
    protected String wrapperSpec;
    protected String furlName;
    protected CTId mgmtUrlScheme;
    protected CTId deliveryUrlScheme;
    protected String descriptor;
    protected List<CTAttribute> attribute;
    @XmlElement(required = true)
    protected List<Channel> channel;
    protected List<CTSiteStageAssociation> stageAssociation;
    protected List<CTSiteLocalizedDataEntries> localizedDataEntries;
    protected List<CTSiteFormatAssociations> siteFormatAssociations;
    protected CTSegmentProfileAssociations segmentProfileAssociations;
    protected CTAdhocReferences adhocReferences;
    protected List<CTClassification> classification;
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
     * Gets the value of the template property.
     * 
     */
    public boolean isTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     */
    public void setTemplate(boolean value) {
        this.template = value;
    }

    /**
     * Gets the value of the siteURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteURL() {
        return siteURL;
    }

    /**
     * Sets the value of the siteURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteURL(String value) {
        this.siteURL = value;
    }

    /**
     * Gets the value of the appInstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInstanceName() {
        return appInstanceName;
    }

    /**
     * Sets the value of the appInstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInstanceName(String value) {
        this.appInstanceName = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtl(String value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the stalePagePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStalePagePolicy() {
        return stalePagePolicy;
    }

    /**
     * Sets the value of the stalePagePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStalePagePolicy(Boolean value) {
        this.stalePagePolicy = value;
    }

    /**
     * Gets the value of the workflowDeployId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getWorkflowDeployId() {
        return workflowDeployId;
    }

    /**
     * Sets the value of the workflowDeployId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setWorkflowDeployId(CTId value) {
        this.workflowDeployId = value;
    }

    /**
     * Gets the value of the underConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderConstruction() {
        return underConstruction;
    }

    /**
     * Sets the value of the underConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderConstruction(Boolean value) {
        this.underConstruction = value;
    }

    /**
     * Gets the value of the templateSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateSpec() {
        return templateSpec;
    }

    /**
     * Sets the value of the templateSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateSpec(String value) {
        this.templateSpec = value;
    }

    /**
     * Gets the value of the defaultTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getDefaultTemplate() {
        return defaultTemplate;
    }

    /**
     * Sets the value of the defaultTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setDefaultTemplate(CTId value) {
        this.defaultTemplate = value;
    }

    /**
     * Gets the value of the defaultTheme property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getDefaultTheme() {
        return defaultTheme;
    }

    /**
     * Sets the value of the defaultTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setDefaultTheme(CTId value) {
        this.defaultTheme = value;
    }

    /**
     * Gets the value of the defaultLayout property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getDefaultLayout() {
        return defaultLayout;
    }

    /**
     * Sets the value of the defaultLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setDefaultLayout(CTId value) {
        this.defaultLayout = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setThumbnail(CTId value) {
        this.thumbnail = value;
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
     * Gets the value of the mgmtUrlScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getMgmtUrlScheme() {
        return mgmtUrlScheme;
    }

    /**
     * Sets the value of the mgmtUrlScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setMgmtUrlScheme(CTId value) {
        this.mgmtUrlScheme = value;
    }

    /**
     * Gets the value of the deliveryUrlScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getDeliveryUrlScheme() {
        return deliveryUrlScheme;
    }

    /**
     * Sets the value of the deliveryUrlScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setDeliveryUrlScheme(CTId value) {
        this.deliveryUrlScheme = value;
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
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel }
     * 
     * 
     */
    public List<Channel> getChannel() {
        if (channel == null) {
            channel = new ArrayList<Channel>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the stageAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stageAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStageAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSiteStageAssociation }
     * 
     * 
     */
    public List<CTSiteStageAssociation> getStageAssociation() {
        if (stageAssociation == null) {
            stageAssociation = new ArrayList<CTSiteStageAssociation>();
        }
        return this.stageAssociation;
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
     * {@link CTSiteLocalizedDataEntries }
     * 
     * 
     */
    public List<CTSiteLocalizedDataEntries> getLocalizedDataEntries() {
        if (localizedDataEntries == null) {
            localizedDataEntries = new ArrayList<CTSiteLocalizedDataEntries>();
        }
        return this.localizedDataEntries;
    }

    /**
     * Gets the value of the siteFormatAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteFormatAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteFormatAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTSiteFormatAssociations }
     * 
     * 
     */
    public List<CTSiteFormatAssociations> getSiteFormatAssociations() {
        if (siteFormatAssociations == null) {
            siteFormatAssociations = new ArrayList<CTSiteFormatAssociations>();
        }
        return this.siteFormatAssociations;
    }

    /**
     * Gets the value of the segmentProfileAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link CTSegmentProfileAssociations }
     *     
     */
    public CTSegmentProfileAssociations getSegmentProfileAssociations() {
        return segmentProfileAssociations;
    }

    /**
     * Sets the value of the segmentProfileAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTSegmentProfileAssociations }
     *     
     */
    public void setSegmentProfileAssociations(CTSegmentProfileAssociations value) {
        this.segmentProfileAssociations = value;
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
