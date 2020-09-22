package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPersonsReturnsByGroupResponse {

    /**
     * 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
     * 识别结果。
     */
    @SerializedName("ResultsReturnsByGroup")
    @Expose
    private ResultsReturnsByGroup[] ResultsReturnsByGroup;

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
     * Get 识别结果。
     *
     * @return ResultsReturnsByGroup 识别结果。
     */
    public ResultsReturnsByGroup[] getResultsReturnsByGroup() {
        return this.ResultsReturnsByGroup;
    }

    /**
     * Set 识别结果。
     *
     * @param ResultsReturnsByGroup 识别结果。
     */
    public void setResultsReturnsByGroup(ResultsReturnsByGroup[] ResultsReturnsByGroup) {
        this.ResultsReturnsByGroup = ResultsReturnsByGroup;
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

