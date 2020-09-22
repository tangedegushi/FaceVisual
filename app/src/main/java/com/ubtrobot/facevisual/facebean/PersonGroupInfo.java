package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PersonGroupInfo {

    /**
     * 包含此人员的人员库ID
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 人员描述字段内容
     */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String[] PersonExDescriptions;

    /**
     * Get 包含此人员的人员库ID
     *
     * @return GroupId 包含此人员的人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 包含此人员的人员库ID
     *
     * @param GroupId 包含此人员的人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员描述字段内容
     *
     * @return PersonExDescriptions 人员描述字段内容
     */
    public String[] getPersonExDescriptions() {
        return this.PersonExDescriptions;
    }

    /**
     * Set 人员描述字段内容
     *
     * @param PersonExDescriptions 人员描述字段内容
     */
    public void setPersonExDescriptions(String[] PersonExDescriptions) {
        this.PersonExDescriptions = PersonExDescriptions;
    }

}

