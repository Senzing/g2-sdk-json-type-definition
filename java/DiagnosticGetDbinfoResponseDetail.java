// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class DiagnosticGetDbinfoResponseDetail {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Type")
    private String type;

    public DiagnosticGetDbinfoResponseDetail() {
    }

    /**
     * Getter for name.<p>
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.<p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for type.<p>
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for type.<p>
     */
    public void setType(String type) {
        this.type = type;
    }
}
