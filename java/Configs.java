// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public class Configs {
    @JsonValue
    private List<Config> value;

    public Configs() {
    }

    @JsonCreator
    public Configs(List<Config> value) {
        this.value = value;
    }

    public List<Config> getValue() {
        return value;
    }

    public void setValue(List<Config> value) {
        this.value = value;
    }
}
