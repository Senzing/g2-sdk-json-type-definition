// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2diagnosticGetFeatureResponseElements {
    @JsonProperty("FELEM_CODE")
    private String felemCode;

    @JsonProperty("FELEM_VALUE")
    private String felemValue;

    public G2diagnosticGetFeatureResponseElements() {
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
     * Getter for felemValue.<p>
     */
    public String getFelemValue() {
        return felemValue;
    }

    /**
     * Setter for felemValue.<p>
     */
    public void setFelemValue(String felemValue) {
        this.felemValue = felemValue;
    }
}
