// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class RecordSummaryElement {
    @JsonProperty("DATA_SOURCE")
    private String dataSource;

    @JsonProperty("FIRST_SEEN_DT")
    private String firstSeenDt;

    @JsonProperty("LAST_SEEN_DT")
    private String lastSeenDt;

    @JsonProperty("RECORD_COUNT")
    private Integer recordCount;

    public RecordSummaryElement() {
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
     * Getter for firstSeenDt.<p>
     */
    public String getFirstSeenDt() {
        return firstSeenDt;
    }

    /**
     * Setter for firstSeenDt.<p>
     */
    public void setFirstSeenDt(String firstSeenDt) {
        this.firstSeenDt = firstSeenDt;
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
     * Getter for recordCount.<p>
     */
    public Integer getRecordCount() {
        return recordCount;
    }

    /**
     * Setter for recordCount.<p>
     */
    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }
}
