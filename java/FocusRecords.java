// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public class FocusRecords {
    @JsonValue
    private List<FocusRecord> value;

    public FocusRecords() {
    }

    @JsonCreator
    public FocusRecords(List<FocusRecord> value) {
        this.value = value;
    }

    public List<FocusRecord> getValue() {
        return value;
    }

    public void setValue(List<FocusRecord> value) {
        this.value = value;
    }
}
