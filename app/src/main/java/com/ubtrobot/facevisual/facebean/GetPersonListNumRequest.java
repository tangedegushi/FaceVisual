package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonListNumRequest {

    /**
     * 人员库ID，取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    public GetPersonListNumRequest(@NonNull String groupId) {
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

}

