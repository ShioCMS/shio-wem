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
    "displayName",
    "description",
    "iconPath",
    "defaultLogicalPath",
    "siteAffinity",
    "workflowCreateId",
    "workflowEditId",
    "javaClassName",
    "eligibilitiesClassName",
    "dataSourceLabel",
    "userApplURL",
    "editorStyle",
    "smallIconPath",
    "largeIconPath",
    "defaultThumbnailPath",
    "wrapperSpec",
    "multilingual",
    "mlInstanceDefault",
    "mlSetFolder",
    "mlCustomFolderClassName",
    "mlShareCategories",
    "mlShareChannels",
    "mlShareSchedules",
    "workflowTranslateId",
    "attribute",
    "relation",
    "adhocReferences",
    "classification",
    "acl"
})
@XmlRootElement(name = "objectType")
public class ObjectType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String displayName;
    protected String description;
    protected String iconPath;
    @XmlElement(required = true)
    protected String defaultLogicalPath;
    protected boolean siteAffinity;
    protected CTId workflowCreateId;
    protected CTId workflowEditId;
    protected String javaClassName;
    protected String eligibilitiesClassName;
    protected String dataSourceLabel;
    protected String userApplURL;
    protected String editorStyle;
    protected String smallIconPath;
    protected String largeIconPath;
    protected String defaultThumbnailPath;
    protected String wrapperSpec;
    protected Boolean multilingual;
    protected Boolean mlInstanceDefault;
    protected String mlSetFolder;
    protected String mlCustomFolderClassName;
    protected Boolean mlShareCategories;
    protected Boolean mlShareChannels;
    protected Boolean mlShareSchedules;
    protected CTId workflowTranslateId;
    protected List<CTAttribute> attribute;
    protected List<CTRelation> relation;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
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
     * Gets the value of the iconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * Sets the value of the iconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPath(String value) {
        this.iconPath = value;
    }

    /**
     * Gets the value of the defaultLogicalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLogicalPath() {
        return defaultLogicalPath;
    }

    /**
     * Sets the value of the defaultLogicalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLogicalPath(String value) {
        this.defaultLogicalPath = value;
    }

    /**
     * Gets the value of the siteAffinity property.
     * 
     */
    public boolean isSiteAffinity() {
        return siteAffinity;
    }

    /**
     * Sets the value of the siteAffinity property.
     * 
     */
    public void setSiteAffinity(boolean value) {
        this.siteAffinity = value;
    }

    /**
     * Gets the value of the workflowCreateId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getWorkflowCreateId() {
        return workflowCreateId;
    }

    /**
     * Sets the value of the workflowCreateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setWorkflowCreateId(CTId value) {
        this.workflowCreateId = value;
    }

    /**
     * Gets the value of the workflowEditId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getWorkflowEditId() {
        return workflowEditId;
    }

    /**
     * Sets the value of the workflowEditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setWorkflowEditId(CTId value) {
        this.workflowEditId = value;
    }

    /**
     * Gets the value of the javaClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaClassName() {
        return javaClassName;
    }

    /**
     * Sets the value of the javaClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaClassName(String value) {
        this.javaClassName = value;
    }

    /**
     * Gets the value of the eligibilitiesClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilitiesClassName() {
        return eligibilitiesClassName;
    }

    /**
     * Sets the value of the eligibilitiesClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilitiesClassName(String value) {
        this.eligibilitiesClassName = value;
    }

    /**
     * Gets the value of the dataSourceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceLabel() {
        return dataSourceLabel;
    }

    /**
     * Sets the value of the dataSourceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceLabel(String value) {
        this.dataSourceLabel = value;
    }

    /**
     * Gets the value of the userApplURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserApplURL() {
        return userApplURL;
    }

    /**
     * Sets the value of the userApplURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserApplURL(String value) {
        this.userApplURL = value;
    }

    /**
     * Gets the value of the editorStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorStyle() {
        return editorStyle;
    }

    /**
     * Sets the value of the editorStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorStyle(String value) {
        this.editorStyle = value;
    }

    /**
     * Gets the value of the smallIconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallIconPath() {
        return smallIconPath;
    }

    /**
     * Sets the value of the smallIconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallIconPath(String value) {
        this.smallIconPath = value;
    }

    /**
     * Gets the value of the largeIconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeIconPath() {
        return largeIconPath;
    }

    /**
     * Sets the value of the largeIconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeIconPath(String value) {
        this.largeIconPath = value;
    }

    /**
     * Gets the value of the defaultThumbnailPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultThumbnailPath() {
        return defaultThumbnailPath;
    }

    /**
     * Sets the value of the defaultThumbnailPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultThumbnailPath(String value) {
        this.defaultThumbnailPath = value;
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
     * Gets the value of the multilingual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultilingual() {
        return multilingual;
    }

    /**
     * Sets the value of the multilingual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultilingual(Boolean value) {
        this.multilingual = value;
    }

    /**
     * Gets the value of the mlInstanceDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlInstanceDefault() {
        return mlInstanceDefault;
    }

    /**
     * Sets the value of the mlInstanceDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMlInstanceDefault(Boolean value) {
        this.mlInstanceDefault = value;
    }

    /**
     * Gets the value of the mlSetFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlSetFolder() {
        return mlSetFolder;
    }

    /**
     * Sets the value of the mlSetFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlSetFolder(String value) {
        this.mlSetFolder = value;
    }

    /**
     * Gets the value of the mlCustomFolderClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlCustomFolderClassName() {
        return mlCustomFolderClassName;
    }

    /**
     * Sets the value of the mlCustomFolderClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlCustomFolderClassName(String value) {
        this.mlCustomFolderClassName = value;
    }

    /**
     * Gets the value of the mlShareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlShareCategories() {
        return mlShareCategories;
    }

    /**
     * Sets the value of the mlShareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMlShareCategories(Boolean value) {
        this.mlShareCategories = value;
    }

    /**
     * Gets the value of the mlShareChannels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlShareChannels() {
        return mlShareChannels;
    }

    /**
     * Sets the value of the mlShareChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMlShareChannels(Boolean value) {
        this.mlShareChannels = value;
    }

    /**
     * Gets the value of the mlShareSchedules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlShareSchedules() {
        return mlShareSchedules;
    }

    /**
     * Sets the value of the mlShareSchedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMlShareSchedules(Boolean value) {
        this.mlShareSchedules = value;
    }

    /**
     * Gets the value of the workflowTranslateId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getWorkflowTranslateId() {
        return workflowTranslateId;
    }

    /**
     * Sets the value of the workflowTranslateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setWorkflowTranslateId(CTId value) {
        this.workflowTranslateId = value;
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
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTRelation }
     * 
     * 
     */
    public List<CTRelation> getRelation() {
        if (relation == null) {
            relation = new ArrayList<CTRelation>();
        }
        return this.relation;
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
