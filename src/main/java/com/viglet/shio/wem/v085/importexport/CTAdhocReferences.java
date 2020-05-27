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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_adhocReferences", propOrder = {
    "adhocReference"
})
public class CTAdhocReferences {

    protected List<CTAdhocReferences.AdhocReference> adhocReference;

    /**
     * Gets the value of the adhocReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adhocReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdhocReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTAdhocReferences.AdhocReference }
     * 
     * 
     */
    public List<CTAdhocReferences.AdhocReference> getAdhocReference() {
        if (adhocReference == null) {
            adhocReference = new ArrayList<CTAdhocReferences.AdhocReference>();
        }
        return this.adhocReference;
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
     *         &lt;element name="referenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="referentId" type="{http://www.vignette.com/xmlschemas/importexport}CT_id"/>
     *         &lt;element name="metadata" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referenceName",
        "referentId",
        "metadata"
    })
    public static class AdhocReference {

        @XmlElement(required = true)
        protected String referenceName;
        @XmlElement(required = true)
        protected CTId referentId;
        @XmlElement(required = true)
        protected String metadata;

        /**
         * Gets the value of the referenceName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceName() {
            return referenceName;
        }

        /**
         * Sets the value of the referenceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceName(String value) {
            this.referenceName = value;
        }

        /**
         * Gets the value of the referentId property.
         * 
         * @return
         *     possible object is
         *     {@link CTId }
         *     
         */
        public CTId getReferentId() {
            return referentId;
        }

        /**
         * Sets the value of the referentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTId }
         *     
         */
        public void setReferentId(CTId value) {
            this.referentId = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadata(String value) {
            this.metadata = value;
        }

    }

}
