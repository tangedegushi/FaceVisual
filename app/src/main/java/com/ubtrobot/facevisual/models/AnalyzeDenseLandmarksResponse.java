package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyzeDenseLandmarksResponse {

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
    * 稠密人脸关键点具体信息。
    */
    @SerializedName("DenseFaceShapeSet")
    @Expose
    private DenseFaceShape [] DenseFaceShapeSet;

    /**
    * 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
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
     * @return ImageWidth 请求的图片宽度。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 请求的图片宽度。
     * @param ImageWidth 请求的图片宽度。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 请求的图片高度。 
     * @return ImageHeight 请求的图片高度。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 请求的图片高度。
     * @param ImageHeight 请求的图片高度。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 稠密人脸关键点具体信息。 
     * @return DenseFaceShapeSet 稠密人脸关键点具体信息。
     */
    public DenseFaceShape [] getDenseFaceShapeSet() {
        return this.DenseFaceShapeSet;
    }

    /**
     * Set 稠密人脸关键点具体信息。
     * @param DenseFaceShapeSet 稠密人脸关键点具体信息。
     */
    public void setDenseFaceShapeSet(DenseFaceShape [] DenseFaceShapeSet) {
        this.DenseFaceShapeSet = DenseFaceShapeSet;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。 
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持 “3.0“ 输入。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
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

