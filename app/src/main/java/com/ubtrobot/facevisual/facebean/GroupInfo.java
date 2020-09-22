package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupInfo {

    /**
     * 人员库名称
     */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * 人员库ID
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 人员库自定义描述字段
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String[] GroupExDescriptions;

    /**
     * 人员库信息备注
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * 人脸识别所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
     * Get 人员库名称
     *
     * @return GroupName 人员库名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人员库名称
     *
     * @param GroupName 人员库名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 人员库ID
     *
     * @return GroupId 人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID
     *
     * @param GroupId 人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员库自定义描述字段
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return GroupExDescriptions 人员库自定义描述字段
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String[] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set 人员库自定义描述字段
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param GroupExDescriptions 人员库自定义描述字段
     *                            注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupExDescriptions(String[] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get 人员库信息备注
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Tag 人员库信息备注
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人员库信息备注
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Tag 人员库信息备注
     *            注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 人脸识别所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     *                         注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return CreationTimestamp Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param CreationTimestamp Group的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     *                          Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     *                          注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

}

