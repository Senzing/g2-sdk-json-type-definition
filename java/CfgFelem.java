// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgFelem {
    @JsonProperty("DATA_TYPE")
    private String dataType;

    @JsonProperty("FELEM_CODE")
    private String felemCode;

    @JsonProperty("FELEM_DESC")
    private String felemDesc;

    @JsonProperty("FELEM_ID")
    private Integer felemId;

    @JsonProperty("TOKENIZE")
    private String tokenize;

    public CfgFelem() {
    }

    /**
     * Getter for dataType.<p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter for dataType.<p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for felemCode.<p>
     */
    public String getFelemCode() {
        return felemCode;
    }

    /**
     * Setter for felemCode.<p>
     */
    public void setFelemCode(String felemCode) {
        this.felemCode = felemCode;
    }

    /**
     * Getter for felemDesc.<p>
     */
    public String getFelemDesc() {
        return felemDesc;
    }

    /**
     * Setter for felemDesc.<p>
     */
    public void setFelemDesc(String felemDesc) {
        this.felemDesc = felemDesc;
    }

    /**
     * Getter for felemId.<p>
     */
    public Integer getFelemId() {
        return felemId;
    }

    /**
     * Setter for felemId.<p>
     */
    public void setFelemId(Integer felemId) {
        this.felemId = felemId;
    }

    /**
     * Getter for tokenize.<p>
     */
    public String getTokenize() {
        return tokenize;
    }

    /**
     * Setter for tokenize.<p>
     */
    public void setTokenize(String tokenize) {
        this.tokenize = tokenize;
    }
}
