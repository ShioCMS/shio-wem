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
    "deploymentType",
    "placementPath",
    "description",
    "fileSourceName",
    "attribute",
    "channelAssociation",
    "assetExternalIdentifier",
    "assetExternalModDate",
    "furlName",
    "adhocReferences",
    "classification",
    "acl"
})
@XmlRootElement(name = "staticFile")
public class StaticFile {

    @XmlElement(required = true)
    protected String deploymentType;
    @XmlElement(required = true)
    protected String placementPath;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String fileSourceName;
    protected List<CTAttribute> attribute;
    protected CTChannelAssociation channelAssociation;
    protected String assetExternalIdentifier;
    protected String assetExternalModDate;
    protected String furlName;
    protected CTAdhocReferences adhocReferences;
    protected List<CTClassification> classification;
    protected CTAcl acl;
    @XmlAttribute(name = "publishDate")
    protected String publishDate;
    @XmlAttribute(name = "unpublishDate")
    protected String unpublishDate;
    @XmlAttribute(name = "locale")
    protected String locale;
    @XmlAttribute(name = "translationGroupId")
    protected String translationGroupId;
    @XmlAttribute(name = "sharableTranslation")
    protected Boolean sharableTranslation;
    @XmlAttribute(name = "vcmId")
    protected String vcmId;
    @XmlAttribute(name = "vcmStatus")
    protected String vcmStatus;
    @XmlAttribute(name = "vcmName")
    protected String vcmName;
    @XmlAttribute(name = "vcmLogicalPath")
    protected String vcmLogicalPath;

    /**
     * Gets the value of the deploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * Sets the value of the deploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentType(String value) {
        this.deploymentType = value;
    }

    /**
     * Gets the value of the placementPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementPath() {
        return placementPath;
    }

    /**
     * Sets the value of the placementPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementPath(String value) {
        this.placementPath = value;
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
     * Gets the value of the fileSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSourceName() {
        return fileSourceName;
    }

    /**
     * Sets the value of the fileSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSourceName(String value) {
        this.fileSourceName = value;
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
     * Gets the value of the channelAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link CTChannelAssociation }
     *     
     */
    public CTChannelAssociation getChannelAssociation() {
        return channelAssociation;
    }

    /**
     * Sets the value of the channelAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTChannelAssociation }
     *     
     */
    public void setChannelAssociation(CTChannelAssociation value) {
        this.channelAssociation = value;
    }

    /**
     * Gets the value of the assetExternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetExternalIdentifier() {
        return assetExternalIdentifier;
    }

    /**
     * Sets the value of the assetExternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetExternalIdentifier(String value) {
        this.assetExternalIdentifier = value;
    }

    /**
     * Gets the value of the assetExternalModDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetExternalModDate() {
        return assetExternalModDate;
    }

    /**
     * Sets the value of the assetExternalModDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetExternalModDate(String value) {
        this.assetExternalModDate = value;
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
     * Gets the value of the unpublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnpublishDate() {
        return unpublishDate;
    }

    /**
     * Sets the value of the unpublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnpublishDate(String value) {
        this.unpublishDate = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the translationGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationGroupId() {
        return translationGroupId;
    }

    /**
     * Sets the value of the translationGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationGroupId(String value) {
        this.translationGroupId = value;
    }

    /**
     * Gets the value of the sharableTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSharableTranslation() {
        if (sharableTranslation == null) {
            return false;
        } else {
            return sharableTranslation;
        }
    }

    /**
     * Sets the value of the sharableTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharableTranslation(Boolean value) {
        this.sharableTranslation = value;
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
