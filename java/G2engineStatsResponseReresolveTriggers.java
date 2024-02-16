// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class G2engineStatsResponseReresolveTriggers {
    @JsonProperty("abortRetry")
    private Integer abortRetry;

    @JsonProperty("multipleResolvableCandidates")
    private Integer multipleResolvableCandidates;

    @JsonProperty("resolveNewFeatures")
    private Integer resolveNewFeatures;

    @JsonProperty("unresolveMovement")
    private Integer unresolveMovement;

    public G2engineStatsResponseReresolveTriggers() {
    }

    /**
     * Getter for abortRetry.<p>
     */
    public Integer getAbortRetry() {
        return abortRetry;
    }

    /**
     * Setter for abortRetry.<p>
     */
    public void setAbortRetry(Integer abortRetry) {
        this.abortRetry = abortRetry;
    }

    /**
     * Getter for multipleResolvableCandidates.<p>
     */
    public Integer getMultipleResolvableCandidates() {
        return multipleResolvableCandidates;
    }

    /**
     * Setter for multipleResolvableCandidates.<p>
     */
    public void setMultipleResolvableCandidates(Integer multipleResolvableCandidates) {
        this.multipleResolvableCandidates = multipleResolvableCandidates;
    }

    /**
     * Getter for resolveNewFeatures.<p>
     */
    public Integer getResolveNewFeatures() {
        return resolveNewFeatures;
    }

    /**
     * Setter for resolveNewFeatures.<p>
     */
    public void setResolveNewFeatures(Integer resolveNewFeatures) {
        this.resolveNewFeatures = resolveNewFeatures;
    }

    /**
     * Getter for unresolveMovement.<p>
     */
    public Integer getUnresolveMovement() {
        return unresolveMovement;
    }

    /**
     * Setter for unresolveMovement.<p>
     */
    public void setUnresolveMovement(Integer unresolveMovement) {
        this.unresolveMovement = unresolveMovement;
    }
}
