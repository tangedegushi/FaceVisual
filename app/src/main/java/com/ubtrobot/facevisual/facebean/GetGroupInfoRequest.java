package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetGroupInfoRequest {

    /**
     * 人员库 ID，取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    public GetGroupInfoRequest(String groupId) {
        GroupId = groupId;
    }

    /**
     * Get 人员库 ID，取值为创建人员库接口中的GroupId
     *
     * @return GroupId 人员库 ID，取值为创建人员库接口中的GroupId
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库 ID，取值为创建人员库接口中的GroupId
     *
     * @param GroupId 人员库 ID，取值为创建人员库接口中的GroupId
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

}

