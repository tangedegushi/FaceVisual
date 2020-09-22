package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class GetCheckSimilarPersonJobIdListResponse {

    /**
     * 人员查重任务信息列表。
     */
    @SerializedName("JobIdInfos")
    @Expose
    private JobIdInfo[] JobIdInfos;

    /**
     * 查重任务总数量。
     */
    @SerializedName("JobIdNum")
    @Expose
    private Long JobIdNum;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员查重任务信息列表。
     *
     * @return JobIdInfos 人员查重任务信息列表。
     */
    public JobIdInfo[] getJobIdInfos() {
        return this.JobIdInfos;
    }

    /**
     * Set 人员查重任务信息列表。
     *
     * @param JobIdInfos 人员查重任务信息列表。
     */
    public void setJobIdInfos(JobIdInfo[] JobIdInfos) {
        this.JobIdInfos = JobIdInfos;
    }

    /**
     * Get 查重任务总数量。
     *
     * @return JobIdNum 查重任务总数量。
     */
    public Long getJobIdNum() {
        return this.JobIdNum;
    }

    /**
     * Set 查重任务总数量。
     *
     * @param JobIdNum 查重任务总数量。
     */
    public void setJobIdNum(Long JobIdNum) {
        this.JobIdNum = JobIdNum;
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

