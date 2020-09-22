package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CreateFaceRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Images")
    @Expose
    private String[] Images;

    /**
     * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     */
    @SerializedName("Urls")
    @Expose
    private String[] Urls;

    /**
     * 只有和该人员已有的人脸相似度超过FaceMatchThreshold值的人脸，才能增加人脸成功。
     * 默认值60分。取值范围[0,100] 。
     */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
     * 图片质量控制。
     * 0: 不进行控制；
     * 1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；
     * 2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；
     * 3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；
     * 4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题；
     * 默认 0。
     * 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    @SerializedName("QualityControl")
    @Expose
    private Long QualityControl;

    /**
     * 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId
     *
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId
     *
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Images 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String[] getImages() {
        return this.Images;
    }

    /**
     * Set 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Images 图片 base64 数据，base64 编码后大小不可超过5M。
     *               jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *               人员人脸总数量不可超过5张。
     *               若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     *               支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImages(String[] Images) {
        this.Images = Images;
    }

    /**
     * Get 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     *
     * @return Urls 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     */
    public String[] getUrls() {
        return this.Urls;
    }

    /**
     * Set 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     * 人员人脸总数量不可超过5张。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     *
     * @param Urls 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
     *             jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *             Url、Image必须提供一个，如果都提供，只使用 Url。
     *             图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     *             非腾讯云存储的Url速度和稳定性可能受一定影响。
     *             支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *             人员人脸总数量不可超过5张。
     *             若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     */
    public void setUrls(String[] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 只有和该人员已有的人脸相似度超过FaceMatchThreshold值的人脸，才能增加人脸成功。
     * 默认值60分。取值范围[0,100] 。
     *
     * @return FaceMatchThreshold 只有和该人员已有的人脸相似度超过FaceMatchThreshold值的人脸，才能增加人脸成功。
     * 默认值60分。取值范围[0,100] 。
     */
    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    /**
     * Set 只有和该人员已有的人脸相似度超过FaceMatchThreshold值的人脸，才能增加人脸成功。
     * 默认值60分。取值范围[0,100] 。
     *
     * @param FaceMatchThreshold 只有和该人员已有的人脸相似度超过FaceMatchThreshold值的人脸，才能增加人脸成功。
     *                           默认值60分。取值范围[0,100] 。
     */
    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    /**
     * Get 图片质量控制。
     * 0: 不进行控制；
     * 1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；
     * 2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；
     * 3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；
     * 4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题；
     * 默认 0。
     * 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     *
     * @return QualityControl 图片质量控制。
     * 0: 不进行控制；
     * 1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；
     * 2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；
     * 3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；
     * 4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题；
     * 默认 0。
     * 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public Long getQualityControl() {
        return this.QualityControl;
    }

    /**
     * Set 图片质量控制。
     * 0: 不进行控制；
     * 1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；
     * 2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；
     * 3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；
     * 4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题；
     * 默认 0。
     * 若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     *
     * @param QualityControl 图片质量控制。
     *                       0: 不进行控制；
     *                       1:较低的质量要求，图像存在非常模糊，眼睛鼻子嘴巴遮挡至少其中一种或多种的情况；
     *                       2: 一般的质量要求，图像存在偏亮，偏暗，模糊或一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，至少其中三种的情况；
     *                       3: 较高的质量要求，图像存在偏亮，偏暗，一般模糊，眉毛遮挡，脸颊遮挡，下巴遮挡，其中一到两种的情况；
     *                       4: 很高的质量要求，各个维度均为最好或最多在某一维度上存在轻微问题；
     *                       默认 0。
     *                       若图片质量不满足要求，则返回结果中会提示图片质量检测不符要求。
     */
    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
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

    public class Builder{
        private String PersonId;
        private String[] Images;
        private String[] Urls;
        private Float FaceMatchThreshold;
        private Long QualityControl;
        private Long NeedRotateDetection;

        public Builder(String personId) {
            PersonId = personId;
        }

        public Builder setPersonId(String personId) {
            PersonId = personId;
            return this;
        }

        public Builder setImages(String[] images) {
            Images = images;
            return this;
        }

        public Builder setUrls(String[] urls) {
            Urls = urls;
            return this;
        }

        public Builder setFaceMatchThreshold(Float faceMatchThreshold) {
            FaceMatchThreshold = faceMatchThreshold;
            return this;
        }

        public Builder setQualityControl(Long qualityControl) {
            QualityControl = qualityControl;
            return this;
        }

        public Builder setNeedRotateDetection(Long needRotateDetection) {
            NeedRotateDetection = needRotateDetection;
            return this;
        }

        public CreateFaceRequest build(){
            if (Images == null && Urls == null) {
                throw new RuntimeException("增加人脸必须要设置图片相关信息： Images 或 Urls");
            }
            CreateFaceRequest request = new CreateFaceRequest();
            request.setPersonId(PersonId);
            request.setFaceMatchThreshold(FaceMatchThreshold);
            request.setImages(Images);
            request.setNeedRotateDetection(NeedRotateDetection);
            request.setQualityControl(QualityControl);
            request.setUrls(Urls);
            return request;
        }
    }

}

