// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgDfbom {
    @JsonProperty("DFCALL_ID")
    private Integer dfcallId;

    @JsonProperty("EXEC_ORDER")
    private Integer execOrder;

    @JsonProperty("FELEM_ID")
    private Integer felemId;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    public CfgDfbom() {
    }

    /**
     * Getter for dfcallId.<p>
     */
    public Integer getDfcallId() {
        return dfcallId;
    }

    /**
     * Setter for dfcallId.<p>
     */
    public void setDfcallId(Integer dfcallId) {
        this.dfcallId = dfcallId;
    }

    /**
     * Getter for execOrder.<p>
     */
    public Integer getExecOrder() {
        return execOrder;
    }

    /**
     * Setter for execOrder.<p>
     */
    public void setExecOrder(Integer execOrder) {
        this.execOrder = execOrder;
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
     * Getter for ftypeId.<p>
     */
    public Integer getFtypeId() {
        return ftypeId;
    }

    /**
     * Setter for ftypeId.<p>
     */
    public void setFtypeId(Integer ftypeId) {
        this.ftypeId = ftypeId;
    }
}
