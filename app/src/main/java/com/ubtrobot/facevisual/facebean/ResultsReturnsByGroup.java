package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultsReturnsByGroup {

    /**
     * 检测出的人脸框位置。
     */
    @SerializedName("FaceRect")
    @Expose
    private com.ubtrobot.facevisual.facebean.FaceRect FaceRect;

    /**
     * 识别结果。
     */
    @SerializedName("GroupCandidates")
    @Expose
    private GroupCandidate[] GroupCandidates;

    /**
     * 检测出的人脸图片状态返回码。0 表示正常。
     * -1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
     * Get 检测出的人脸框位置。
     *
     * @return FaceRect 检测出的人脸框位置。
     */
    public com.ubtrobot.facevisual.facebean.FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框位置。
     *
     * @param FaceRect 检测出的人脸框位置。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 识别结果。
     *
     * @return GroupCandidates 识别结果。
     */
    public GroupCandidate[] getGroupCandidates() {
        return this.GroupCandidates;
    }

    /**
     * Set 识别结果。
     *
     * @param GroupCandidates 识别结果。
     */
    public void setGroupCandidates(GroupCandidate[] GroupCandidates) {
        this.GroupCandidates = GroupCandidates;
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

