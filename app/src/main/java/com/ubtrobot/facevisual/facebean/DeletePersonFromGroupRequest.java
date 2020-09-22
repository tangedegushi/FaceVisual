package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class DeletePersonFromGroupRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 人员库ID，取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    public DeletePersonFromGroupRequest(@NonNull String personId, @NonNull String groupId) {
        PersonId = personId;
        GroupId = groupId;
    }

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId
     *
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId
     *
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
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

