package com.ubtrobot.facevisual.facebean;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class DetectFaceAttributesRequest {

    /**
     * 最多处理的人脸数目。
     * 默认值为1（仅检测图片中面积最大的那张人脸），最大值为120。
     * 此参数用于控制处理待检测图片中的人脸个数，值越小，处理速度越快。
     */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
     * 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * 图片的 Url 。
     * 对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 是否返回年龄、性别、情绪等属性。
     * 合法值为（大小写不敏感）：None、Age、Beauty、Emotion、Eye、Eyebrow
     * Gender、Hair、Hat、Headpose、Mask、Mouth、Moustache、Nose、Shape、Skin、Smile。
     * None为不需要返回。默认为 None。
     * 需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。
     * 关于各属性的详细描述，参见下文出参。
     * 最多返回面积最大的 5 张人脸属性信息，超过 5 张人脸（第 6 张及以后的人脸）的 AttributesInfo 不具备参考意义。
     */
    @SerializedName("FaceAttributesType")
    @Expose
    private String FaceAttributesType;

    /**
     * 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * 人脸识别服务所用的算法模型版本。本接口仅支持“3.0”输入
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    private DetectFaceAttributesRequest() {
    }

    /**
     * Get 最多处理的人脸数目。
     * 默认值为1（仅检测图片中面积最大的那张人脸），最大值为120。
     * 此参数用于控制处理待检测图片中的人脸个数，值越小，处理速度越快。
     *
     * @return MaxFaceNum 最多处理的人脸数目。
     * 默认值为1（仅检测图片中面积最大的那张人脸），最大值为120。
     * 此参数用于控制处理待检测图片中的人脸个数，值越小，处理速度越快。
     */
    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    /**
     * Set 最多处理的人脸数目。
     * 默认值为1（仅检测图片中面积最大的那张人脸），最大值为120。
     * 此参数用于控制处理待检测图片中的人脸个数，值越小，处理速度越快。
     *
     * @param MaxFaceNum 最多处理的人脸数目。
     *                   默认值为1（仅检测图片中面积最大的那张人脸），最大值为120。
     *                   此参数用于控制处理待检测图片中的人脸个数，值越小，处理速度越快。
     */
    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Image 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Image 图片 base64 数据，base64 编码后大小不可超过5M。
     *              jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *              支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url 。
     * 对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Url 图片的 Url 。
     * 对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url 。
     * 对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Url 图片的 Url 。
     *            对应图片 base64 编码后大小不可超过5M。
     *            jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *            Url、Image必须提供一个，如果都提供，只使用 Url。
     *            图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     *            非腾讯云存储的Url速度和稳定性可能受一定影响。
     *            支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 是否返回年龄、性别、情绪等属性。
     * 合法值为（大小写不敏感）：None、Age、Beauty、Emotion、Eye、Eyebrow
     * Gender、Hair、Hat、Headpose、Mask、Mouth、Moustache、Nose、Shape、Skin、Smile。
     * None为不需要返回。默认为 None。
     * 需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。
     * 关于各属性的详细描述，参见下文出参。
     * 最多返回面积最大的 5 张人脸属性信息，超过 5 张人脸（第 6 张及以后的人脸）的 AttributesInfo 不具备参考意义。
     *
     * @return FaceAttributesType 是否返回年龄、性别、情绪等属性。
     * 合法值为（大小写不敏感）：None、Age、Beauty、Emotion、Eye、Eyebrow
     * Gender、Hair、Hat、Headpose、Mask、Mouth、Moustache、Nose、Shape、Skin、Smile。
     * None为不需要返回。默认为 None。
     * 需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。
     * 关于各属性的详细描述，参见下文出参。
     * 最多返回面积最大的 5 张人脸属性信息，超过 5 张人脸（第 6 张及以后的人脸）的 AttributesInfo 不具备参考意义。
     */
    public String getFaceAttributesType() {
        return this.FaceAttributesType;
    }

    /**
     * Set 是否返回年龄、性别、情绪等属性。
     * 合法值为（大小写不敏感）：None、Age、Beauty、Emotion、Eye、Eyebrow
     * Gender、Hair、Hat、Headpose、Mask、Mouth、Moustache、Nose、Shape、Skin、Smile。
     * None为不需要返回。默认为 None。
     * 需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。
     * 关于各属性的详细描述，参见下文出参。
     * 最多返回面积最大的 5 张人脸属性信息，超过 5 张人脸（第 6 张及以后的人脸）的 AttributesInfo 不具备参考意义。
     *
     * @param FaceAttributesType 是否返回年龄、性别、情绪等属性。
     *                           合法值为（大小写不敏感）：None、Age、Beauty、Emotion、Eye、Eyebrow
     *                           Gender、Hair、Hat、Headpose、Mask、Mouth、Moustache、Nose、Shape、Skin、Smile。
     *                           None为不需要返回。默认为 None。
     *                           需要将属性组成一个用逗号分隔的字符串，属性之间的顺序没有要求。
     *                           关于各属性的详细描述，参见下文出参。
     *                           最多返回面积最大的 5 张人脸属性信息，超过 5 张人脸（第 6 张及以后的人脸）的 AttributesInfo 不具备参考意义。
     */
    public void setFaceAttributesType(String FaceAttributesType) {
        this.FaceAttributesType = FaceAttributesType;
    }

    /**
     * Get 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     *
     * @return NeedRotateDetection 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public Long getNeedRotateDetection() {
        return this.NeedRotateDetection;
    }

    /**
     * Set 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     *
     * @param NeedRotateDetection 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    public void setNeedRotateDetection(Long NeedRotateDetection) {
        this.NeedRotateDetection = NeedRotateDetection;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。本接口仅支持“3.0”输入
     *
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持“3.0”输入
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。本接口仅支持“3.0”输入
     *
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。本接口仅支持“3.0”输入
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public static class Builder {
        private Long MaxFaceNum;
        private String Image;
        private String Url;
        private String FaceAttributesType;
        private Long NeedRotateDetection;
        private String FaceModelVersion;

        public void setMaxFaceNum(Long maxFaceNum) {
            MaxFaceNum = maxFaceNum;
        }

        public Builder setImage(String image) {
            Image = image;
            return this;
        }

        public Builder setUrl(String url) {
            Url = url;
            return this;
        }

        public Builder setFaceAttributesType(String faceAttributesType) {
            FaceAttributesType = faceAttributesType;
            return this;
        }

        public Builder setNeedRotateDetection(Long needRotateDetection) {
            NeedRotateDetection = needRotateDetection;
            return this;
        }

        public Builder setFaceModelVersion(String faceModelVersion) {
            FaceModelVersion = faceModelVersion;
            return this;
        }

        public DetectFaceAttributesRequest build() {
            if (TextUtils.isEmpty(Image) && TextUtils.isEmpty(Url)) {
                throw new RuntimeException("人脸检测需要提供人脸图片相关信息：Image or Url");
            }
            DetectFaceAttributesRequest request = new DetectFaceAttributesRequest();
            request.setImage(Image);
            request.setUrl(Url);
            request.setFaceAttributesType(FaceAttributesType);
            request.setFaceModelVersion(FaceModelVersion);
            request.setMaxFaceNum(MaxFaceNum);
            request.setNeedRotateDetection(NeedRotateDetection);
            return request;
        }
    }

}

