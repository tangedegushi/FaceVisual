package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetUpgradeGroupFaceModelVersionResultRequest {

    /**
     * 升级任务ID，用于查询、获取人员库升级的进度和结果。
     */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 升级任务ID，用于查询、获取人员库升级的进度和结果。
     *
     * @return JobId 升级任务ID，用于查询、获取人员库升级的进度和结果。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 升级任务ID，用于查询、获取人员库升级的进度和结果。
     *
     * @param JobId 升级任务ID，用于查询、获取人员库升级的进度和结果。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

}

