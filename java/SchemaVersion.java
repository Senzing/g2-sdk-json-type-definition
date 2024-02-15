// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SchemaVersion {
    @JsonProperty("ENGINE_SCHEMA_VERSION")
    private String engineSchemaVersion;

    @JsonProperty("MAXIMUM_REQUIRED_SCHEMA_VERSION")
    private String maximumRequiredSchemaVersion;

    @JsonProperty("MINIMUM_REQUIRED_SCHEMA_VERSION")
    private String minimumRequiredSchemaVersion;

    public SchemaVersion() {
    }

    /**
     * Getter for engineSchemaVersion.<p>
     */
    public String getEngineSchemaVersion() {
        return engineSchemaVersion;
    }

    /**
     * Setter for engineSchemaVersion.<p>
     */
    public void setEngineSchemaVersion(String engineSchemaVersion) {
        this.engineSchemaVersion = engineSchemaVersion;
    }

    /**
     * Getter for maximumRequiredSchemaVersion.<p>
     */
    public String getMaximumRequiredSchemaVersion() {
        return maximumRequiredSchemaVersion;
    }

    /**
     * Setter for maximumRequiredSchemaVersion.<p>
     */
    public void setMaximumRequiredSchemaVersion(String maximumRequiredSchemaVersion) {
        this.maximumRequiredSchemaVersion = maximumRequiredSchemaVersion;
    }

    /**
     * Getter for minimumRequiredSchemaVersion.<p>
     */
    public String getMinimumRequiredSchemaVersion() {
        return minimumRequiredSchemaVersion;
    }

    /**
     * Setter for minimumRequiredSchemaVersion.<p>
     */
    public void setMinimumRequiredSchemaVersion(String minimumRequiredSchemaVersion) {
        this.minimumRequiredSchemaVersion = minimumRequiredSchemaVersion;
    }
}
