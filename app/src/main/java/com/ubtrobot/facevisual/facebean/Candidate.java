package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Candidate {

    /**
     * 人员ID
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 人脸ID
     */
    @SerializedName("FaceId")
    @Expose
    private String FaceId;

    /**
     * 候选者的匹配得分。
     * <p>
     * 1万大小人脸底库下，误识率百分之一对应分数为70分，误识率千分之一对应分数为80分，误识率万分之一对应分数为90分；
     * 10万大小人脸底库下，误识率百分之一对应分数为80分，误识率千分之一对应分数为90分，误识率万分之一对应分数为100分；
     * 30万大小人脸底库下，误识率百分之一对应分数为85分，误识率千分之一对应分数为95分。
     * <p>
     * 一般80分左右可适用大部分场景，建议分数不要超过90分。您可以根据实际情况选择合适的分数。
     */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * 人员名称
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
     * 人员性别
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * 包含此人员的人员库及描述字段内容列表
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo[] PersonGroupInfos;

    /**
     * Get 人员ID
     *
     * @return PersonId 人员ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID
     *
     * @param PersonId 人员ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人脸ID
     *
     * @return FaceId 人脸ID
     */
    public String getFaceId() {
        return this.FaceId;
    }

    /**
     * Set 人脸ID
     *
     * @param FaceId 人脸ID
     */
    public void setFaceId(String FaceId) {
        this.FaceId = FaceId;
    }

    /**
     * Get 候选者的匹配得分。
     * <p>
     * 1万大小人脸底库下，误识率百分之一对应分数为70分，误识率千分之一对应分数为80分，误识率万分之一对应分数为90分；
     * 10万大小人脸底库下，误识率百分之一对应分数为80分，误识率千分之一对应分数为90分，误识率万分之一对应分数为100分；
     * 30万大小人脸底库下，误识率百分之一对应分数为85分，误识率千分之一对应分数为95分。
     * <p>
     * 一般80分左右可适用大部分场景，建议分数不要超过90分。您可以根据实际情况选择合适的分数。
     *
     * @return Score 候选者的匹配得分。
     * <p>
     * 1万大小人脸底库下，误识率百分之一对应分数为70分，误识率千分之一对应分数为80分，误识率万分之一对应分数为90分；
     * 10万大小人脸底库下，误识率百分之一对应分数为80分，误识率千分之一对应分数为90分，误识率万分之一对应分数为100分；
     * 30万大小人脸底库下，误识率百分之一对应分数为85分，误识率千分之一对应分数为95分。
     * <p>
     * 一般80分左右可适用大部分场景，建议分数不要超过90分。您可以根据实际情况选择合适的分数。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 候选者的匹配得分。
     * <p>
     * 1万大小人脸底库下，误识率百分之一对应分数为70分，误识率千分之一对应分数为80分，误识率万分之一对应分数为90分；
     * 10万大小人脸底库下，误识率百分之一对应分数为80分，误识率千分之一对应分数为90分，误识率万分之一对应分数为100分；
     * 30万大小人脸底库下，误识率百分之一对应分数为85分，误识率千分之一对应分数为95分。
     * <p>
     * 一般80分左右可适用大部分场景，建议分数不要超过90分。您可以根据实际情况选择合适的分数。
     *
     * @param Score 候选者的匹配得分。
     *              <p>
     *              1万大小人脸底库下，误识率百分之一对应分数为70分，误识率千分之一对应分数为80分，误识率万分之一对应分数为90分；
     *              10万大小人脸底库下，误识率百分之一对应分数为80分，误识率千分之一对应分数为90分，误识率万分之一对应分数为100分；
     *              30万大小人脸底库下，误识率百分之一对应分数为85分，误识率千分之一对应分数为95分。
     *              <p>
     *              一般80分左右可适用大部分场景，建议分数不要超过90分。您可以根据实际情况选择合适的分数。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 人员名称
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return PersonName 人员名称
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param PersonName 人员名称
     *                   注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员性别
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Gender 人员性别
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 人员性别
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Gender 人员性别
     *               注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 包含此人员的人员库及描述字段内容列表
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return PersonGroupInfos 包含此人员的人员库及描述字段内容列表
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersonGroupInfo[] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set 包含此人员的人员库及描述字段内容列表
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param PersonGroupInfos 包含此人员的人员库及描述字段内容列表
     *                         注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonGroupInfos(PersonGroupInfo[] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

}

