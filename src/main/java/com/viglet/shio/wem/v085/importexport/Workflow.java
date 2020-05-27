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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "description",
    "projectPath",
    "markedForDelete",
    "escalationHandler",
    "editorStyle",
    "acl"
})
@XmlRootElement(name = "workflow")
public class Workflow {

    protected String name;
    protected String description;
    protected String projectPath;
    protected Boolean markedForDelete;
    protected CTId escalationHandler;
    protected String editorStyle;
    protected CTAcl acl;
    @XmlAttribute(name = "vcmId")
    protected String vcmId;

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
     * Gets the value of the projectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPath() {
        return projectPath;
    }

    /**
     * Sets the value of the projectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPath(String value) {
        this.projectPath = value;
    }

    /**
     * Gets the value of the markedForDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkedForDelete() {
        return markedForDelete;
    }

    /**
     * Sets the value of the markedForDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedForDelete(Boolean value) {
        this.markedForDelete = value;
    }

    /**
     * Gets the value of the escalationHandler property.
     * 
     * @return
     *     possible object is
     *     {@link CTId }
     *     
     */
    public CTId getEscalationHandler() {
        return escalationHandler;
    }

    /**
     * Sets the value of the escalationHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTId }
     *     
     */
    public void setEscalationHandler(CTId value) {
        this.escalationHandler = value;
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

}
