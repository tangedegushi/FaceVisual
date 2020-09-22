package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DenseFaceShape {

    /**
    * 人脸框左上角横坐标。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 人脸框左上角纵坐标。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 人脸框宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 人脸框高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 描述左侧眼睛轮廓的 XX 点。
    */
    @SerializedName("LeftEye")
    @Expose
    private Point [] LeftEye;

    /**
    * 描述右侧眼睛轮廓的 XX 点。
    */
    @SerializedName("RightEye")
    @Expose
    private Point [] RightEye;

    /**
    * 描述左侧眉毛轮廓的 XX 点。
    */
    @SerializedName("LeftEyeBrow")
    @Expose
    private Point [] LeftEyeBrow;

    /**
    * 描述右侧眉毛轮廓的 XX 点。
    */
    @SerializedName("RightEyeBrow")
    @Expose
    private Point [] RightEyeBrow;

    /**
    * 描述外嘴巴轮廓的 XX 点， 从左侧开始逆时针返回。
    */
    @SerializedName("MouthOutside")
    @Expose
    private Point [] MouthOutside;

    /**
    * 描述内嘴巴轮廓的 XX 点，从左侧开始逆时针返回。
    */
    @SerializedName("MouthInside")
    @Expose
    private Point [] MouthInside;

    /**
    * 描述鼻子轮廓的 XX 点。
    */
    @SerializedName("Nose")
    @Expose
    private Point [] Nose;

    /**
    * 左瞳孔轮廓的 XX 个点。
    */
    @SerializedName("LeftPupil")
    @Expose
    private Point [] LeftPupil;

    /**
    * 右瞳孔轮廓的 XX 个点。
    */
    @SerializedName("RightPupil")
    @Expose
    private Point [] RightPupil;

    /**
    * 中轴线轮廓的 XX 个点。
    */
    @SerializedName("CentralAxis")
    @Expose
    private Point [] CentralAxis;

    /**
    * 下巴轮廓的 XX 个点。
    */
    @SerializedName("Chin")
    @Expose
    private Point [] Chin;

    /**
    * 左眼袋的 XX 个点。
    */
    @SerializedName("LeftEyeBags")
    @Expose
    private Point [] LeftEyeBags;

    /**
    * 右眼袋的 XX 个点。
    */
    @SerializedName("RightEyeBags")
    @Expose
    private Point [] RightEyeBags;

    /**
    * 额头的 XX 个点。
    */
    @SerializedName("Forehead")
    @Expose
    private Point [] Forehead;

    /**
     * Get 人脸框左上角横坐标。 
     * @return X 人脸框左上角横坐标。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 人脸框左上角横坐标。
     * @param X 人脸框左上角横坐标。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 人脸框左上角纵坐标。 
     * @return Y 人脸框左上角纵坐标。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 人脸框左上角纵坐标。
     * @param Y 人脸框左上角纵坐标。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 人脸框宽度。 
     * @return Width 人脸框宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人脸框宽度。
     * @param Width 人脸框宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 人脸框高度。 
     * @return Height 人脸框高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人脸框高度。
     * @param Height 人脸框高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 描述左侧眼睛轮廓的 XX 点。 
     * @return LeftEye 描述左侧眼睛轮廓的 XX 点。
     */
    public Point [] getLeftEye() {
        return this.LeftEye;
    }

    /**
     * Set 描述左侧眼睛轮廓的 XX 点。
     * @param LeftEye 描述左侧眼睛轮廓的 XX 点。
     */
    public void setLeftEye(Point [] LeftEye) {
        this.LeftEye = LeftEye;
    }

    /**
     * Get 描述右侧眼睛轮廓的 XX 点。 
     * @return RightEye 描述右侧眼睛轮廓的 XX 点。
     */
    public Point [] getRightEye() {
        return this.RightEye;
    }

    /**
     * Set 描述右侧眼睛轮廓的 XX 点。
     * @param RightEye 描述右侧眼睛轮廓的 XX 点。
     */
    public void setRightEye(Point [] RightEye) {
        this.RightEye = RightEye;
    }

    /**
     * Get 描述左侧眉毛轮廓的 XX 点。 
     * @return LeftEyeBrow 描述左侧眉毛轮廓的 XX 点。
     */
    public Point [] getLeftEyeBrow() {
        return this.LeftEyeBrow;
    }

    /**
     * Set 描述左侧眉毛轮廓的 XX 点。
     * @param LeftEyeBrow 描述左侧眉毛轮廓的 XX 点。
     */
    public void setLeftEyeBrow(Point [] LeftEyeBrow) {
        this.LeftEyeBrow = LeftEyeBrow;
    }

    /**
     * Get 描述右侧眉毛轮廓的 XX 点。 
     * @return RightEyeBrow 描述右侧眉毛轮廓的 XX 点。
     */
    public Point [] getRightEyeBrow() {
        return this.RightEyeBrow;
    }

    /**
     * Set 描述右侧眉毛轮廓的 XX 点。
     * @param RightEyeBrow 描述右侧眉毛轮廓的 XX 点。
     */
    public void setRightEyeBrow(Point [] RightEyeBrow) {
        this.RightEyeBrow = RightEyeBrow;
    }

    /**
     * Get 描述外嘴巴轮廓的 XX 点， 从左侧开始逆时针返回。 
     * @return MouthOutside 描述外嘴巴轮廓的 XX 点， 从左侧开始逆时针返回。
     */
    public Point [] getMouthOutside() {
        return this.MouthOutside;
    }

    /**
     * Set 描述外嘴巴轮廓的 XX 点， 从左侧开始逆时针返回。
     * @param MouthOutside 描述外嘴巴轮廓的 XX 点， 从左侧开始逆时针返回。
     */
    public void setMouthOutside(Point [] MouthOutside) {
        this.MouthOutside = MouthOutside;
    }

    /**
     * Get 描述内嘴巴轮廓的 XX 点，从左侧开始逆时针返回。 
     * @return MouthInside 描述内嘴巴轮廓的 XX 点，从左侧开始逆时针返回。
     */
    public Point [] getMouthInside() {
        return this.MouthInside;
    }

    /**
     * Set 描述内嘴巴轮廓的 XX 点，从左侧开始逆时针返回。
     * @param MouthInside 描述内嘴巴轮廓的 XX 点，从左侧开始逆时针返回。
     */
    public void setMouthInside(Point [] MouthInside) {
        this.MouthInside = MouthInside;
    }

    /**
     * Get 描述鼻子轮廓的 XX 点。 
     * @return Nose 描述鼻子轮廓的 XX 点。
     */
    public Point [] getNose() {
        return this.Nose;
    }

    /**
     * Set 描述鼻子轮廓的 XX 点。
     * @param Nose 描述鼻子轮廓的 XX 点。
     */
    public void setNose(Point [] Nose) {
        this.Nose = Nose;
    }

    /**
     * Get 左瞳孔轮廓的 XX 个点。 
     * @return LeftPupil 左瞳孔轮廓的 XX 个点。
     */
    public Point [] getLeftPupil() {
        return this.LeftPupil;
    }

    /**
     * Set 左瞳孔轮廓的 XX 个点。
     * @param LeftPupil 左瞳孔轮廓的 XX 个点。
     */
    public void setLeftPupil(Point [] LeftPupil) {
        this.LeftPupil = LeftPupil;
    }

    /**
     * Get 右瞳孔轮廓的 XX 个点。 
     * @return RightPupil 右瞳孔轮廓的 XX 个点。
     */
    public Point [] getRightPupil() {
        return this.RightPupil;
    }

    /**
     * Set 右瞳孔轮廓的 XX 个点。
     * @param RightPupil 右瞳孔轮廓的 XX 个点。
     */
    public void setRightPupil(Point [] RightPupil) {
        this.RightPupil = RightPupil;
    }

    /**
     * Get 中轴线轮廓的 XX 个点。 
     * @return CentralAxis 中轴线轮廓的 XX 个点。
     */
    public Point [] getCentralAxis() {
        return this.CentralAxis;
    }

    /**
     * Set 中轴线轮廓的 XX 个点。
     * @param CentralAxis 中轴线轮廓的 XX 个点。
     */
    public void setCentralAxis(Point [] CentralAxis) {
        this.CentralAxis = CentralAxis;
    }

    /**
     * Get 下巴轮廓的 XX 个点。 
     * @return Chin 下巴轮廓的 XX 个点。
     */
    public Point [] getChin() {
        return this.Chin;
    }

    /**
     * Set 下巴轮廓的 XX 个点。
     * @param Chin 下巴轮廓的 XX 个点。
     */
    public void setChin(Point [] Chin) {
        this.Chin = Chin;
    }

    /**
     * Get 左眼袋的 XX 个点。 
     * @return LeftEyeBags 左眼袋的 XX 个点。
     */
    public Point [] getLeftEyeBags() {
        return this.LeftEyeBags;
    }

    /**
     * Set 左眼袋的 XX 个点。
     * @param LeftEyeBags 左眼袋的 XX 个点。
     */
    public void setLeftEyeBags(Point [] LeftEyeBags) {
        this.LeftEyeBags = LeftEyeBags;
    }

    /**
     * Get 右眼袋的 XX 个点。 
     * @return RightEyeBags 右眼袋的 XX 个点。
     */
    public Point [] getRightEyeBags() {
        return this.RightEyeBags;
    }

    /**
     * Set 右眼袋的 XX 个点。
     * @param RightEyeBags 右眼袋的 XX 个点。
     */
    public void setRightEyeBags(Point [] RightEyeBags) {
        this.RightEyeBags = RightEyeBags;
    }

    /**
     * Get 额头的 XX 个点。 
     * @return Forehead 额头的 XX 个点。
     */
    public Point [] getForehead() {
        return this.Forehead;
    }

    /**
     * Set 额头的 XX 个点。
     * @param Forehead 额头的 XX 个点。
     */
    public void setForehead(Point [] Forehead) {
        this.Forehead = Forehead;
    }

}

