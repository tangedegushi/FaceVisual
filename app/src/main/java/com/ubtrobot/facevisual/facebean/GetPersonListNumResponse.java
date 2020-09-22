package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonListNumResponse {

    /**
     * 人员数量
     */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
     * 人脸数量
     */
    @SerializedName("FaceNum")
    @Expose
    private Long FaceNum;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员数量
     *
     * @return PersonNum 人员数量
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * Set 人员数量
     *
     * @param PersonNum 人员数量
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * Get 人脸数量
     *
     * @return FaceNum 人脸数量
     */
    public Long getFaceNum() {
        return this.FaceNum;
    }

    /**
     * Set 人脸数量
     *
     * @param FaceNum 人脸数量
     */
    public void setFaceNum(Long FaceNum) {
        this.FaceNum = FaceNum;
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

