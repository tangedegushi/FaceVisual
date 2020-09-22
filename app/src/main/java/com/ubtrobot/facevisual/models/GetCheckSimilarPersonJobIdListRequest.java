package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class GetCheckSimilarPersonJobIdListRequest {

    /**
     * 起始序号，默认值为0。
     */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * 返回数量，默认值为10，最大值为1000。
     */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 起始序号，默认值为0。
     *
     * @return Offset 起始序号，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0。
     *
     * @param Offset 起始序号，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为1000。
     *
     * @return Limit 返回数量，默认值为10，最大值为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为1000。
     *
     * @param Limit 返回数量，默认值为10，最大值为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

}

