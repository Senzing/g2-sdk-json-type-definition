// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ProcessUmfProc {
    @JsonProperty("NAME")
    private String name;

    @JsonProperty("RESULT")
    private String result;

    public ProcessUmfProc() {
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
     * Getter for result.<p>
     */
    public String getResult() {
        return result;
    }

    /**
     * Setter for result.<p>
     */
    public void setResult(String result) {
        this.result = result;
    }
}
