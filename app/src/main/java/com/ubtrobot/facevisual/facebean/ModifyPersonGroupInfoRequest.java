package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModifyPersonGroupInfoRequest {

    /**
     * 人员库ID，取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 需要修改的人员描述字段内容，key-value
     */
    @SerializedName("PersonExDescriptionInfos")
    @Expose
    private PersonExDescriptionInfo[] PersonExDescriptionInfos;

    public ModifyPersonGroupInfoRequest(@NonNull String groupId, @NonNull String personId) {
        GroupId = groupId;
        PersonId = personId;
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
     * Get 需要修改的人员描述字段内容，key-value
     *
     * @return PersonExDescriptionInfos 需要修改的人员描述字段内容，key-value
     */
    public PersonExDescriptionInfo[] getPersonExDescriptionInfos() {
        return this.PersonExDescriptionInfos;
    }

    /**
     * Set 需要修改的人员描述字段内容，key-value
     *
     * @param PersonExDescriptionInfos 需要修改的人员描述字段内容，key-value
     */
    public void setPersonExDescriptionInfos(PersonExDescriptionInfo[] PersonExDescriptionInfos) {
        this.PersonExDescriptionInfos = PersonExDescriptionInfos;
    }

}

