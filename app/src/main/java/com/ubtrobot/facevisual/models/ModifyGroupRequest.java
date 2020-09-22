package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModifyGroupRequest {

    /**
    * 人员库ID，取值为创建人员库接口中的GroupId
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 人员库名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 需要修改的人员库自定义描述字段，key-value
    */
    @SerializedName("GroupExDescriptionInfos")
    @Expose
    private GroupExDescriptionInfo [] GroupExDescriptionInfos;

    /**
    * 人员库信息备注
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 人员库ID，取值为创建人员库接口中的GroupId 
     * @return GroupId 人员库ID，取值为创建人员库接口中的GroupId
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID，取值为创建人员库接口中的GroupId
     * @param GroupId 人员库ID，取值为创建人员库接口中的GroupId
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员库名称 
     * @return GroupName 人员库名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人员库名称
     * @param GroupName 人员库名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 需要修改的人员库自定义描述字段，key-value 
     * @return GroupExDescriptionInfos 需要修改的人员库自定义描述字段，key-value
     */
    public GroupExDescriptionInfo [] getGroupExDescriptionInfos() {
        return this.GroupExDescriptionInfos;
    }

    /**
     * Set 需要修改的人员库自定义描述字段，key-value
     * @param GroupExDescriptionInfos 需要修改的人员库自定义描述字段，key-value
     */
    public void setGroupExDescriptionInfos(GroupExDescriptionInfo [] GroupExDescriptionInfos) {
        this.GroupExDescriptionInfos = GroupExDescriptionInfos;
    }

    /**
     * Get 人员库信息备注 
     * @return Tag 人员库信息备注
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人员库信息备注
     * @param Tag 人员库信息备注
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

}

