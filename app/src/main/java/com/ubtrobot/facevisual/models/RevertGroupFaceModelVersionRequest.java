package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RevertGroupFaceModelVersionRequest {

    /**
    * 需要回滚的升级任务ID。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 需要回滚的升级任务ID。 
     * @return JobId 需要回滚的升级任务ID。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 需要回滚的升级任务ID。
     * @param JobId 需要回滚的升级任务ID。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

}

