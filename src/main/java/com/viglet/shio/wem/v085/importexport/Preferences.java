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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "root"
})
@XmlRootElement(name = "preferences")
public class Preferences {

    @XmlElement(required = true)
    protected Preferences.Root root;
    @XmlAttribute(name = "EXTERNAL_XML_VERSION")
    protected String externalxmlversion;

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences.Root }
     *     
     */
    public Preferences.Root getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences.Root }
     *     
     */
    public void setRoot(Preferences.Root value) {
        this.root = value;
    }

    /**
     * Gets the value of the externalxmlversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTERNALXMLVERSION() {
        if (externalxmlversion == null) {
            return "1.0";
        } else {
            return externalxmlversion;
        }
    }

    /**
     * Sets the value of the externalxmlversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTERNALXMLVERSION(String value) {
        this.externalxmlversion = value;
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
     *       &lt;sequence>
     *         &lt;element name="map" type="{http://www.vignette.com/xmlschemas/importexport}CT_prefsMap"/>
     *         &lt;element name="node" type="{http://www.vignette.com/xmlschemas/importexport}CT_prefsNode" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="system"/>
     *             &lt;enumeration value="user"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "map",
        "node"
    })
    public static class Root {

        @XmlElement(required = true)
        protected CTPrefsMap map;
        protected List<CTPrefsNode> node;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the map property.
         * 
         * @return
         *     possible object is
         *     {@link CTPrefsMap }
         *     
         */
        public CTPrefsMap getMap() {
            return map;
        }

        /**
         * Sets the value of the map property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTPrefsMap }
         *     
         */
        public void setMap(CTPrefsMap value) {
            this.map = value;
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
         * {@link CTPrefsNode }
         * 
         * 
         */
        public List<CTPrefsNode> getNode() {
            if (node == null) {
                node = new ArrayList<CTPrefsNode>();
            }
            return this.node;
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

    }

}
