// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SearchResolvedEntities {
    @JsonProperty("ENTITY")
    private SearchResolvedEntitiesEntity entity;

    @JsonProperty("MATCH_INFO")
    private MatchInfo matchInfo;

    public SearchResolvedEntities() {
    }

    /**
     * Getter for entity.<p>
     */
    public SearchResolvedEntitiesEntity getEntity() {
        return entity;
    }

    /**
     * Setter for entity.<p>
     */
    public void setEntity(SearchResolvedEntitiesEntity entity) {
        this.entity = entity;
    }

    /**
     * Getter for matchInfo.<p>
     */
    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    /**
     * Setter for matchInfo.<p>
     */
    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }
}
