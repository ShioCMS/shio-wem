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
@XmlType(name = "CT_channelInactiveFormatAssociations", propOrder = {
    "inactiveFormatAssocData"
})
public class CTChannelInactiveFormatAssociations {

    protected List<CTChannelInactiveFormatAssociations.InactiveFormatAssocData> inactiveFormatAssocData;

    /**
     * Gets the value of the inactiveFormatAssocData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inactiveFormatAssocData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInactiveFormatAssocData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTChannelInactiveFormatAssociations.InactiveFormatAssocData }
     * 
     * 
     */
    public List<CTChannelInactiveFormatAssociations.InactiveFormatAssocData> getInactiveFormatAssocData() {
        if (inactiveFormatAssocData == null) {
            inactiveFormatAssocData = new ArrayList<CTChannelInactiveFormatAssociations.InactiveFormatAssocData>();
        }
        return this.inactiveFormatAssocData;
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
     *         &lt;element name="formatId" type="{http://www.vignette.com/xmlschemas/importexport}CT_id"/>
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
        "formatId"
    })
    public static class InactiveFormatAssocData {

        @XmlElement(required = true)
        protected CTId formatId;

        /**
         * Gets the value of the formatId property.
         * 
         * @return
         *     possible object is
         *     {@link CTId }
         *     
         */
        public CTId getFormatId() {
            return formatId;
        }

        /**
         * Sets the value of the formatId property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTId }
         *     
         */
        public void setFormatId(CTId value) {
            this.formatId = value;
        }

    }

}
