package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;


public class GetPersonGroupInfoResponse {

    /**
     * 包含此人员的人员库及描述字段内容列表
     */
    @SerializedName("PersonGroupInfos")
    @Expose
    private PersonGroupInfo[] PersonGroupInfos;

    /**
     * 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
     * 人脸识别服务所用的算法模型版本。
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
     * Get 包含此人员的人员库及描述字段内容列表
     *
     * @return PersonGroupInfos 包含此人员的人员库及描述字段内容列表
     */
    public PersonGroupInfo[] getPersonGroupInfos() {
        return this.PersonGroupInfos;
    }

    /**
     * Set 包含此人员的人员库及描述字段内容列表
     *
     * @param PersonGroupInfos 包含此人员的人员库及描述字段内容列表
     */
    public void setPersonGroupInfos(PersonGroupInfo[] PersonGroupInfos) {
        this.PersonGroupInfos = PersonGroupInfos;
    }

    /**
     * Get 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return GroupNum 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param GroupNum 人员库总数量
     *                 注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。
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

