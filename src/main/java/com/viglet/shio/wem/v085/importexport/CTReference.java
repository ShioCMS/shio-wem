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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_reference", propOrder = {
    "deletionPolicyValue",
    "demotionPolicyValue",
    "exportPolicyValue",
    "keyCount",
    "promotionPolicyValue",
    "referencedContentTypeId",
    "referenceTypeValue",
    "snapshotPolicyValue",
    "key"
})
public class CTReference {

    @XmlElement(required = true)
    protected BigInteger deletionPolicyValue;
    @XmlElement(required = true)
    protected BigInteger demotionPolicyValue;
    @XmlElement(required = true)
    protected BigInteger exportPolicyValue;
    @XmlElement(required = true)
    protected BigInteger keyCount;
    @XmlElement(required = true)
    protected BigInteger promotionPolicyValue;
    @XmlElement(required = true)
    protected CTId referencedContentTypeId;
    @XmlElement(required = true)
    protected BigInteger referenceTypeValue;
    @XmlElement(required = true)
    protected BigInteger snapshotPolicyValue;
    @XmlElement(required = true)
    protected List<CTKey> key;
    @XmlAttribute(name = "mgmtId")
    protected String mgmtId;

    /**
     * Gets the value of the deletionPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeletionPolicyValue() {
        return deletionPolicyValue;
    }

    /**
     * Sets the value of the deletionPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeletionPolicyValue(BigInteger value) {
        this.deletionPolicyValue = value;
    }

    /**
     * Gets the value of the demotionPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDemotionPolicyValue() {
        return demotionPolicyValue;
    }

    /**
     * Sets the value of the demotionPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDemotionPolicyValue(BigInteger value) {
        this.demotionPolicyValue = value;
    }

    /**
     * Gets the value of the exportPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExportPolicyValue() {
        return exportPolicyValue;
    }

    /**
     * Sets the value of the exportPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExportPolicyValue(BigInteger value) {
        this.exportPolicyValue = value;
    }

    /**
     * Gets the value of the keyCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeyCount() {
        return keyCount;
    }

    /**
     * Sets the value of the keyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeyCount(BigInteger value) {
        this.keyCount = value;
    }

    /**
     * Gets the value of the promotionPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPromotionPolicyValue() {
        return promotionPolicyValue;
    }

    /**
     * Sets the value of the promotionPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPromotionPolicyValue(BigInteger value) {
        this.promotionPolicyValue = value;
    }

    /**
     * Gets the value of the referencedContentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getReferencedContentTypeId() {
        return referencedContentTypeId;
    }

    /**
     * Sets the value of the referencedContentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setReferencedContentTypeId(CTId value) {
        this.referencedContentTypeId = value;
    }

    /**
     * Gets the value of the referenceTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceTypeValue() {
        return referenceTypeValue;
    }

    /**
     * Sets the value of the referenceTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceTypeValue(BigInteger value) {
        this.referenceTypeValue = value;
    }

    /**
     * Gets the value of the snapshotPolicyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSnapshotPolicyValue() {
        return snapshotPolicyValue;
    }

    /**
     * Sets the value of the snapshotPolicyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSnapshotPolicyValue(BigInteger value) {
        this.snapshotPolicyValue = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTKey }
     * 
     * 
     */
    public List<CTKey> getKey() {
        if (key == null) {
            key = new ArrayList<CTKey>();
        }
        return this.key;
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
