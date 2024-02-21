// Code generated by jtd-codegen for Java + Jackson v0.2.1

package com.senzing.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SysOom {
    @JsonProperty("FELEM_ID")
    private Integer felemId;

    @JsonProperty("FTYPE_ID")
    private Integer ftypeId;

    @JsonProperty("LENS_ID")
    private Integer lensId;

    @JsonProperty("LIB_FEAT_ID")
    private Integer libFeatId;

    @JsonProperty("LIB_FELEM_ID")
    private Integer libFelemId;

    @JsonProperty("NEXT_THRESH")
    private Integer nextThresh;

    @JsonProperty("OOM_LEVEL")
    private String oomLevel;

    @JsonProperty("OOM_TYPE")
    private String oomType;

    @JsonProperty("THRESH1_CNT")
    private Integer thresh1Cnt;

    @JsonProperty("THRESH1_OOM")
    private Integer thresh1Oom;

    public SysOom() {
    }

    /**
     * Getter for felemId.<p>
     */
    public Integer getFelemId() {
        return felemId;
    }

    /**
     * Setter for felemId.<p>
     */
    public void setFelemId(Integer felemId) {
        this.felemId = felemId;
    }

    /**
     * Getter for ftypeId.<p>
     */
    public Integer getFtypeId() {
        return ftypeId;
    }

    /**
     * Setter for ftypeId.<p>
     */
    public void setFtypeId(Integer ftypeId) {
        this.ftypeId = ftypeId;
    }

    /**
     * Getter for lensId.<p>
     */
    public Integer getLensId() {
        return lensId;
    }

    /**
     * Setter for lensId.<p>
     */
    public void setLensId(Integer lensId) {
        this.lensId = lensId;
    }

    /**
     * Getter for libFeatId.<p>
     */
    public Integer getLibFeatId() {
        return libFeatId;
    }

    /**
     * Setter for libFeatId.<p>
     */
    public void setLibFeatId(Integer libFeatId) {
        this.libFeatId = libFeatId;
    }

    /**
     * Getter for libFelemId.<p>
     */
    public Integer getLibFelemId() {
        return libFelemId;
    }

    /**
     * Setter for libFelemId.<p>
     */
    public void setLibFelemId(Integer libFelemId) {
        this.libFelemId = libFelemId;
    }

    /**
     * Getter for nextThresh.<p>
     */
    public Integer getNextThresh() {
        return nextThresh;
    }

    /**
     * Setter for nextThresh.<p>
     */
    public void setNextThresh(Integer nextThresh) {
        this.nextThresh = nextThresh;
    }

    /**
     * Getter for oomLevel.<p>
     */
    public String getOomLevel() {
        return oomLevel;
    }

    /**
     * Setter for oomLevel.<p>
     */
    public void setOomLevel(String oomLevel) {
        this.oomLevel = oomLevel;
    }

    /**
     * Getter for oomType.<p>
     */
    public String getOomType() {
        return oomType;
    }

    /**
     * Setter for oomType.<p>
     */
    public void setOomType(String oomType) {
        this.oomType = oomType;
    }

    /**
     * Getter for thresh1Cnt.<p>
     */
    public Integer getThresh1Cnt() {
        return thresh1Cnt;
    }

    /**
     * Setter for thresh1Cnt.<p>
     */
    public void setThresh1Cnt(Integer thresh1Cnt) {
        this.thresh1Cnt = thresh1Cnt;
    }

    /**
     * Getter for thresh1Oom.<p>
     */
    public Integer getThresh1Oom() {
        return thresh1Oom;
    }

    /**
     * Setter for thresh1Oom.<p>
     */
    public void setThresh1Oom(Integer thresh1Oom) {
        this.thresh1Oom = thresh1Oom;
    }
}
