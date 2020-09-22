package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetUpgradeGroupFaceModelVersionJobListResponse {

    /**
    * 人员库升级任务信息列表。
    */
    @SerializedName("JobInfos")
    @Expose
    private UpgradeJobInfo [] JobInfos;

    /**
    * 升级任务总数量。
    */
    @SerializedName("JobNum")
    @Expose
    private Long JobNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员库升级任务信息列表。 
     * @return JobInfos 人员库升级任务信息列表。
     */
    public UpgradeJobInfo [] getJobInfos() {
        return this.JobInfos;
    }

    /**
     * Set 人员库升级任务信息列表。
     * @param JobInfos 人员库升级任务信息列表。
     */
    public void setJobInfos(UpgradeJobInfo [] JobInfos) {
        this.JobInfos = JobInfos;
    }

    /**
     * Get 升级任务总数量。 
     * @return JobNum 升级任务总数量。
     */
    public Long getJobNum() {
        return this.JobNum;
    }

    /**
     * Set 升级任务总数量。
     * @param JobNum 升级任务总数量。
     */
    public void setJobNum(Long JobNum) {
        this.JobNum = JobNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

}

