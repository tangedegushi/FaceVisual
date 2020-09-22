package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class DetectLiveFaceResponse {

    /**
     * 活体打分，取值范围 [0,100]，分数一般落于[80, 100]区间内，0分也为常见值。推荐相大于 87 时可判断为活体。可根据具体场景自行调整阈值。
     * 本字段当且仅当FaceModelVersion为2.0时才具备参考意义。
     */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * 人脸识别所用的算法模型版本。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * 活体检测是否通过。
     * 本字段只有FaceModelVersion为3.0时才具备参考意义。
     */
    @SerializedName("IsLiveness")
    @Expose
    private Boolean IsLiveness;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 活体打分，取值范围 [0,100]，分数一般落于[80, 100]区间内，0分也为常见值。推荐相大于 87 时可判断为活体。可根据具体场景自行调整阈值。
     * 本字段当且仅当FaceModelVersion为2.0时才具备参考意义。
     *
     * @return Score 活体打分，取值范围 [0,100]，分数一般落于[80, 100]区间内，0分也为常见值。推荐相大于 87 时可判断为活体。可根据具体场景自行调整阈值。
     * 本字段当且仅当FaceModelVersion为2.0时才具备参考意义。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 活体打分，取值范围 [0,100]，分数一般落于[80, 100]区间内，0分也为常见值。推荐相大于 87 时可判断为活体。可根据具体场景自行调整阈值。
     * 本字段当且仅当FaceModelVersion为2.0时才具备参考意义。
     *
     * @param Score 活体打分，取值范围 [0,100]，分数一般落于[80, 100]区间内，0分也为常见值。推荐相大于 87 时可判断为活体。可根据具体场景自行调整阈值。
     *              本字段当且仅当FaceModelVersion为2.0时才具备参考意义。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 人脸识别所用的算法模型版本。
     *
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     *
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get 活体检测是否通过。
     * 本字段只有FaceModelVersion为3.0时才具备参考意义。
     *
     * @return IsLiveness 活体检测是否通过。
     * 本字段只有FaceModelVersion为3.0时才具备参考意义。
     */
    public Boolean getIsLiveness() {
        return this.IsLiveness;
    }

    /**
     * Set 活体检测是否通过。
     * 本字段只有FaceModelVersion为3.0时才具备参考意义。
     *
     * @param IsLiveness 活体检测是否通过。
     *                   本字段只有FaceModelVersion为3.0时才具备参考意义。
     */
    public void setIsLiveness(Boolean IsLiveness) {
        this.IsLiveness = IsLiveness;
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

