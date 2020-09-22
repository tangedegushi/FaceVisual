package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class FaceQualityInfo {

    /**
     * 质量分: [0,100]，综合评价图像质量是否适合人脸识别，分数越高质量越好。
     * 正常情况，只需要使用Score作为质量分总体的判断标准即可。Sharpness、Brightness、Completeness等细项分仅供参考。
     * 参考范围：[0,40]较差，[40,60] 一般，[60,80]较好，[80,100]很好。
     * 建议：人脸入库选取70以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * 清晰分：[0,100]，评价图片清晰程度，分数越高越清晰。
     * 参考范围：[0,40]特别模糊，[40,60]模糊，[60,80]一般，[80,100]清晰。
     * 建议：人脸入库选取80以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Sharpness")
    @Expose
    private Long Sharpness;

    /**
     * 光照分：[0,100]，评价图片光照程度，分数越高越亮。
     * 参考范围： [0,30]偏暗，[30,70]光照正常，[70,100]偏亮。
     * 建议：人脸入库选取[30,70]的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Brightness")
    @Expose
    private Long Brightness;

    /**
     * 五官遮挡分，评价眉毛（Eyebrow）、眼睛（Eye）、鼻子（Nose）、脸颊（Cheek）、嘴巴（Mouth）、下巴（Chin）的被遮挡程度。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Completeness")
    @Expose
    private FaceQualityCompleteness Completeness;

    /**
     * Get 质量分: [0,100]，综合评价图像质量是否适合人脸识别，分数越高质量越好。
     * 正常情况，只需要使用Score作为质量分总体的判断标准即可。Sharpness、Brightness、Completeness等细项分仅供参考。
     * 参考范围：[0,40]较差，[40,60] 一般，[60,80]较好，[80,100]很好。
     * 建议：人脸入库选取70以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Score 质量分: [0,100]，综合评价图像质量是否适合人脸识别，分数越高质量越好。
     * 正常情况，只需要使用Score作为质量分总体的判断标准即可。Sharpness、Brightness、Completeness等细项分仅供参考。
     * 参考范围：[0,40]较差，[40,60] 一般，[60,80]较好，[80,100]很好。
     * 建议：人脸入库选取70以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 质量分: [0,100]，综合评价图像质量是否适合人脸识别，分数越高质量越好。
     * 正常情况，只需要使用Score作为质量分总体的判断标准即可。Sharpness、Brightness、Completeness等细项分仅供参考。
     * 参考范围：[0,40]较差，[40,60] 一般，[60,80]较好，[80,100]很好。
     * 建议：人脸入库选取70以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Score 质量分: [0,100]，综合评价图像质量是否适合人脸识别，分数越高质量越好。
     *              正常情况，只需要使用Score作为质量分总体的判断标准即可。Sharpness、Brightness、Completeness等细项分仅供参考。
     *              参考范围：[0,40]较差，[40,60] 一般，[60,80]较好，[80,100]很好。
     *              建议：人脸入库选取70以上的图片。
     *              注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 清晰分：[0,100]，评价图片清晰程度，分数越高越清晰。
     * 参考范围：[0,40]特别模糊，[40,60]模糊，[60,80]一般，[80,100]清晰。
     * 建议：人脸入库选取80以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Sharpness 清晰分：[0,100]，评价图片清晰程度，分数越高越清晰。
     * 参考范围：[0,40]特别模糊，[40,60]模糊，[60,80]一般，[80,100]清晰。
     * 建议：人脸入库选取80以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSharpness() {
        return this.Sharpness;
    }

    /**
     * Set 清晰分：[0,100]，评价图片清晰程度，分数越高越清晰。
     * 参考范围：[0,40]特别模糊，[40,60]模糊，[60,80]一般，[80,100]清晰。
     * 建议：人脸入库选取80以上的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Sharpness 清晰分：[0,100]，评价图片清晰程度，分数越高越清晰。
     *                  参考范围：[0,40]特别模糊，[40,60]模糊，[60,80]一般，[80,100]清晰。
     *                  建议：人脸入库选取80以上的图片。
     *                  注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharpness(Long Sharpness) {
        this.Sharpness = Sharpness;
    }

    /**
     * Get 光照分：[0,100]，评价图片光照程度，分数越高越亮。
     * 参考范围： [0,30]偏暗，[30,70]光照正常，[70,100]偏亮。
     * 建议：人脸入库选取[30,70]的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Brightness 光照分：[0,100]，评价图片光照程度，分数越高越亮。
     * 参考范围： [0,30]偏暗，[30,70]光照正常，[70,100]偏亮。
     * 建议：人脸入库选取[30,70]的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBrightness() {
        return this.Brightness;
    }

    /**
     * Set 光照分：[0,100]，评价图片光照程度，分数越高越亮。
     * 参考范围： [0,30]偏暗，[30,70]光照正常，[70,100]偏亮。
     * 建议：人脸入库选取[30,70]的图片。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Brightness 光照分：[0,100]，评价图片光照程度，分数越高越亮。
     *                   参考范围： [0,30]偏暗，[30,70]光照正常，[70,100]偏亮。
     *                   建议：人脸入库选取[30,70]的图片。
     *                   注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrightness(Long Brightness) {
        this.Brightness = Brightness;
    }

    /**
     * Get 五官遮挡分，评价眉毛（Eyebrow）、眼睛（Eye）、鼻子（Nose）、脸颊（Cheek）、嘴巴（Mouth）、下巴（Chin）的被遮挡程度。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Completeness 五官遮挡分，评价眉毛（Eyebrow）、眼睛（Eye）、鼻子（Nose）、脸颊（Cheek）、嘴巴（Mouth）、下巴（Chin）的被遮挡程度。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceQualityCompleteness getCompleteness() {
        return this.Completeness;
    }

    /**
     * Set 五官遮挡分，评价眉毛（Eyebrow）、眼睛（Eye）、鼻子（Nose）、脸颊（Cheek）、嘴巴（Mouth）、下巴（Chin）的被遮挡程度。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Completeness 五官遮挡分，评价眉毛（Eyebrow）、眼睛（Eye）、鼻子（Nose）、脸颊（Cheek）、嘴巴（Mouth）、下巴（Chin）的被遮挡程度。
     *                     注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteness(FaceQualityCompleteness Completeness) {
        this.Completeness = Completeness;
    }

}
