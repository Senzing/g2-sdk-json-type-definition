// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class G2engineHowEntityByEntityIdResponse {
    @JsonValue
    private How value;

    public G2engineHowEntityByEntityIdResponse() {
    }

    @JsonCreator
    public G2engineHowEntityByEntityIdResponse(How value) {
        this.value = value;
    }

    public How getValue() {
        return value;
    }

    public void setValue(How value) {
        this.value = value;
    }
}
