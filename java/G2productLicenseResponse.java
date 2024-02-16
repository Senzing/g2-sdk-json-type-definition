// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2productLicenseResponse {
    @JsonProperty("billing")
    private String billing;

    @JsonProperty("contract")
    private String contract;

    @JsonProperty("customer")
    private String customer;

    @JsonProperty("expireDate")
    private String expireDate;

    @JsonProperty("issueDate")
    private String issueDate;

    @JsonProperty("licenseLevel")
    private String licenseLevel;

    @JsonProperty("licenseType")
    private String licenseType;

    @JsonProperty("recordLimit")
    private Integer recordLimit;

    public G2productLicenseResponse() {
    }

    /**
     * Getter for billing.<p>
     */
    public String getBilling() {
        return billing;
    }

    /**
     * Setter for billing.<p>
     */
    public void setBilling(String billing) {
        this.billing = billing;
    }

    /**
     * Getter for contract.<p>
     */
    public String getContract() {
        return contract;
    }

    /**
     * Setter for contract.<p>
     */
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * Getter for customer.<p>
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Setter for customer.<p>
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Getter for expireDate.<p>
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Setter for expireDate.<p>
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * Getter for issueDate.<p>
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for issueDate.<p>
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for licenseLevel.<p>
     */
    public String getLicenseLevel() {
        return licenseLevel;
    }

    /**
     * Setter for licenseLevel.<p>
     */
    public void setLicenseLevel(String licenseLevel) {
        this.licenseLevel = licenseLevel;
    }

    /**
     * Getter for licenseType.<p>
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Setter for licenseType.<p>
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Getter for recordLimit.<p>
     */
    public Integer getRecordLimit() {
        return recordLimit;
    }

    /**
     * Setter for recordLimit.<p>
     */
    public void setRecordLimit(Integer recordLimit) {
        this.recordLimit = recordLimit;
    }
}
