package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CopyPersonRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 待加入的人员库列表，数组元素取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupIds")
    @Expose
    private String[] GroupIds;

    public CopyPersonRequest(@NonNull String personId, @NonNull String[] groupIds) {
        PersonId = personId;
        GroupIds = groupIds;
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
     * Get 待加入的人员库列表，数组元素取值为创建人员库接口中的GroupId
     *
     * @return GroupIds 待加入的人员库列表，数组元素取值为创建人员库接口中的GroupId
     */
    public String[] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 待加入的人员库列表，数组元素取值为创建人员库接口中的GroupId
     *
     * @param GroupIds 待加入的人员库列表，数组元素取值为创建人员库接口中的GroupId
     */
    public void setGroupIds(String[] GroupIds) {
        this.GroupIds = GroupIds;
    }

}

