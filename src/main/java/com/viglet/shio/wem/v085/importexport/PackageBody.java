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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delete",
    "importConfigNode",
    "importPreferences",
    "importProject",
    "importProgramTask",
    "importWorkflow",
    "importObjectType",
    "importSite",
    "importChannel",
    "importStaticFile",
    "importAsLocale",
    "importContentType",
    "importSiteContentType",
    "importContentInstance"
})
@XmlRootElement(name = "packageBody")
public class PackageBody {

    protected List<Delete> delete;
    protected List<ImportConfigNode> importConfigNode;
    protected List<ImportPreferences> importPreferences;
    protected List<ImportProject> importProject;
    protected List<ImportProgramTask> importProgramTask;
    protected List<ImportWorkflow> importWorkflow;
    protected List<ImportObjectType> importObjectType;
    protected List<ImportSite> importSite;
    protected List<ImportChannel> importChannel;
    protected List<ImportStaticFile> importStaticFile;
    protected List<ImportAsLocale> importAsLocale;
    protected List<ImportContentType> importContentType;
    protected List<ImportSiteContentType> importSiteContentType;
    protected List<ImportContentInstance> importContentInstance;
    @XmlAttribute(name = "description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;

    /**
     * Gets the value of the delete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Delete }
     * 
     * 
     */
    public List<Delete> getDelete() {
        if (delete == null) {
            delete = new ArrayList<Delete>();
        }
        return this.delete;
    }

    /**
     * Gets the value of the importConfigNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importConfigNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportConfigNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportConfigNode }
     * 
     * 
     */
    public List<ImportConfigNode> getImportConfigNode() {
        if (importConfigNode == null) {
            importConfigNode = new ArrayList<ImportConfigNode>();
        }
        return this.importConfigNode;
    }

    /**
     * Gets the value of the importPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPreferences }
     * 
     * 
     */
    public List<ImportPreferences> getImportPreferences() {
        if (importPreferences == null) {
            importPreferences = new ArrayList<ImportPreferences>();
        }
        return this.importPreferences;
    }

    /**
     * Gets the value of the importProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportProject }
     * 
     * 
     */
    public List<ImportProject> getImportProject() {
        if (importProject == null) {
            importProject = new ArrayList<ImportProject>();
        }
        return this.importProject;
    }

    /**
     * Gets the value of the importProgramTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importProgramTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportProgramTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportProgramTask }
     * 
     * 
     */
    public List<ImportProgramTask> getImportProgramTask() {
        if (importProgramTask == null) {
            importProgramTask = new ArrayList<ImportProgramTask>();
        }
        return this.importProgramTask;
    }

    /**
     * Gets the value of the importWorkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importWorkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportWorkflow }
     * 
     * 
     */
    public List<ImportWorkflow> getImportWorkflow() {
        if (importWorkflow == null) {
            importWorkflow = new ArrayList<ImportWorkflow>();
        }
        return this.importWorkflow;
    }

    /**
     * Gets the value of the importObjectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importObjectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportObjectType }
     * 
     * 
     */
    public List<ImportObjectType> getImportObjectType() {
        if (importObjectType == null) {
            importObjectType = new ArrayList<ImportObjectType>();
        }
        return this.importObjectType;
    }

    /**
     * Gets the value of the importSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSite }
     * 
     * 
     */
    public List<ImportSite> getImportSite() {
        if (importSite == null) {
            importSite = new ArrayList<ImportSite>();
        }
        return this.importSite;
    }

    /**
     * Gets the value of the importChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportChannel }
     * 
     * 
     */
    public List<ImportChannel> getImportChannel() {
        if (importChannel == null) {
            importChannel = new ArrayList<ImportChannel>();
        }
        return this.importChannel;
    }

    /**
     * Gets the value of the importStaticFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importStaticFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportStaticFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportStaticFile }
     * 
     * 
     */
    public List<ImportStaticFile> getImportStaticFile() {
        if (importStaticFile == null) {
            importStaticFile = new ArrayList<ImportStaticFile>();
        }
        return this.importStaticFile;
    }

    /**
     * Gets the value of the importAsLocale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importAsLocale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportAsLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAsLocale }
     * 
     * 
     */
    public List<ImportAsLocale> getImportAsLocale() {
        if (importAsLocale == null) {
            importAsLocale = new ArrayList<ImportAsLocale>();
        }
        return this.importAsLocale;
    }

    /**
     * Gets the value of the importContentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importContentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportContentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportContentType }
     * 
     * 
     */
    public List<ImportContentType> getImportContentType() {
        if (importContentType == null) {
            importContentType = new ArrayList<ImportContentType>();
        }
        return this.importContentType;
    }

    /**
     * Gets the value of the importSiteContentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importSiteContentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportSiteContentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSiteContentType }
     * 
     * 
     */
    public List<ImportSiteContentType> getImportSiteContentType() {
        if (importSiteContentType == null) {
            importSiteContentType = new ArrayList<ImportSiteContentType>();
        }
        return this.importSiteContentType;
    }

    /**
     * Gets the value of the importContentInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importContentInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportContentInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportContentInstance }
     * 
     * 
     */
    public List<ImportContentInstance> getImportContentInstance() {
        if (importContentInstance == null) {
            importContentInstance = new ArrayList<ImportContentInstance>();
        }
        return this.importContentInstance;
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

}
