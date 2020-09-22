package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyPersonResponse {

    /**
     * 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * 是否为同一人的判断。
     */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
     * 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
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
     * Get 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     *
     * @return Score 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     *
     * @param Score 给定的人脸照片与 PersonId 对应的相似度。若 PersonId 下有多张人脸（Face），会融合多张人脸信息进行验证。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get 是否为同一人的判断。
     *
     * @return IsMatch 是否为同一人的判断。
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set 是否为同一人的判断。
     *
     * @param IsMatch 是否为同一人的判断。
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Get 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
     *
     * @return FaceModelVersion 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
     *
     * @param FaceModelVersion 人脸识别所用的算法模型版本，是该 Person 所在的人员库的算法模型版本。在创建人员库时设置，详情可参考[算法模型版本](https://cloud.tencent.com/document/product/867/40042)
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

