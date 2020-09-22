package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class DetectFaceResponse {

    /**
     * 请求的图片宽度。
     */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
     * 请求的图片高度。
     */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
     * 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    @SerializedName("FaceInfos")
    @Expose
    private FaceInfo[] FaceInfos;

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
     * Get 请求的图片宽度。
     *
     * @return ImageWidth 请求的图片宽度。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 请求的图片宽度。
     *
     * @param ImageWidth 请求的图片宽度。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 请求的图片高度。
     *
     * @return ImageHeight 请求的图片高度。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 请求的图片高度。
     *
     * @param ImageHeight 请求的图片高度。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     *
     * @return FaceInfos 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public FaceInfo[] getFaceInfos() {
        return this.FaceInfos;
    }

    /**
     * Set 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     *
     * @param FaceInfos 人脸信息列表。包含人脸坐标信息、属性信息（若需要）、质量分信息（若需要）。
     */
    public void setFaceInfos(FaceInfo[] FaceInfos) {
        this.FaceInfos = FaceInfos;
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

