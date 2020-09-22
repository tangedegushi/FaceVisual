package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetSimilarPersonResultResponse {

    /**
    * 查重任务完成进度。取值[0.0，100.0]。当且仅当值为100时，SimilarPersons才有意义。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 疑似同一人的人员信息文件临时下载链接， 有效时间为5分钟，结果文件实际保存90天。
文件内容由 SimilarPerson 的数组组成。
    */
    @SerializedName("SimilarPersonsUrl")
    @Expose
    private String SimilarPersonsUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查重任务完成进度。取值[0.0，100.0]。当且仅当值为100时，SimilarPersons才有意义。 
     * @return Progress 查重任务完成进度。取值[0.0，100.0]。当且仅当值为100时，SimilarPersons才有意义。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 查重任务完成进度。取值[0.0，100.0]。当且仅当值为100时，SimilarPersons才有意义。
     * @param Progress 查重任务完成进度。取值[0.0，100.0]。当且仅当值为100时，SimilarPersons才有意义。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 疑似同一人的人员信息文件临时下载链接， 有效时间为5分钟，结果文件实际保存90天。
文件内容由 SimilarPerson 的数组组成。 
     * @return SimilarPersonsUrl 疑似同一人的人员信息文件临时下载链接， 有效时间为5分钟，结果文件实际保存90天。
文件内容由 SimilarPerson 的数组组成。
     */
    public String getSimilarPersonsUrl() {
        return this.SimilarPersonsUrl;
    }

    /**
     * Set 疑似同一人的人员信息文件临时下载链接， 有效时间为5分钟，结果文件实际保存90天。
文件内容由 SimilarPerson 的数组组成。
     * @param SimilarPersonsUrl 疑似同一人的人员信息文件临时下载链接， 有效时间为5分钟，结果文件实际保存90天。
文件内容由 SimilarPerson 的数组组成。
     */
    public void setSimilarPersonsUrl(String SimilarPersonsUrl) {
        this.SimilarPersonsUrl = SimilarPersonsUrl;
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

