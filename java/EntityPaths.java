// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;

public class EntityPaths {
    @JsonValue
    private List<EntityPath> value;

    public EntityPaths() {
    }

    @JsonCreator
    public EntityPaths(List<EntityPath> value) {
        this.value = value;
    }

    public List<EntityPath> getValue() {
        return value;
    }

    public void setValue(List<EntityPath> value) {
        this.value = value;
    }
}
