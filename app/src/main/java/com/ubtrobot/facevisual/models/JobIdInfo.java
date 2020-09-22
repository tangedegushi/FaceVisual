package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobIdInfo {

    /**
    * 查重任务ID，用于查询、获取查重的进度和结果。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
    */
    @SerializedName("JobStatus")
    @Expose
    private Long JobStatus;

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
     * Get 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。 
     * @return StartTime 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     * @param StartTime 查重起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查重任务是否已完成。0: 成功 1: 未完成 2: 失败 
     * @return JobStatus 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     */
    public Long getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     * @param JobStatus 查重任务是否已完成。0: 成功 1: 未完成 2: 失败
     */
    public void setJobStatus(Long JobStatus) {
        this.JobStatus = JobStatus;
    }

}

