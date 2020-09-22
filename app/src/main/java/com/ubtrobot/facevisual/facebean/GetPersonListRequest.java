package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonListRequest {

    /**
     * 人员库ID，取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 起始序号，默认值为0
     */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * 返回数量，默认值为10，最大值为1000
     */
    @SerializedName("Limit")
    @Expose
    private Long Limit = 10l;

    public GetPersonListRequest(@NonNull String groupId) {
        GroupId = groupId;
    }

    /**
     * Get 人员库ID，取值为创建人员库接口中的GroupId
     *
     * @return GroupId 人员库ID，取值为创建人员库接口中的GroupId
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID，取值为创建人员库接口中的GroupId
     *
     * @param GroupId 人员库ID，取值为创建人员库接口中的GroupId
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 起始序号，默认值为0
     *
     * @return Offset 起始序号，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0
     *
     * @param Offset 起始序号，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为1000
     *
     * @return Limit 返回数量，默认值为10，最大值为1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为1000
     *
     * @param Limit 返回数量，默认值为10，最大值为1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

}

