package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    /**
     * 识别出的最相似候选人
     */
    @SerializedName("Candidates")
    @Expose
    private Candidate[] Candidates;

    /**
     * 检测出的人脸框位置
     */
    @SerializedName("FaceRect")
    @Expose
    private com.ubtrobot.facevisual.facebean.FaceRect FaceRect;

    /**
     * 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
     * Get 识别出的最相似候选人
     *
     * @return Candidates 识别出的最相似候选人
     */
    public Candidate[] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 识别出的最相似候选人
     *
     * @param Candidates 识别出的最相似候选人
     */
    public void setCandidates(Candidate[] Candidates) {
        this.Candidates = Candidates;
    }

    /**
     * Get 检测出的人脸框位置
     *
     * @return FaceRect 检测出的人脸框位置
     */
    public com.ubtrobot.facevisual.facebean.FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框位置
     *
     * @param FaceRect 检测出的人脸框位置
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     *
     * @return RetCode 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     *
     * @param RetCode 检测出的人脸图片状态返回码。0 表示正常。
     *                -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

}

