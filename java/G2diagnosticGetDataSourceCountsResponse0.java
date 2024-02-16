// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2diagnosticGetDataSourceCountsResponse0 {
    @JsonProperty("DSRC_CODE")
    private String dsrcCode;

    @JsonProperty("DSRC_ID")
    private Integer dsrcId;

    @JsonProperty("DSRC_RECORD_COUNT")
    private Integer dsrcRecordCount;

    @JsonProperty("ETYPE_CODE")
    private String etypeCode;

    @JsonProperty("ETYPE_ID")
    private Integer etypeId;

    @JsonProperty("OBS_ENT_COUNT")
    private Integer obsEntCount;

    public G2diagnosticGetDataSourceCountsResponse0() {
    }

    /**
     * Getter for dsrcCode.<p>
     */
    public String getDsrcCode() {
        return dsrcCode;
    }

    /**
     * Setter for dsrcCode.<p>
     */
    public void setDsrcCode(String dsrcCode) {
        this.dsrcCode = dsrcCode;
    }

    /**
     * Getter for dsrcId.<p>
     */
    public Integer getDsrcId() {
        return dsrcId;
    }

    /**
     * Setter for dsrcId.<p>
     */
    public void setDsrcId(Integer dsrcId) {
        this.dsrcId = dsrcId;
    }

    /**
     * Getter for dsrcRecordCount.<p>
     */
    public Integer getDsrcRecordCount() {
        return dsrcRecordCount;
    }

    /**
     * Setter for dsrcRecordCount.<p>
     */
    public void setDsrcRecordCount(Integer dsrcRecordCount) {
        this.dsrcRecordCount = dsrcRecordCount;
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

    /**
     * Getter for obsEntCount.<p>
     */
    public Integer getObsEntCount() {
        return obsEntCount;
    }

    /**
     * Setter for obsEntCount.<p>
     */
    public void setObsEntCount(Integer obsEntCount) {
        this.obsEntCount = obsEntCount;
    }
}
