// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineFindPathExcludingByRecordIdResponse {
    @JsonValue
    private Path value;

    public G2engineFindPathExcludingByRecordIdResponse() {
    }

    @JsonCreator
    public G2engineFindPathExcludingByRecordIdResponse(Path value) {
        this.value = value;
    }

    public Path getValue() {
        return value;
    }

    public void setValue(Path value) {
        this.value = value;
    }
}
