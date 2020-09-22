package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CopyPersonResponse {

    /**
     * 成功加入的人员库数量
     */
    @SerializedName("SucGroupNum")
    @Expose
    private Long SucGroupNum;

    /**
     * 成功加入的人员库列表
     */
    @SerializedName("SucGroupIds")
    @Expose
    private String[] SucGroupIds;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功加入的人员库数量
     *
     * @return SucGroupNum 成功加入的人员库数量
     */
    public Long getSucGroupNum() {
        return this.SucGroupNum;
    }

    /**
     * Set 成功加入的人员库数量
     *
     * @param SucGroupNum 成功加入的人员库数量
     */
    public void setSucGroupNum(Long SucGroupNum) {
        this.SucGroupNum = SucGroupNum;
    }

    /**
     * Get 成功加入的人员库列表
     *
     * @return SucGroupIds 成功加入的人员库列表
     */
    public String[] getSucGroupIds() {
        return this.SucGroupIds;
    }

    /**
     * Set 成功加入的人员库列表
     *
     * @param SucGroupIds 成功加入的人员库列表
     */
    public void setSucGroupIds(String[] SucGroupIds) {
        this.SucGroupIds = SucGroupIds;
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

