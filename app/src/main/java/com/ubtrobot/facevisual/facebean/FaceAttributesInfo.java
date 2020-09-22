package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.ubtrobot.facevisual.models.FaceHairAttributesInfo;

public class FaceAttributesInfo {

    /**
     * 性别[0~49]为女性，[50，100]为男性，越接近0和100表示置信度越高。NeedFaceAttributes 不为 1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * 年龄 [0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
     * 微笑[0(normal，正常)~50(smile，微笑)~100(laugh，大笑)]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    @SerializedName("Expression")
    @Expose
    private Long Expression;

    /**
     * 是否有眼镜 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    @SerializedName("Glass")
    @Expose
    private Boolean Glass;

    /**
     * 上下偏移[-30,30]，单位角度。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
     * 左右偏移[-30,30]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     */
    @SerializedName("Yaw")
    @Expose
    private Long Yaw;

    /**
     * 平面旋转[-180,180]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-20,20]的图片。
     */
    @SerializedName("Roll")
    @Expose
    private Long Roll;

    /**
     * 魅力[0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    @SerializedName("Beauty")
    @Expose
    private Long Beauty;

    /**
     * 是否有帽子 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Hat")
    @Expose
    private Boolean Hat;

    /**
     * 是否有口罩 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Mask")
    @Expose
    private Boolean Mask;

    /**
     * 头发信息，包含头发长度（length）、有无刘海（bang）、头发颜色（color）。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Hair")
    @Expose
    private FaceHairAttributesInfo Hair;

    /**
     * 双眼是否睁开 [true,false]。只要有超过一只眼睛闭眼，就返回false。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("EyeOpen")
    @Expose
    private Boolean EyeOpen;

    /**
     * Get 性别[0~49]为女性，[50，100]为男性，越接近0和100表示置信度越高。NeedFaceAttributes 不为 1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @return Gender 性别[0~49]为女性，[50，100]为男性，越接近0和100表示置信度越高。NeedFaceAttributes 不为 1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 性别[0~49]为女性，[50，100]为男性，越接近0和100表示置信度越高。NeedFaceAttributes 不为 1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @param Gender 性别[0~49]为女性，[50，100]为男性，越接近0和100表示置信度越高。NeedFaceAttributes 不为 1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 年龄 [0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @return Age 年龄 [0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄 [0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @param Age 年龄 [0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 微笑[0(normal，正常)~50(smile，微笑)~100(laugh，大笑)]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @return Expression 微笑[0(normal，正常)~50(smile，微笑)~100(laugh，大笑)]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getExpression() {
        return this.Expression;
    }

    /**
     * Set 微笑[0(normal，正常)~50(smile，微笑)~100(laugh，大笑)]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @param Expression 微笑[0(normal，正常)~50(smile，微笑)~100(laugh，大笑)]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setExpression(Long Expression) {
        this.Expression = Expression;
    }

    /**
     * Get 是否有眼镜 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @return Glass 是否有眼镜 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Boolean getGlass() {
        return this.Glass;
    }

    /**
     * Set 是否有眼镜 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @param Glass 是否有眼镜 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setGlass(Boolean Glass) {
        this.Glass = Glass;
    }

    /**
     * Get 上下偏移[-30,30]，单位角度。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     *
     * @return Pitch 上下偏移[-30,30]，单位角度。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set 上下偏移[-30,30]，单位角度。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     *
     * @param Pitch 上下偏移[-30,30]，单位角度。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *              建议：人脸入库选择[-10,10]的图片。
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get 左右偏移[-30,30]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     *
     * @return Yaw 左右偏移[-30,30]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     */
    public Long getYaw() {
        return this.Yaw;
    }

    /**
     * Set 左右偏移[-30,30]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-10,10]的图片。
     *
     * @param Yaw 左右偏移[-30,30]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *            建议：人脸入库选择[-10,10]的图片。
     */
    public void setYaw(Long Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Get 平面旋转[-180,180]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-20,20]的图片。
     *
     * @return Roll 平面旋转[-180,180]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-20,20]的图片。
     */
    public Long getRoll() {
        return this.Roll;
    }

    /**
     * Set 平面旋转[-180,180]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 建议：人脸入库选择[-20,20]的图片。
     *
     * @param Roll 平面旋转[-180,180]，单位角度。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *             建议：人脸入库选择[-20,20]的图片。
     */
    public void setRoll(Long Roll) {
        this.Roll = Roll;
    }

    /**
     * Get 魅力[0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @return Beauty 魅力[0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public Long getBeauty() {
        return this.Beauty;
    }

    /**
     * Set 魅力[0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *
     * @param Beauty 魅力[0~100]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     */
    public void setBeauty(Long Beauty) {
        this.Beauty = Beauty;
    }

    /**
     * Get 是否有帽子 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Hat 是否有帽子 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHat() {
        return this.Hat;
    }

    /**
     * Set 是否有帽子 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Hat 是否有帽子 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *            注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHat(Boolean Hat) {
        this.Hat = Hat;
    }

    /**
     * Get 是否有口罩 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Mask 是否有口罩 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMask() {
        return this.Mask;
    }

    /**
     * Set 是否有口罩 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Mask 是否有口罩 [true,false]。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *             注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMask(Boolean Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 头发信息，包含头发长度（length）、有无刘海（bang）、头发颜色（color）。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Hair 头发信息，包含头发长度（length）、有无刘海（bang）、头发颜色（color）。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceHairAttributesInfo getHair() {
        return this.Hair;
    }

    /**
     * Set 头发信息，包含头发长度（length）、有无刘海（bang）、头发颜色（color）。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Hair 头发信息，包含头发长度（length）、有无刘海（bang）、头发颜色（color）。NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *             注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHair(FaceHairAttributesInfo Hair) {
        this.Hair = Hair;
    }

    /**
     * Get 双眼是否睁开 [true,false]。只要有超过一只眼睛闭眼，就返回false。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return EyeOpen 双眼是否睁开 [true,false]。只要有超过一只眼睛闭眼，就返回false。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEyeOpen() {
        return this.EyeOpen;
    }

    /**
     * Set 双眼是否睁开 [true,false]。只要有超过一只眼睛闭眼，就返回false。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param EyeOpen 双眼是否睁开 [true,false]。只要有超过一只眼睛闭眼，就返回false。 NeedFaceAttributes 不为1 或检测超过 5 张人脸时，此参数仍返回，但不具备参考意义。
     *                注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEyeOpen(Boolean EyeOpen) {
        this.EyeOpen = EyeOpen;
    }

}

