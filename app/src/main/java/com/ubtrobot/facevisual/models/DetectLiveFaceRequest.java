package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class DetectLiveFaceRequest {

    /**
     * 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。（图片的宽高比请接近3:4，不符合宽高比的图片返回的分值不具备参考意义）。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * （图片的宽高比请接近 3:4，不符合宽高比的图片返回的分值不具备参考意义）
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。（图片的宽高比请接近3:4，不符合宽高比的图片返回的分值不具备参考意义）。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。（图片的宽高比请接近3:4，不符合宽高比的图片返回的分值不具备参考意义）。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。（图片的宽高比请接近3:4，不符合宽高比的图片返回的分值不具备参考意义）。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。
     *              jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。（图片的宽高比请接近3:4，不符合宽高比的图片返回的分值不具备参考意义）。
     *              支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * （图片的宽高比请接近 3:4，不符合宽高比的图片返回的分值不具备参考意义）
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * （图片的宽高比请接近 3:4，不符合宽高比的图片返回的分值不具备参考意义）
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * （图片的宽高比请接近 3:4，不符合宽高比的图片返回的分值不具备参考意义）
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Url 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     *            jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *            Url、Image必须提供一个，如果都提供，只使用 Url。
     *            （图片的宽高比请接近 3:4，不符合宽高比的图片返回的分值不具备参考意义）
     *            图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     *            非腾讯云存储的Url速度和稳定性可能受一定影响。
     *            支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     *
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     *
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     *                         2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     *                         不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

}

