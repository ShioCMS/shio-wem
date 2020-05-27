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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ConfigNode_QNAME = new QName("http://www.vignette.com/xmlschemas/importexport", "configNode");
    private final static QName _CTIdGetId_QNAME = new QName("http://www.vignette.com/xmlschemas/importexport", "getId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vignette.xmlschemas.importexport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Preferences }
     * 
     */
    public Preferences createPreferences() {
        return new Preferences();
    }

    /**
     * Create an instance of {@link ConfigVariableFlagSetType }
     * 
     */
    public ConfigVariableFlagSetType createConfigVariableFlagSetType() {
        return new ConfigVariableFlagSetType();
    }

    /**
     * Create an instance of {@link ConfigVariableType }
     * 
     */
    public ConfigVariableType createConfigVariableType() {
        return new ConfigVariableType();
    }

    /**
     * Create an instance of {@link CTPrefsMap }
     * 
     */
    public CTPrefsMap createCTPrefsMap() {
        return new CTPrefsMap();
    }

    /**
     * Create an instance of {@link CTSegmentProfileAssociations }
     * 
     */
    public CTSegmentProfileAssociations createCTSegmentProfileAssociations() {
        return new CTSegmentProfileAssociations();
    }

    /**
     * Create an instance of {@link CTSiteFormatAssociations }
     * 
     */
    public CTSiteFormatAssociations createCTSiteFormatAssociations() {
        return new CTSiteFormatAssociations();
    }

    /**
     * Create an instance of {@link CTSiteLocalizedDataEntries }
     * 
     */
    public CTSiteLocalizedDataEntries createCTSiteLocalizedDataEntries() {
        return new CTSiteLocalizedDataEntries();
    }

    /**
     * Create an instance of {@link CTChannelInactiveFormatAssociations }
     * 
     */
    public CTChannelInactiveFormatAssociations createCTChannelInactiveFormatAssociations() {
        return new CTChannelInactiveFormatAssociations();
    }

    /**
     * Create an instance of {@link CTChannelLocalizedDataEntries }
     * 
     */
    public CTChannelLocalizedDataEntries createCTChannelLocalizedDataEntries() {
        return new CTChannelLocalizedDataEntries();
    }

    /**
     * Create an instance of {@link CTId }
     * 
     */
    public CTId createCTId() {
        return new CTId();
    }

    /**
     * Create an instance of {@link CTAcl }
     * 
     */
    public CTAcl createCTAcl() {
        return new CTAcl();
    }

    /**
     * Create an instance of {@link CTAcl.Entry }
     * 
     */
    public CTAcl.Entry createCTAclEntry() {
        return new CTAcl.Entry();
    }

    /**
     * Create an instance of {@link CTAdhocReferences }
     * 
     */
    public CTAdhocReferences createCTAdhocReferences() {
        return new CTAdhocReferences();
    }

    /**
     * Create an instance of {@link CTAttribute }
     * 
     */
    public CTAttribute createCTAttribute() {
        return new CTAttribute();
    }

    /**
     * Create an instance of {@link ImportStaticFile }
     * 
     */
    public ImportStaticFile createImportStaticFile() {
        return new ImportStaticFile();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link StaticFile }
     * 
     */
    public StaticFile createStaticFile() {
        return new StaticFile();
    }

    /**
     * Create an instance of {@link CTChannelAssociation }
     * 
     */
    public CTChannelAssociation createCTChannelAssociation() {
        return new CTChannelAssociation();
    }

    /**
     * Create an instance of {@link CTClassification }
     * 
     */
    public CTClassification createCTClassification() {
        return new CTClassification();
    }

    /**
     * Create an instance of {@link Contents }
     * 
     */
    public Contents createContents() {
        return new Contents();
    }

    /**
     * Create an instance of {@link ImportContentInstance }
     * 
     */
    public ImportContentInstance createImportContentInstance() {
        return new ImportContentInstance();
    }

    /**
     * Create an instance of {@link ContentInstance }
     * 
     */
    public ContentInstance createContentInstance() {
        return new ContentInstance();
    }

    /**
     * Create an instance of {@link CTRelationInstance }
     * 
     */
    public CTRelationInstance createCTRelationInstance() {
        return new CTRelationInstance();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link CTRelation }
     * 
     */
    public CTRelation createCTRelation() {
        return new CTRelation();
    }

    /**
     * Create an instance of {@link ImportSiteContentType }
     * 
     */
    public ImportSiteContentType createImportSiteContentType() {
        return new ImportSiteContentType();
    }

    /**
     * Create an instance of {@link SiteContentType }
     * 
     */
    public SiteContentType createSiteContentType() {
        return new SiteContentType();
    }

    /**
     * Create an instance of {@link CTSiteContentTypeAssociation }
     * 
     */
    public CTSiteContentTypeAssociation createCTSiteContentTypeAssociation() {
        return new CTSiteContentTypeAssociation();
    }

    /**
     * Create an instance of {@link ProgramTask }
     * 
     */
    public ProgramTask createProgramTask() {
        return new ProgramTask();
    }

    /**
     * Create an instance of {@link ImportChannel }
     * 
     */
    public ImportChannel createImportChannel() {
        return new ImportChannel();
    }

    /**
     * Create an instance of {@link ImportWorkflow }
     * 
     */
    public ImportWorkflow createImportWorkflow() {
        return new ImportWorkflow();
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link AsLocale }
     * 
     */
    public AsLocale createAsLocale() {
        return new AsLocale();
    }

    /**
     * Create an instance of {@link ImportConfigNode }
     * 
     */
    public ImportConfigNode createImportConfigNode() {
        return new ImportConfigNode();
    }

    /**
     * Create an instance of {@link ConfigRootNodeType }
     * 
     */
    public ConfigRootNodeType createConfigRootNodeType() {
        return new ConfigRootNodeType();
    }

    /**
     * Create an instance of {@link ImportAsLocale }
     * 
     */
    public ImportAsLocale createImportAsLocale() {
        return new ImportAsLocale();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link ImportPreferences }
     * 
     */
    public ImportPreferences createImportPreferences() {
        return new ImportPreferences();
    }

    /**
     * Create an instance of {@link Preferences.Root }
     * 
     */
    public Preferences.Root createPreferencesRoot() {
        return new Preferences.Root();
    }

    /**
     * Create an instance of {@link ImportSite }
     * 
     */
    public ImportSite createImportSite() {
        return new ImportSite();
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new Site();
    }

    /**
     * Create an instance of {@link CTSiteStageAssociation }
     * 
     */
    public CTSiteStageAssociation createCTSiteStageAssociation() {
        return new CTSiteStageAssociation();
    }

    /**
     * Create an instance of {@link ImportObjectType }
     * 
     */
    public ImportObjectType createImportObjectType() {
        return new ImportObjectType();
    }

    /**
     * Create an instance of {@link ImportProject }
     * 
     */
    public ImportProject createImportProject() {
        return new ImportProject();
    }

    /**
     * Create an instance of {@link ImportProgramTask }
     * 
     */
    public ImportProgramTask createImportProgramTask() {
        return new ImportProgramTask();
    }

    /**
     * Create an instance of {@link PackageBody }
     * 
     */
    public PackageBody createPackageBody() {
        return new PackageBody();
    }

    /**
     * Create an instance of {@link ImportContentType }
     * 
     */
    public ImportContentType createImportContentType() {
        return new ImportContentType();
    }

    /**
     * Create an instance of {@link InclusionType }
     * 
     */
    public InclusionType createInclusionType() {
        return new InclusionType();
    }

    /**
     * Create an instance of {@link CTReference }
     * 
     */
    public CTReference createCTReference() {
        return new CTReference();
    }

    /**
     * Create an instance of {@link CTPrefsNode }
     * 
     */
    public CTPrefsNode createCTPrefsNode() {
        return new CTPrefsNode();
    }

    /**
     * Create an instance of {@link CTCapability }
     * 
     */
    public CTCapability createCTCapability() {
        return new CTCapability();
    }

    /**
     * Create an instance of {@link CTKey }
     * 
     */
    public CTKey createCTKey() {
        return new CTKey();
    }

    /**
     * Create an instance of {@link CTAttributeDefinitionData }
     * 
     */
    public CTAttributeDefinitionData createCTAttributeDefinitionData() {
        return new CTAttributeDefinitionData();
    }

    /**
     * Create an instance of {@link FlagType }
     * 
     */
    public FlagType createFlagType() {
        return new FlagType();
    }

    /**
     * Create an instance of {@link ConfigChildNodeType }
     * 
     */
    public ConfigChildNodeType createConfigChildNodeType() {
        return new ConfigChildNodeType();
    }

    /**
     * Create an instance of {@link ConfigVariableFlagSetType.Interpreter }
     * 
     */
    public ConfigVariableFlagSetType.Interpreter createConfigVariableFlagSetTypeInterpreter() {
        return new ConfigVariableFlagSetType.Interpreter();
    }

    /**
     * Create an instance of {@link ConfigVariableFlagSetType.RestartNeeded }
     * 
     */
    public ConfigVariableFlagSetType.RestartNeeded createConfigVariableFlagSetTypeRestartNeeded() {
        return new ConfigVariableFlagSetType.RestartNeeded();
    }

    /**
     * Create an instance of {@link ConfigVariableFlagSetType.Encrypted }
     * 
     */
    public ConfigVariableFlagSetType.Encrypted createConfigVariableFlagSetTypeEncrypted() {
        return new ConfigVariableFlagSetType.Encrypted();
    }

    /**
     * Create an instance of {@link ConfigVariableFlagSetType.ReadOnly }
     * 
     */
    public ConfigVariableFlagSetType.ReadOnly createConfigVariableFlagSetTypeReadOnly() {
        return new ConfigVariableFlagSetType.ReadOnly();
    }

    /**
     * Create an instance of {@link ConfigVariableType.Overridable }
     * 
     */
    public ConfigVariableType.Overridable createConfigVariableTypeOverridable() {
        return new ConfigVariableType.Overridable();
    }

    /**
     * Create an instance of {@link CTPrefsMap.Entry }
     * 
     */
    public CTPrefsMap.Entry createCTPrefsMapEntry() {
        return new CTPrefsMap.Entry();
    }

    /**
     * Create an instance of {@link CTSegmentProfileAssociations.SegmentProfileAssocData }
     * 
     */
    public CTSegmentProfileAssociations.SegmentProfileAssocData createCTSegmentProfileAssociationsSegmentProfileAssocData() {
        return new CTSegmentProfileAssociations.SegmentProfileAssocData();
    }

    /**
     * Create an instance of {@link CTSiteFormatAssociations.SiteFormatAssocData }
     * 
     */
    public CTSiteFormatAssociations.SiteFormatAssocData createCTSiteFormatAssociationsSiteFormatAssocData() {
        return new CTSiteFormatAssociations.SiteFormatAssocData();
    }

    /**
     * Create an instance of {@link CTSiteLocalizedDataEntries.LocalizedData }
     * 
     */
    public CTSiteLocalizedDataEntries.LocalizedData createCTSiteLocalizedDataEntriesLocalizedData() {
        return new CTSiteLocalizedDataEntries.LocalizedData();
    }

    /**
     * Create an instance of {@link CTChannelInactiveFormatAssociations.InactiveFormatAssocData }
     * 
     */
    public CTChannelInactiveFormatAssociations.InactiveFormatAssocData createCTChannelInactiveFormatAssociationsInactiveFormatAssocData() {
        return new CTChannelInactiveFormatAssociations.InactiveFormatAssocData();
    }

    /**
     * Create an instance of {@link CTChannelLocalizedDataEntries.LocalizedData }
     * 
     */
    public CTChannelLocalizedDataEntries.LocalizedData createCTChannelLocalizedDataEntriesLocalizedData() {
        return new CTChannelLocalizedDataEntries.LocalizedData();
    }

    /**
     * Create an instance of {@link CTId.GetId }
     * 
     */
    public CTId.GetId createCTIdGetId() {
        return new CTId.GetId();
    }

    /**
     * Create an instance of {@link CTAcl.Entry.Grants }
     * 
     */
    public CTAcl.Entry.Grants createCTAclEntryGrants() {
        return new CTAcl.Entry.Grants();
    }

    /**
     * Create an instance of {@link CTAcl.Entry.Revokes }
     * 
     */
    public CTAcl.Entry.Revokes createCTAclEntryRevokes() {
        return new CTAcl.Entry.Revokes();
    }

    /**
     * Create an instance of {@link CTAdhocReferences.AdhocReference }
     * 
     */
    public CTAdhocReferences.AdhocReference createCTAdhocReferencesAdhocReference() {
        return new CTAdhocReferences.AdhocReference();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueBLOB }
     * 
     */
    public CTAttribute.ValueBLOB createCTAttributeValueBLOB() {
        return new CTAttribute.ValueBLOB();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueBoolean }
     * 
     */
    public CTAttribute.ValueBoolean createCTAttributeValueBoolean() {
        return new CTAttribute.ValueBoolean();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueCLOB }
     * 
     */
    public CTAttribute.ValueCLOB createCTAttributeValueCLOB() {
        return new CTAttribute.ValueCLOB();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueCompoundReference }
     * 
     */
    public CTAttribute.ValueCompoundReference createCTAttributeValueCompoundReference() {
        return new CTAttribute.ValueCompoundReference();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueDate }
     * 
     */
    public CTAttribute.ValueDate createCTAttributeValueDate() {
        return new CTAttribute.ValueDate();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueDecimal }
     * 
     */
    public CTAttribute.ValueDecimal createCTAttributeValueDecimal() {
        return new CTAttribute.ValueDecimal();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueFilePath }
     * 
     */
    public CTAttribute.ValueFilePath createCTAttributeValueFilePath() {
        return new CTAttribute.ValueFilePath();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueGUID }
     * 
     */
    public CTAttribute.ValueGUID createCTAttributeValueGUID() {
        return new CTAttribute.ValueGUID();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueInt }
     * 
     */
    public CTAttribute.ValueInt createCTAttributeValueInt() {
        return new CTAttribute.ValueInt();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueNumerical }
     * 
     */
    public CTAttribute.ValueNumerical createCTAttributeValueNumerical() {
        return new CTAttribute.ValueNumerical();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueString }
     * 
     */
    public CTAttribute.ValueString createCTAttributeValueString() {
        return new CTAttribute.ValueString();
    }

    /**
     * Create an instance of {@link CTAttribute.ValueTinyInt }
     * 
     */
    public CTAttribute.ValueTinyInt createCTAttributeValueTinyInt() {
        return new CTAttribute.ValueTinyInt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigRootNodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vignette.com/xmlschemas/importexport", name = "configNode")
    public JAXBElement<ConfigRootNodeType> createConfigNode(ConfigRootNodeType value) {
        return new JAXBElement<ConfigRootNodeType>(_ConfigNode_QNAME, ConfigRootNodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTId.GetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vignette.com/xmlschemas/importexport", name = "getId", scope = CTId.class)
    public JAXBElement<CTId.GetId> createCTIdGetId(CTId.GetId value) {
        return new JAXBElement<CTId.GetId>(_CTIdGetId_QNAME, CTId.GetId.class, CTId.class, value);
    }

}
