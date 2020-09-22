package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PersonExDescriptionInfo {

    /**
     * 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("PersonExDescriptionIndex")
    @Expose
    private Long PersonExDescriptionIndex;

    /**
     * 需要更新的人员描述字段内容
     */
    @SerializedName("PersonExDescription")
    @Expose
    private String PersonExDescription;

    /**
     * Get 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return PersonExDescriptionIndex 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPersonExDescriptionIndex() {
        return this.PersonExDescriptionIndex;
    }

    /**
     * Set 人员描述字段Index，从0开始
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param PersonExDescriptionIndex 人员描述字段Index，从0开始
     *                                 注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonExDescriptionIndex(Long PersonExDescriptionIndex) {
        this.PersonExDescriptionIndex = PersonExDescriptionIndex;
    }

    /**
     * Get 需要更新的人员描述字段内容
     *
     * @return PersonExDescription 需要更新的人员描述字段内容
     */
    public String getPersonExDescription() {
        return this.PersonExDescription;
    }

    /**
     * Set 需要更新的人员描述字段内容
     *
     * @param PersonExDescription 需要更新的人员描述字段内容
     */
    public void setPersonExDescription(String PersonExDescription) {
        this.PersonExDescription = PersonExDescription;
    }

}

