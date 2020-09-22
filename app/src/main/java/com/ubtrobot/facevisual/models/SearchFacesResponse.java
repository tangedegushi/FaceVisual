package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ubtrobot.facevisual.facebean.Result;

public class SearchFacesResponse {

    /**
     * 识别结果。
     */
    @SerializedName("Results")
    @Expose
    private Result[] Results;

    /**
     * 搜索的人员库中包含的人脸数。
     */
    @SerializedName("FaceNum")
    @Expose
    private Long FaceNum;

    /**
     * 人脸识别所用的算法模型版本。
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
     * Get 搜索的人员库中包含的人脸数。
     *
     * @return FaceNum 搜索的人员库中包含的人脸数。
     */
    public Long getFaceNum() {
        return this.FaceNum;
    }

    /**
     * Set 搜索的人员库中包含的人脸数。
     *
     * @param FaceNum 搜索的人员库中包含的人脸数。
     */
    public void setFaceNum(Long FaceNum) {
        this.FaceNum = FaceNum;
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

