// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class Record {
    @JsonProperty("ADDRESS_DATA")
    private List<String> addressData;

    @JsonProperty("ATTRIBUTE_DATA")
    private List<String> attributeData;

    @JsonProperty("DATA_SOURCE")
    private String dataSource;

    @JsonProperty("ENTITY_DATA")
    private List<String> entityData;

    @JsonProperty("ENTITY_DESC")
    private String entityDesc;

    @JsonProperty("ENTITY_KEY")
    private String entityKey;

    @JsonProperty("ENTITY_TYPE")
    private String entityType;

    @JsonProperty("ERRULE_CODE")
    private String erruleCode;

    @JsonProperty("FEATURES")
    private List<RecordFeatures> features;

    @JsonProperty("IDENTIFIER_DATA")
    private List<String> identifierData;

    @JsonProperty("INTERNAL_ID")
    private Integer internalId;

    @JsonProperty("JSON_DATA")
    private String jsonData;

    @JsonProperty("LAST_SEEN_DT")
    private String lastSeenDt;

    @JsonProperty("MATCH_KEY")
    private String matchKey;

    @JsonProperty("MATCH_LEVEL")
    private Integer matchLevel;

    @JsonProperty("MATCH_LEVEL_CODE")
    private String matchLevelCode;

    @JsonProperty("NAME_DATA")
    private List<String> nameData;

    @JsonProperty("OTHER_DATA")
    private List<String> otherData;

    @JsonProperty("PHONE_DATA")
    private List<String> phoneData;

    @JsonProperty("RECORD_ID")
    private String recordId;

    @JsonProperty("RELATIONSHIP_DATA")
    private List<String> relationshipData;

    public Record() {
    }

    /**
     * Getter for addressData.<p>
     */
    public List<String> getAddressData() {
        return addressData;
    }

    /**
     * Setter for addressData.<p>
     */
    public void setAddressData(List<String> addressData) {
        this.addressData = addressData;
    }

    /**
     * Getter for attributeData.<p>
     */
    public List<String> getAttributeData() {
        return attributeData;
    }

    /**
     * Setter for attributeData.<p>
     */
    public void setAttributeData(List<String> attributeData) {
        this.attributeData = attributeData;
    }

    /**
     * Getter for dataSource.<p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Setter for dataSource.<p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Getter for entityData.<p>
     */
    public List<String> getEntityData() {
        return entityData;
    }

    /**
     * Setter for entityData.<p>
     */
    public void setEntityData(List<String> entityData) {
        this.entityData = entityData;
    }

    /**
     * Getter for entityDesc.<p>
     */
    public String getEntityDesc() {
        return entityDesc;
    }

    /**
     * Setter for entityDesc.<p>
     */
    public void setEntityDesc(String entityDesc) {
        this.entityDesc = entityDesc;
    }

    /**
     * Getter for entityKey.<p>
     */
    public String getEntityKey() {
        return entityKey;
    }

    /**
     * Setter for entityKey.<p>
     */
    public void setEntityKey(String entityKey) {
        this.entityKey = entityKey;
    }

    /**
     * Getter for entityType.<p>
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Setter for entityType.<p>
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * Getter for erruleCode.<p>
     */
    public String getErruleCode() {
        return erruleCode;
    }

    /**
     * Setter for erruleCode.<p>
     */
    public void setErruleCode(String erruleCode) {
        this.erruleCode = erruleCode;
    }

    /**
     * Getter for features.<p>
     */
    public List<RecordFeatures> getFeatures() {
        return features;
    }

    /**
     * Setter for features.<p>
     */
    public void setFeatures(List<RecordFeatures> features) {
        this.features = features;
    }

    /**
     * Getter for identifierData.<p>
     */
    public List<String> getIdentifierData() {
        return identifierData;
    }

    /**
     * Setter for identifierData.<p>
     */
    public void setIdentifierData(List<String> identifierData) {
        this.identifierData = identifierData;
    }

    /**
     * Getter for internalId.<p>
     */
    public Integer getInternalId() {
        return internalId;
    }

    /**
     * Setter for internalId.<p>
     */
    public void setInternalId(Integer internalId) {
        this.internalId = internalId;
    }

    /**
     * Getter for jsonData.<p>
     */
    public String getJsonData() {
        return jsonData;
    }

    /**
     * Setter for jsonData.<p>
     */
    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    /**
     * Getter for lastSeenDt.<p>
     */
    public String getLastSeenDt() {
        return lastSeenDt;
    }

    /**
     * Setter for lastSeenDt.<p>
     */
    public void setLastSeenDt(String lastSeenDt) {
        this.lastSeenDt = lastSeenDt;
    }

    /**
     * Getter for matchKey.<p>
     */
    public String getMatchKey() {
        return matchKey;
    }

    /**
     * Setter for matchKey.<p>
     */
    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    /**
     * Getter for matchLevel.<p>
     */
    public Integer getMatchLevel() {
        return matchLevel;
    }

    /**
     * Setter for matchLevel.<p>
     */
    public void setMatchLevel(Integer matchLevel) {
        this.matchLevel = matchLevel;
    }

    /**
     * Getter for matchLevelCode.<p>
     */
    public String getMatchLevelCode() {
        return matchLevelCode;
    }

    /**
     * Setter for matchLevelCode.<p>
     */
    public void setMatchLevelCode(String matchLevelCode) {
        this.matchLevelCode = matchLevelCode;
    }

    /**
     * Getter for nameData.<p>
     */
    public List<String> getNameData() {
        return nameData;
    }

    /**
     * Setter for nameData.<p>
     */
    public void setNameData(List<String> nameData) {
        this.nameData = nameData;
    }

    /**
     * Getter for otherData.<p>
     */
    public List<String> getOtherData() {
        return otherData;
    }

    /**
     * Setter for otherData.<p>
     */
    public void setOtherData(List<String> otherData) {
        this.otherData = otherData;
    }

    /**
     * Getter for phoneData.<p>
     */
    public List<String> getPhoneData() {
        return phoneData;
    }

    /**
     * Setter for phoneData.<p>
     */
    public void setPhoneData(List<String> phoneData) {
        this.phoneData = phoneData;
    }

    /**
     * Getter for recordId.<p>
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Setter for recordId.<p>
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * Getter for relationshipData.<p>
     */
    public List<String> getRelationshipData() {
        return relationshipData;
    }

    /**
     * Setter for relationshipData.<p>
     */
    public void setRelationshipData(List<String> relationshipData) {
        this.relationshipData = relationshipData;
    }
}
