// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class EngineWhyRecordsV2response {
    @JsonValue
    private WhyRecords value;

    public EngineWhyRecordsV2response() {
    }

    @JsonCreator
    public EngineWhyRecordsV2response(WhyRecords value) {
        this.value = value;
    }

    public WhyRecords getValue() {
        return value;
    }

    public void setValue(WhyRecords value) {
        this.value = value;
    }
}
