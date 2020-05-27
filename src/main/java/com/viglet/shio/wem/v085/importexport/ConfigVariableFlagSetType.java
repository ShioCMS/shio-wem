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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configVariableFlagSetType", propOrder = {

})
public class ConfigVariableFlagSetType {

    protected ConfigVariableFlagSetType.Interpreter interpreter;
    protected ConfigVariableFlagSetType.RestartNeeded restartNeeded;
    protected ConfigVariableFlagSetType.Encrypted encrypted;
    protected ConfigVariableFlagSetType.ReadOnly readOnly;
    @XmlAttribute(name = "bits")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] bits;

    /**
     * Gets the value of the interpreter property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableFlagSetType.Interpreter }
     *     
     */
    public ConfigVariableFlagSetType.Interpreter getInterpreter() {
        return interpreter;
    }

    /**
     * Sets the value of the interpreter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableFlagSetType.Interpreter }
     *     
     */
    public void setInterpreter(ConfigVariableFlagSetType.Interpreter value) {
        this.interpreter = value;
    }

    /**
     * Gets the value of the restartNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableFlagSetType.RestartNeeded }
     *     
     */
    public ConfigVariableFlagSetType.RestartNeeded getRestartNeeded() {
        return restartNeeded;
    }

    /**
     * Sets the value of the restartNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableFlagSetType.RestartNeeded }
     *     
     */
    public void setRestartNeeded(ConfigVariableFlagSetType.RestartNeeded value) {
        this.restartNeeded = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableFlagSetType.Encrypted }
     *     
     */
    public ConfigVariableFlagSetType.Encrypted getEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableFlagSetType.Encrypted }
     *     
     */
    public void setEncrypted(ConfigVariableFlagSetType.Encrypted value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigVariableFlagSetType.ReadOnly }
     *     
     */
    public ConfigVariableFlagSetType.ReadOnly getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigVariableFlagSetType.ReadOnly }
     *     
     */
    public void setReadOnly(ConfigVariableFlagSetType.ReadOnly value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the bits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getBits() {
        return bits;
    }

    /**
     * Sets the value of the bits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBits(byte[] value) {
        this.bits = value;
    }


    /**
     * Type which represents the "Encrypted" flag on a config variable.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.vignette.com/xmlschemas/importexport}flagType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="2" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="Encrypted" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Encrypted
        extends FlagType
    {


    }


    /**
     * Type which represents the "Interpreter" flag on a config variable.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.vignette.com/xmlschemas/importexport}flagType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="Interpreter" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Interpreter
        extends FlagType
    {


    }


    /**
     * Type which represents the "ReadOnly" flag on a config variable.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.vignette.com/xmlschemas/importexport}flagType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="3" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="ReadOnly" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReadOnly
        extends FlagType
    {


    }


    /**
     * Type which represents the "RestartNeeded" flag on a config variable.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.vignette.com/xmlschemas/importexport}flagType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" default="RestartNeeded" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RestartNeeded
        extends FlagType
    {


    }

}
