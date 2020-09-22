package com.ubtrobot.facevisual.facebean;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPersonsRequest {

    /**
     * 希望搜索的人员库列表，上限100个。数组元素取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupIds")
    @Expose
    private String[] GroupIds;

    /**
     * 图片 base64 数据，base64 编码后大小不可超过5M。
     * jpg格式长边像素不可超过4000，其他格式图片长边像素不可超2000。
     * 若图片中包含多张人脸，只选取其中人脸面积最大的人脸。
     * 支持PNG、JPG、JPEG、BMP，不支持 GIF 图片。
     */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * 图片的 Url 。对应图片 base64 编码后大小不可超过5M。
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
     * 最多识别的人脸数目。默认值为1（仅检测图片中面积最大的那张人脸），最大值为10。
     * MaxFaceNum用于，当输入的待识别图片包含多张人脸时，设定要搜索的人脸的数量。
     * 例：输入的Image或Url中的图片包含多张人脸，设MaxFaceNum=5，则会识别图片中面积最大的5张人脸。
     */
    @SerializedName("MaxFaceNum")
    @Expose
    private Long MaxFaceNum;

    /**
     * 人脸长和宽的最小尺寸，单位为像素。默认为34。低于34将影响搜索精度。建议设置为80。
     */
    @SerializedName("MinFaceSize")
    @Expose
    private Long MinFaceSize;

    /**
     * 单张被识别的人脸返回的最相似人员数量。默认值为5，最大值为100。
     * 例，设MaxFaceNum为1，MaxPersonNum为8，则返回Top8相似的人员信息。
     * 值越大，需要处理的时间越长。建议不要超过10。
     */
    @SerializedName("MaxPersonNum")
    @Expose
    private Long MaxPersonNum;

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
     * 出参Score中，只有大于等于FaceMatchThreshold值的结果才会返回。默认为0。取值范围[0.0,100.0) 。
     */
    @SerializedName("FaceMatchThreshold")
    @Expose
    private Float FaceMatchThreshold;

    /**
     * 是否返回人员具体信息。0 为关闭，1 为开启。默认为 0。其他非0非1值默认为0
     */
    @SerializedName("NeedPersonInfo")
    @Expose
    private Long NeedPersonInfo;

    /**
     * 是否开启图片旋转识别支持。0为不开启，1为开启。默认为0。本参数的作用为，当图片中的人脸被旋转且图片没有exif信息时，如果不开启图片旋转识别支持则无法正确检测、识别图片中的人脸。若您确认图片包含exif信息或者您确认输入图中人脸不会出现被旋转情况，请不要开启本参数。开启后，整体耗时将可能增加数百毫秒。
     */
    @SerializedName("NeedRotateDetection")
    @Expose
    private Long NeedRotateDetection;

    /**
     * Get 希望搜索的人员库列表，上限100个。数组元素取值为创建人员库接口中的GroupId
     *
     * @return GroupIds 希望搜索的人员库列表，上限100个。数组元素取值为创建人员库接口中的GroupId
     */
    public String[] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 希望搜索的人员库列表，上限100个。数组元素取值为创建人员库接口中的GroupId
     *
     * @param GroupIds 希望搜索的人员库列表，上限100个。数组元素取值为创建人员库接口中的GroupId
     */
    public void setGroupIds(String[] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public String getImage() {
        return this.Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getUrl() {
        return this.Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Long getMaxFaceNum() {
        return this.MaxFaceNum;
    }

    public void setMaxFaceNum(Long MaxFaceNum) {
        this.MaxFaceNum = MaxFaceNum;
    }

    public Long getMinFaceSize() {
        return this.MinFaceSize;
    }

    public void setMinFaceSize(Long MinFaceSize) {
        this.MinFaceSize = MinFaceSize;
    }

    public Long getMaxPersonNum() {
        return this.MaxPersonNum;
    }

    public void setMaxPersonNum(Long MaxPersonNum) {
        this.MaxPersonNum = MaxPersonNum;
    }

    public Long getQualityControl() {
        return this.QualityControl;
    }

    public void setQualityControl(Long QualityControl) {
        this.QualityControl = QualityControl;
    }

    public Float getFaceMatchThreshold() {
        return this.FaceMatchThreshold;
    }

    public void setFaceMatchThreshold(Float FaceMatchThreshold) {
        this.FaceMatchThreshold = FaceMatchThreshold;
    }

    public Long getNeedPersonInfo() {
        return this.NeedPersonInfo;
    }

    public void setNeedPersonInfo(Long NeedPersonInfo) {
        this.NeedPersonInfo = NeedPersonInfo;
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
        private String[] GroupIds;
        private String Image;
        private String Url;
        private Long MaxFaceNum;
        private Long MinFaceSize;
        private Long MaxPersonNum;
        private Long QualityControl;
        private Float FaceMatchThreshold;
        private Long NeedPersonInfo;
        private Long NeedRotateDetection;

        public Builder(@NonNull String[] groupIds) {
            GroupIds = groupIds;
        }

        public void setGroupIds(String[] groupIds) {
            GroupIds = groupIds;
        }

        public void setImage(String image) {
            Image = image;
        }

        public void setUrl(String url) {
            Url = url;
        }

        public void setMaxFaceNum(Long maxFaceNum) {
            MaxFaceNum = maxFaceNum;
        }

        public void setMinFaceSize(Long minFaceSize) {
            MinFaceSize = minFaceSize;
        }

        public void setMaxPersonNum(Long maxPersonNum) {
            MaxPersonNum = maxPersonNum;
        }

        public void setQualityControl(Long qualityControl) {
            QualityControl = qualityControl;
        }

        public void setFaceMatchThreshold(Float faceMatchThreshold) {
            FaceMatchThreshold = faceMatchThreshold;
        }

        public void setNeedPersonInfo(Long needPersonInfo) {
            NeedPersonInfo = needPersonInfo;
        }

        public void setNeedRotateDetection(Long needRotateDetection) {
            NeedRotateDetection = needRotateDetection;
        }

        public SearchPersonsRequest Builder(){
            if (GroupIds != null && GroupIds.length != 0) {
                throw new RuntimeException("至少需要提供一个人员库 GroupId");
            }
            if (TextUtils.isEmpty(Image) && TextUtils.isEmpty(Url)) {
                throw new RuntimeException("人员搜索需要提供人脸图片相关信息：Image or Url");
            }
            SearchPersonsRequest request = new SearchPersonsRequest();
            request.setImage(Image);
            request.setUrl(Url);
            request.setFaceMatchThreshold(FaceMatchThreshold);
            request.setGroupIds(GroupIds);
            request.setMaxFaceNum(MaxFaceNum);
            request.setMinFaceSize(MinFaceSize);
            request.setMaxPersonNum(MaxPersonNum);
            request.setNeedPersonInfo(NeedPersonInfo);
            request.setNeedRotateDetection(NeedRotateDetection);
            request.setQualityControl(QualityControl);
            return request;
        }
    }

}

