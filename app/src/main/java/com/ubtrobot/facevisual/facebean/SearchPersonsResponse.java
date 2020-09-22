package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPersonsResponse {

    /**
     * 识别结果。
     */
    @SerializedName("Results")
    @Expose
    private Result[] Results;

    /**
     * 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

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
     * Get 识别结果。
     *
     * @return Results 识别结果。
     */
    public Result[] getResults() {
        return this.Results;
    }

    /**
     * Set 识别结果。
     *
     * @param Results 识别结果。
     */
    public void setResults(Result[] Results) {
        this.Results = Results;
    }

    /**
     * Get 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     *
     * @return PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     *
     * @param PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
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

