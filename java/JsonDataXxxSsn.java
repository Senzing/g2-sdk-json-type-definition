// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class JsonDataXxxSsn {
    @JsonProperty("PASSPORT_NUMBER")
    private String passportNumber;

    @JsonProperty("SSN_NUMBER")
    private String ssnNumber;

    public JsonDataXxxSsn() {
    }

    /**
     * Getter for passportNumber.<p>
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Setter for passportNumber.<p>
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    /**
     * Getter for ssnNumber.<p>
     */
    public String getSsnNumber() {
        return ssnNumber;
    }

    /**
     * Setter for ssnNumber.<p>
     */
    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }
}
