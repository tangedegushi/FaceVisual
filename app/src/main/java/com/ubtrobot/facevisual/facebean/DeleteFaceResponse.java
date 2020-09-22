package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class DeleteFaceResponse {

    /**
     * 删除成功的人脸数量
     */
    @SerializedName("SucDeletedNum")
    @Expose
    private Long SucDeletedNum;

    /**
     * 删除成功的人脸ID列表
     */
    @SerializedName("SucFaceIds")
    @Expose
    private String[] SucFaceIds;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功的人脸数量
     *
     * @return SucDeletedNum 删除成功的人脸数量
     */
    public Long getSucDeletedNum() {
        return this.SucDeletedNum;
    }

    /**
     * Set 删除成功的人脸数量
     *
     * @param SucDeletedNum 删除成功的人脸数量
     */
    public void setSucDeletedNum(Long SucDeletedNum) {
        this.SucDeletedNum = SucDeletedNum;
    }

    /**
     * Get 删除成功的人脸ID列表
     *
     * @return SucFaceIds 删除成功的人脸ID列表
     */
    public String[] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set 删除成功的人脸ID列表
     *
     * @param SucFaceIds 删除成功的人脸ID列表
     */
    public void setSucFaceIds(String[] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
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

