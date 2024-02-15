// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class CfgEtype {
    @JsonProperty("ECLASS_ID")
    private Integer eclassId;

    @JsonProperty("ETYPE_CODE")
    private String etypeCode;

    @JsonProperty("ETYPE_DESC")
    private String etypeDesc;

    @JsonProperty("ETYPE_ID")
    private Integer etypeId;

    public CfgEtype() {
    }

    /**
     * Getter for eclassId.<p>
     */
    public Integer getEclassId() {
        return eclassId;
    }

    /**
     * Setter for eclassId.<p>
     */
    public void setEclassId(Integer eclassId) {
        this.eclassId = eclassId;
    }

    /**
     * Getter for etypeCode.<p>
     */
    public String getEtypeCode() {
        return etypeCode;
    }

    /**
     * Setter for etypeCode.<p>
     */
    public void setEtypeCode(String etypeCode) {
        this.etypeCode = etypeCode;
    }

    /**
     * Getter for etypeDesc.<p>
     */
    public String getEtypeDesc() {
        return etypeDesc;
    }

    /**
     * Setter for etypeDesc.<p>
     */
    public void setEtypeDesc(String etypeDesc) {
        this.etypeDesc = etypeDesc;
    }

    /**
     * Getter for etypeId.<p>
     */
    public Integer getEtypeId() {
        return etypeId;
    }

    /**
     * Setter for etypeId.<p>
     */
    public void setEtypeId(Integer etypeId) {
        this.etypeId = etypeId;
    }
}
