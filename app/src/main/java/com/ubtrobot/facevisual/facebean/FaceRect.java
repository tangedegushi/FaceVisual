package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class FaceRect {

    /**
     * 人脸框左上角横坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
     * 人脸框左上角纵坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * 人脸宽度
     */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * 人脸高度
     */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 人脸框左上角横坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     *
     * @return X 人脸框左上角横坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 人脸框左上角横坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     *
     * @param X 人脸框左上角横坐标。
     *          人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     *          若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 人脸框左上角纵坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     *
     * @return Y 人脸框左上角纵坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 人脸框左上角纵坐标。
     * 人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     * 若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     *
     * @param Y 人脸框左上角纵坐标。
     *          人脸框包含人脸五官位置并在此基础上进行一定的扩展，若人脸框超出图片范围，会导致坐标负值。
     *          若需截取完整人脸，可以在完整分completess满足需求的情况下，将负值坐标取0。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 人脸宽度
     *
     * @return Width 人脸宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人脸宽度
     *
     * @param Width 人脸宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 人脸高度
     *
     * @return Height 人脸高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人脸高度
     *
     * @param Height 人脸高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

}

