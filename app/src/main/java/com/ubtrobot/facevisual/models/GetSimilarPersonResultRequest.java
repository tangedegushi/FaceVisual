package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetSimilarPersonResultRequest {

    /**
    * 查重任务ID，用于查询、获取查重的进度和结果。取值为人员查重接口返回的JobId
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 查重任务ID，用于查询、获取查重的进度和结果。取值为人员查重接口返回的JobId 
     * @return JobId 查重任务ID，用于查询、获取查重的进度和结果。取值为人员查重接口返回的JobId
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 查重任务ID，用于查询、获取查重的进度和结果。取值为人员查重接口返回的JobId
     * @param JobId 查重任务ID，用于查询、获取查重的进度和结果。取值为人员查重接口返回的JobId
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

}

