// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

@JsonSerialize
public class SearchSearchStatisticsCandidateKeys {
    @JsonProperty("FEATURE_TYPES")
    private List<SearchSearchStatisticsCandidateKeysFeatureTypes> featureTypes;

    @JsonProperty("SUMMARY")
    private SearchSearchStatisticsCandidateKeysSummary summary;

    public SearchSearchStatisticsCandidateKeys() {
    }

    /**
     * Getter for featureTypes.<p>
     */
    public List<SearchSearchStatisticsCandidateKeysFeatureTypes> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * Setter for featureTypes.<p>
     */
    public void setFeatureTypes(List<SearchSearchStatisticsCandidateKeysFeatureTypes> featureTypes) {
        this.featureTypes = featureTypes;
    }

    /**
     * Getter for summary.<p>
     */
    public SearchSearchStatisticsCandidateKeysSummary getSummary() {
        return summary;
    }

    /**
     * Setter for summary.<p>
     */
    public void setSummary(SearchSearchStatisticsCandidateKeysSummary summary) {
        this.summary = summary;
    }
}
