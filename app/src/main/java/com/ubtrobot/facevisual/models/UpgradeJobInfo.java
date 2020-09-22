package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpgradeJobInfo {

    /**
    * 人员库升级任务ID，用于查询、获取升级的进度和结果。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 人员库ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 当前算法模型版本。
    */
    @SerializedName("FromFaceModelVersion")
    @Expose
    private String FromFaceModelVersion;

    /**
    * 目标算法模型版本。
    */
    @SerializedName("ToFaceModelVersion")
    @Expose
    private String ToFaceModelVersion;

    /**
    * 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 人员库升级任务ID，用于查询、获取升级的进度和结果。 
     * @return JobId 人员库升级任务ID，用于查询、获取升级的进度和结果。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 人员库升级任务ID，用于查询、获取升级的进度和结果。
     * @param JobId 人员库升级任务ID，用于查询、获取升级的进度和结果。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 人员库ID。 
     * @return GroupId 人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID。
     * @param GroupId 人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 当前算法模型版本。 
     * @return FromFaceModelVersion 当前算法模型版本。
     */
    public String getFromFaceModelVersion() {
        return this.FromFaceModelVersion;
    }

    /**
     * Set 当前算法模型版本。
     * @param FromFaceModelVersion 当前算法模型版本。
     */
    public void setFromFaceModelVersion(String FromFaceModelVersion) {
        this.FromFaceModelVersion = FromFaceModelVersion;
    }

    /**
     * Get 目标算法模型版本。 
     * @return ToFaceModelVersion 目标算法模型版本。
     */
    public String getToFaceModelVersion() {
        return this.ToFaceModelVersion;
    }

    /**
     * Set 目标算法模型版本。
     * @param ToFaceModelVersion 目标算法模型版本。
     */
    public void setToFaceModelVersion(String ToFaceModelVersion) {
        this.ToFaceModelVersion = ToFaceModelVersion;
    }

    /**
     * Get 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。 
     * @return StartTime 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     * @param StartTime 升级起始时间。 
StartTime的值是自 Unix 纪元时间到Group创建时间的毫秒数。 
Unix 纪元时间是 1970 年 1 月 1 日星期四，协调世界时 (UTC) 00:00:00。 
有关更多信息，请参阅 Unix 时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。 
     * @return Status 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     * @param Status 0表示升级中，1表示升级完毕，2表示回滚完毕，3表示升级失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

}

