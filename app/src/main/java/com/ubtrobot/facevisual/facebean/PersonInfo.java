package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PersonInfo {

    /**
     * 人员名称
     */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
     * 人员Id
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 人员性别
     */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * 人员描述字段内容
     */
    @SerializedName("PersonExDescriptions")
    @Expose
    private String[] PersonExDescriptions;

    /**
     * 包含的人脸照片列表
     */
    @SerializedName("FaceIds")
    @Expose
    private String[] FaceIds;

    /**
     * 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
     * Get 人员名称
     *
     * @return PersonName 人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     *
     * @param PersonName 人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员Id
     *
     * @return PersonId 人员Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员Id
     *
     * @param PersonId 人员Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人员性别
     *
     * @return Gender 人员性别
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 人员性别
     *
     * @param Gender 人员性别
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
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

    /**
     * Get 包含的人脸照片列表
     *
     * @return FaceIds 包含的人脸照片列表
     */
    public String[] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 包含的人脸照片列表
     *
     * @param FaceIds 包含的人脸照片列表
     */
    public void setFaceIds(String[] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     *
     * @return CreationTimestamp 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     * Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     *
     * @param CreationTimestamp 人员的创建时间和日期 CreationTimestamp。CreationTimestamp 的值是自 Unix 纪元时间到Group创建时间的毫秒数。
     *                          Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。有关更多信息，请参阅 Unix 时间。
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

}

