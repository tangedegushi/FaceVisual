package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CreateFaceResponse {

    /**
     * 加入成功的人脸数量
     */
    @SerializedName("SucFaceNum")
    @Expose
    private Long SucFaceNum;

    /**
     * 加入成功的人脸ID列表
     */
    @SerializedName("SucFaceIds")
    @Expose
    private String[] SucFaceIds;

    /**
     * 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，
     * -1601代表不符合图片质量控制要求, -1604 代表人脸相似度没有超过FaceMatchThreshold。
     * 其他非 0 值代表算法服务异常。
     * RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     */
    @SerializedName("RetCode")
    @Expose
    private Long[] RetCode;

    /**
     * 加入成功的人脸索引。索引顺序和入参中 Images 或 Urls 的顺序一致。
     * 例， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     */
    @SerializedName("SucIndexes")
    @Expose
    private Long[] SucIndexes;

    /**
     * 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     */
    @SerializedName("SucFaceRects")
    @Expose
    private FaceRect[] SucFaceRects;

    /**
     * 人脸识别所用的算法模型版本。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加入成功的人脸数量
     *
     * @return SucFaceNum 加入成功的人脸数量
     */
    public Long getSucFaceNum() {
        return this.SucFaceNum;
    }

    /**
     * Set 加入成功的人脸数量
     *
     * @param SucFaceNum 加入成功的人脸数量
     */
    public void setSucFaceNum(Long SucFaceNum) {
        this.SucFaceNum = SucFaceNum;
    }

    /**
     * Get 加入成功的人脸ID列表
     *
     * @return SucFaceIds 加入成功的人脸ID列表
     */
    public String[] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set 加入成功的人脸ID列表
     *
     * @param SucFaceIds 加入成功的人脸ID列表
     */
    public void setSucFaceIds(String[] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
    }

    /**
     * Get 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，
     * -1601代表不符合图片质量控制要求, -1604 代表人脸相似度没有超过FaceMatchThreshold。
     * 其他非 0 值代表算法服务异常。
     * RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     *
     * @return RetCode 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，
     * -1601代表不符合图片质量控制要求, -1604 代表人脸相似度没有超过FaceMatchThreshold。
     * 其他非 0 值代表算法服务异常。
     * RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public Long[] getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，
     * -1601代表不符合图片质量控制要求, -1604 代表人脸相似度没有超过FaceMatchThreshold。
     * 其他非 0 值代表算法服务异常。
     * RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     *
     * @param RetCode 每张人脸图片添加结果，-1101 代表未检测到人脸，-1102 代表图片解码失败，
     *                -1601代表不符合图片质量控制要求, -1604 代表人脸相似度没有超过FaceMatchThreshold。
     *                其他非 0 值代表算法服务异常。
     *                RetCode的顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public void setRetCode(Long[] RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 加入成功的人脸索引。索引顺序和入参中 Images 或 Urls 的顺序一致。
     * 例， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     *
     * @return SucIndexes 加入成功的人脸索引。索引顺序和入参中 Images 或 Urls 的顺序一致。
     * 例， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     */
    public Long[] getSucIndexes() {
        return this.SucIndexes;
    }

    /**
     * Set 加入成功的人脸索引。索引顺序和入参中 Images 或 Urls 的顺序一致。
     * 例， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     *
     * @param SucIndexes 加入成功的人脸索引。索引顺序和入参中 Images 或 Urls 的顺序一致。
     *                   例， Urls 中 有 3 个 url，第二个 url 失败，则 SucIndexes 值为 [0,2] 。
     */
    public void setSucIndexes(Long[] SucIndexes) {
        this.SucIndexes = SucIndexes;
    }

    /**
     * Get 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     *
     * @return SucFaceRects 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public FaceRect[] getSucFaceRects() {
        return this.SucFaceRects;
    }

    /**
     * Set 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     *
     * @param SucFaceRects 加入成功的人脸框位置。顺序和入参中 Images 或 Urls 的顺序一致。
     */
    public void setSucFaceRects(FaceRect[] SucFaceRects) {
        this.SucFaceRects = SucFaceRects;
    }

    /**
     * Get 人脸识别所用的算法模型版本。
     *
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别所用的算法模型版本。
     *
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

