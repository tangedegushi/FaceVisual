package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonListResponse {

    /**
     * 返回的人员信息
     */
    @SerializedName("PersonInfos")
    @Expose
    private PersonInfo[] PersonInfos;

    /**
     * 该人员库的人员数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
     * 该人员库的人脸数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("FaceNum")
    @Expose
    private Long FaceNum;

    /**
     * 人脸识别所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的人员信息
     *
     * @return PersonInfos 返回的人员信息
     */
    public PersonInfo[] getPersonInfos() {
        return this.PersonInfos;
    }

    /**
     * Set 返回的人员信息
     *
     * @param PersonInfos 返回的人员信息
     */
    public void setPersonInfos(PersonInfo[] PersonInfos) {
        this.PersonInfos = PersonInfos;
    }

    /**
     * Get 该人员库的人员数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return PersonNum 该人员库的人员数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set 该人员库的人员数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param PersonNum 该人员库的人员数量
     *                  注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get 该人员库的人脸数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return FaceNum 该人员库的人脸数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFaceNum() {
        return this.FaceNum;
    }

    /**
     * Set 该人员库的人脸数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param FaceNum 该人员库的人脸数量
     *                注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceNum(Long FaceNum) {
        this.FaceNum = FaceNum;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

}

