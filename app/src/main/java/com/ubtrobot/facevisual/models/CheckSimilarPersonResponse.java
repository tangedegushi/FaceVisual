package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSimilarPersonResponse {

    /**
    * 查重任务ID，用于查询、获取查重的进度和结果。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查重任务ID，用于查询、获取查重的进度和结果。 
     * @return JobId 查重任务ID，用于查询、获取查重的进度和结果。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 查重任务ID，用于查询、获取查重的进度和结果。
     * @param JobId 查重任务ID，用于查询、获取查重的进度和结果。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
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

