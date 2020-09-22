package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class EstimateCheckSimilarPersonCostTimeResponse {

    /**
     * 人员查重任务预估需要耗费时间。 单位为分钟。
     */
    @SerializedName("EstimatedTimeCost")
    @Expose
    private Long EstimatedTimeCost;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员查重任务预估需要耗费时间。 单位为分钟。
     *
     * @return EstimatedTimeCost 人员查重任务预估需要耗费时间。 单位为分钟。
     */
    public Long getEstimatedTimeCost() {
        return this.EstimatedTimeCost;
    }

    /**
     * Set 人员查重任务预估需要耗费时间。 单位为分钟。
     *
     * @param EstimatedTimeCost 人员查重任务预估需要耗费时间。 单位为分钟。
     */
    public void setEstimatedTimeCost(Long EstimatedTimeCost) {
        this.EstimatedTimeCost = EstimatedTimeCost;
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

