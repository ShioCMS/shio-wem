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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configVariableType", propOrder = {

})
public class ConfigVariableType {

    protected String runValue;
    protected String configValue;
    protected String revertValue;
    protected String defaultValue;
    protected ConfigVariableType.Overridable overridable;
    protected ConfigVariableFlagSetType flags;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "typeInfo")
    protected String typeInfo;

    /**
     * Gets the value of the runValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunValue() {
        return runValue;
    }

    /**
     * Sets the value of the runValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunValue(String value) {
        this.runValue = value;
    }

    /**
     * Gets the value of the configValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * Sets the value of the configValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigValue(String value) {
        this.configValue = value;
    }

    /**
     * Gets the value of the revertValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevertValue() {
        return revertValue;
    }

    /**
     * Sets the value of the revertValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevertValue(String value) {
        this.revertValue = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the overridable property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableType.Overridable }
     *     
     */
    public ConfigVariableType.Overridable getOverridable() {
        return overridable;
    }

    /**
     * Sets the value of the overridable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableType.Overridable }
     *     
     */
    public void setOverridable(ConfigVariableType.Overridable value) {
        this.overridable = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableFlagSetType }
     *     
     */
    public ConfigVariableFlagSetType getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableFlagSetType }
     *     
     */
    public void setFlags(ConfigVariableFlagSetType value) {
        this.flags = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeInfo() {
        return typeInfo;
    }

    /**
     * Sets the value of the typeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeInfo(String value) {
        this.typeInfo = value;
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
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Overridable {

        @XmlAttribute(name = "value")
        @XmlSchemaType(name = "anySimpleType")
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            if (value == null) {
                return "true";
            } else {
                return value;
            }
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
