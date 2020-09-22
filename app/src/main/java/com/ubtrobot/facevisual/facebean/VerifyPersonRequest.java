package com.ubtrobot.facevisual.facebean;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyPersonRequest {

    /**
     * 图片 base64 数据。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * 图片的 Url
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。。
     * 图片的 Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 待验证的人员ID。人员ID具体信息请参考人员库管理相关接口。
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

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

    private VerifyPersonRequest() {
    }

    /**
     * Get 图片 base64 数据。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Image 图片 base64 数据。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 图片 base64 数据。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Image 图片 base64 数据。
     *              jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     *              若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     *              支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 图片的 Url
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。。
     * 图片的 Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @return Url 图片的 Url
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。。
     * 图片的 Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 图片的 Url
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。。
     * 图片的 Url、Image必须提供一个，如果都提供，只使用 Url。
     * 图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     * 非腾讯云存储的Url速度和稳定性可能受一定影响。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     *
     * @param Url 图片的 Url
     *            jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。。
     *            图片的 Url、Image必须提供一个，如果都提供，只使用 Url。
     *            图片存储于腾讯云的Url可保障更高下载速度和稳定性，建议图片存储于腾讯云。
     *            非腾讯云存储的Url速度和稳定性可能受一定影响。
     *            若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     *            支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 待验证的人员ID。人员ID具体信息请参考人员库管理相关接口。
     *
     * @return PersonId 待验证的人员ID。人员ID具体信息请参考人员库管理相关接口。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 待验证的人员ID。人员ID具体信息请参考人员库管理相关接口。
     *
     * @param PersonId 待验证的人员ID。人员ID具体信息请参考人员库管理相关接口。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
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
        private String Image;
        private String Url;
        private String PersonId;
        private Long QualityControl;
        private Long NeedRotateDetection;

        public Builder(@NonNull String personId) {
            PersonId = personId;
        }

        public void setImage(String image) {
            Image = image;
        }

        public void setUrl(String url) {
            Url = url;
        }

        public void setPersonId(String personId) {
            PersonId = personId;
        }

        public void setQualityControl(Long qualityControl) {
            QualityControl = qualityControl;
        }

        public void setNeedRotateDetection(Long needRotateDetection) {
            NeedRotateDetection = needRotateDetection;
        }

        public VerifyPersonRequest build(){
            if (TextUtils.isEmpty(Image) && TextUtils.isEmpty(Url)) {
                throw new RuntimeException("人脸验证必须提供相关的人脸信息：ImageA or UrlA 或者 ImageB or UrlB");
            }
            VerifyPersonRequest request = new VerifyPersonRequest();
            return request;
        }
    }

}

