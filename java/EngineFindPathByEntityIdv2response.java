// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class EngineFindPathByEntityIdv2response {
    @JsonValue
    private Path value;

    public EngineFindPathByEntityIdv2response() {
    }

    @JsonCreator
    public EngineFindPathByEntityIdv2response(Path value) {
        this.value = value;
    }

    public Path getValue() {
        return value;
    }

    public void setValue(Path value) {
        this.value = value;
    }
}
