// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineFindPathIncludingSourceByEntityIdv2response {
    @JsonValue
    private Path value;

    public G2engineFindPathIncludingSourceByEntityIdv2response() {
    }

    @JsonCreator
    public G2engineFindPathIncludingSourceByEntityIdv2response(Path value) {
        this.value = value;
    }

    public Path getValue() {
        return value;
    }

    public void setValue(Path value) {
        this.value = value;
    }
}
