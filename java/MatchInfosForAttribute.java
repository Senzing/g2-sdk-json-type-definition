// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public class MatchInfosForAttribute {
    @JsonValue
    private List<MatchInfoForAttribute> value;

    public MatchInfosForAttribute() {
    }

    @JsonCreator
    public MatchInfosForAttribute(List<MatchInfoForAttribute> value) {
        this.value = value;
    }

    public List<MatchInfoForAttribute> getValue() {
        return value;
    }

    public void setValue(List<MatchInfoForAttribute> value) {
        this.value = value;
    }
}
