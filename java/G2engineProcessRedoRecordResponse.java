// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineProcessRedoRecordResponse {
    @JsonValue
    private FixmeUnknown value;

    public G2engineProcessRedoRecordResponse() {
    }

    @JsonCreator
    public G2engineProcessRedoRecordResponse(FixmeUnknown value) {
        this.value = value;
    }

    public FixmeUnknown getValue() {
        return value;
    }

    public void setValue(FixmeUnknown value) {
        this.value = value;
    }
}
