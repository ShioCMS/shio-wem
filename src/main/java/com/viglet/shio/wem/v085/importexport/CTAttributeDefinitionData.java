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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_attributeDefinitionData", propOrder = {
    "name",
    "displayName",
    "columnSource",
    "comment",
    "helpText",
    "language",
    "ordering",
    "extensibleOrdinal",
    "dataTypeValue",
    "required",
    "autoGen",
    "workflowRequired",
    "key",
    "searchable",
    "summary",
    "visible",
    "defaultLabel",
    "orderBy",
    "attributeTypeValue",
    "widgetName",
    "widgetData",
    "referencedAttributeDefinitionName",
    "beanPropertyName",
    "suppressBeanProperty",
    "groupSplit",
    "groupName",
    "toolTip",
    "filterable",
    "sharable",
    "translatable"
})
public class CTAttributeDefinitionData {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String columnSource;
    protected String comment;
    protected String helpText;
    protected String language;
    @XmlElement(required = true)
    protected BigInteger ordering;
    @XmlElement(required = true)
    protected BigInteger extensibleOrdinal;
    @XmlElement(required = true)
    protected BigInteger dataTypeValue;
    protected boolean required;
    protected boolean autoGen;
    protected boolean workflowRequired;
    protected boolean key;
    protected boolean searchable;
    protected boolean summary;
    protected boolean visible;
    protected boolean defaultLabel;
    protected boolean orderBy;
    @XmlElement(required = true)
    protected BigInteger attributeTypeValue;
    protected String widgetName;
    protected String widgetData;
    protected String referencedAttributeDefinitionName;
    protected String beanPropertyName;
    protected Boolean suppressBeanProperty;
    protected Boolean groupSplit;
    protected String groupName;
    protected String toolTip;
    protected Boolean filterable;
    protected Boolean sharable;
    protected Boolean translatable;
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
     * Gets the value of the columnSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnSource() {
        return columnSource;
    }

    /**
     * Sets the value of the columnSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnSource(String value) {
        this.columnSource = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the helpText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * Sets the value of the helpText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpText(String value) {
        this.helpText = value;
    }

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
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdering(BigInteger value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the extensibleOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtensibleOrdinal() {
        return extensibleOrdinal;
    }

    /**
     * Sets the value of the extensibleOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtensibleOrdinal(BigInteger value) {
        this.extensibleOrdinal = value;
    }

    /**
     * Gets the value of the dataTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataTypeValue() {
        return dataTypeValue;
    }

    /**
     * Sets the value of the dataTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataTypeValue(BigInteger value) {
        this.dataTypeValue = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the autoGen property.
     * 
     */
    public boolean isAutoGen() {
        return autoGen;
    }

    /**
     * Sets the value of the autoGen property.
     * 
     */
    public void setAutoGen(boolean value) {
        this.autoGen = value;
    }

    /**
     * Gets the value of the workflowRequired property.
     * 
     */
    public boolean isWorkflowRequired() {
        return workflowRequired;
    }

    /**
     * Sets the value of the workflowRequired property.
     * 
     */
    public void setWorkflowRequired(boolean value) {
        this.workflowRequired = value;
    }

    /**
     * Gets the value of the key property.
     * 
     */
    public boolean isKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(boolean value) {
        this.key = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     */
    public boolean isSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     */
    public void setSummary(boolean value) {
        this.summary = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the defaultLabel property.
     * 
     */
    public boolean isDefaultLabel() {
        return defaultLabel;
    }

    /**
     * Sets the value of the defaultLabel property.
     * 
     */
    public void setDefaultLabel(boolean value) {
        this.defaultLabel = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public boolean isOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(boolean value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the attributeTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttributeTypeValue() {
        return attributeTypeValue;
    }

    /**
     * Sets the value of the attributeTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttributeTypeValue(BigInteger value) {
        this.attributeTypeValue = value;
    }

    /**
     * Gets the value of the widgetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetName() {
        return widgetName;
    }

    /**
     * Sets the value of the widgetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetName(String value) {
        this.widgetName = value;
    }

    /**
     * Gets the value of the widgetData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetData() {
        return widgetData;
    }

    /**
     * Sets the value of the widgetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetData(String value) {
        this.widgetData = value;
    }

    /**
     * Gets the value of the referencedAttributeDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedAttributeDefinitionName() {
        return referencedAttributeDefinitionName;
    }

    /**
     * Sets the value of the referencedAttributeDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedAttributeDefinitionName(String value) {
        this.referencedAttributeDefinitionName = value;
    }

    /**
     * Gets the value of the beanPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeanPropertyName() {
        return beanPropertyName;
    }

    /**
     * Sets the value of the beanPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeanPropertyName(String value) {
        this.beanPropertyName = value;
    }

    /**
     * Gets the value of the suppressBeanProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressBeanProperty() {
        return suppressBeanProperty;
    }

    /**
     * Sets the value of the suppressBeanProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressBeanProperty(Boolean value) {
        this.suppressBeanProperty = value;
    }

    /**
     * Gets the value of the groupSplit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupSplit() {
        return groupSplit;
    }

    /**
     * Sets the value of the groupSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupSplit(Boolean value) {
        this.groupSplit = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the toolTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolTip() {
        return toolTip;
    }

    /**
     * Sets the value of the toolTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolTip(String value) {
        this.toolTip = value;
    }

    /**
     * Gets the value of the filterable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterable() {
        return filterable;
    }

    /**
     * Sets the value of the filterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterable(Boolean value) {
        this.filterable = value;
    }

    /**
     * Gets the value of the sharable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSharable() {
        return sharable;
    }

    /**
     * Sets the value of the sharable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSharable(Boolean value) {
        this.sharable = value;
    }

    /**
     * Gets the value of the translatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranslatable() {
        return translatable;
    }

    /**
     * Sets the value of the translatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranslatable(Boolean value) {
        this.translatable = value;
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
