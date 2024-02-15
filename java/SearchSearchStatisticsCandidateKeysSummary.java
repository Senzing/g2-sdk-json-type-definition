// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SearchSearchStatisticsCandidateKeysSummary {
    @JsonProperty("FOUND")
    private Integer found;

    @JsonProperty("GENERIC")
    private Integer generic;

    @JsonProperty("NOT_FOUND")
    private Integer notFound;

    public SearchSearchStatisticsCandidateKeysSummary() {
    }

    /**
     * Getter for found.<p>
     */
    public Integer getFound() {
        return found;
    }

    /**
     * Setter for found.<p>
     */
    public void setFound(Integer found) {
        this.found = found;
    }

    /**
     * Getter for generic.<p>
     */
    public Integer getGeneric() {
        return generic;
    }

    /**
     * Setter for generic.<p>
     */
    public void setGeneric(Integer generic) {
        this.generic = generic;
    }

    /**
     * Getter for notFound.<p>
     */
    public Integer getNotFound() {
        return notFound;
    }

    /**
     * Setter for notFound.<p>
     */
    public void setNotFound(Integer notFound) {
        this.notFound = notFound;
    }
}
