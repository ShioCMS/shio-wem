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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configNodeType", propOrder = {
    "inclusion",
    "variable",
    "node"
})
@XmlSeeAlso({
    ConfigRootNodeType.class,
    ConfigChildNodeType.class
})
public abstract class ConfigNodeType {

    protected List<InclusionType> inclusion;
    protected List<ConfigVariableType> variable;
    protected List<ConfigChildNodeType> node;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "state")
    protected String state;
    @XmlAttribute(name = "processNode")
    protected Boolean processNode;
    @XmlAttribute(name = "productNode")
    protected Boolean productNode;
    @XmlAttribute(name = "productState")
    protected String productState;

    /**
     * Gets the value of the inclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InclusionType }
     * 
     * 
     */
    public List<InclusionType> getInclusion() {
        if (inclusion == null) {
            inclusion = new ArrayList<InclusionType>();
        }
        return this.inclusion;
    }

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigVariableType }
     * 
     * 
     */
    public List<ConfigVariableType> getVariable() {
        if (variable == null) {
            variable = new ArrayList<ConfigVariableType>();
        }
        return this.variable;
    }

    /**
     * Gets the value of the node property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigChildNodeType }
     * 
     * 
     */
    public List<ConfigChildNodeType> getNode() {
        if (node == null) {
            node = new ArrayList<ConfigChildNodeType>();
        }
        return this.node;
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
     * Gets the value of the processNode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProcessNode() {
        if (processNode == null) {
            return false;
        } else {
            return processNode;
        }
    }

    /**
     * Sets the value of the processNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessNode(Boolean value) {
        this.processNode = value;
    }

    /**
     * Gets the value of the productNode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProductNode() {
        if (productNode == null) {
            return false;
        } else {
            return productNode;
        }
    }

    /**
     * Sets the value of the productNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductNode(Boolean value) {
        this.productNode = value;
    }

    /**
     * Gets the value of the productState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductState() {
        return productState;
    }

    /**
     * Sets the value of the productState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductState(String value) {
        this.productState = value;
    }

}
