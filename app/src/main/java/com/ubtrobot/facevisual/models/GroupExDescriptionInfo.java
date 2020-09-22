package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupExDescriptionInfo {

    /**
    * 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupExDescriptionIndex")
    @Expose
    private Long GroupExDescriptionIndex;

    /**
    * 需要更新的人员库自定义描述字段内容
    */
    @SerializedName("GroupExDescription")
    @Expose
    private String GroupExDescription;

    /**
     * Get 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupExDescriptionIndex() {
        return this.GroupExDescriptionIndex;
    }

    /**
     * Set 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupExDescriptionIndex 人员库自定义描述字段Index，从0开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupExDescriptionIndex(Long GroupExDescriptionIndex) {
        this.GroupExDescriptionIndex = GroupExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员库自定义描述字段内容 
     * @return GroupExDescription 需要更新的人员库自定义描述字段内容
     */
    public String getGroupExDescription() {
        return this.GroupExDescription;
    }

    /**
     * Set 需要更新的人员库自定义描述字段内容
     * @param GroupExDescription 需要更新的人员库自定义描述字段内容
     */
    public void setGroupExDescription(String GroupExDescription) {
        this.GroupExDescription = GroupExDescription;
    }

}

