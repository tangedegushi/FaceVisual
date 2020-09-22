package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Hair {

    /**
     * 头发长度信息。
     * AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     */
    @SerializedName("Length")
    @Expose
    private AttributeItem Length;

    /**
     * 刘海信息。
     * AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     */
    @SerializedName("Bang")
    @Expose
    private AttributeItem Bang;

    /**
     * 头发颜色信息。
     * AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     */
    @SerializedName("Color")
    @Expose
    private AttributeItem Color;

    /**
     * Get 头发长度信息。
     * AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     *
     * @return Length 头发长度信息。
     * AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     */
    public AttributeItem getLength() {
        return this.Length;
    }

    /**
     * Set 头发长度信息。
     * AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     *
     * @param Length 头发长度信息。
     *               AttributeItem对应的Type为 —— 0：光头，1：短发，2：中发，3：长发，4：绑发。
     */
    public void setLength(AttributeItem Length) {
        this.Length = Length;
    }

    /**
     * Get 刘海信息。
     * AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     *
     * @return Bang 刘海信息。
     * AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     */
    public AttributeItem getBang() {
        return this.Bang;
    }

    /**
     * Set 刘海信息。
     * AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     *
     * @param Bang 刘海信息。
     *             AttributeItem对应的Type为 —— 0：无刘海，1：有刘海。
     */
    public void setBang(AttributeItem Bang) {
        this.Bang = Bang;
    }

    /**
     * Get 头发颜色信息。
     * AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     *
     * @return Color 头发颜色信息。
     * AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     */
    public AttributeItem getColor() {
        return this.Color;
    }

    /**
     * Set 头发颜色信息。
     * AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     *
     * @param Color 头发颜色信息。
     *              AttributeItem对应的Type为 —— 0：黑色，1：金色，2：棕色，3：灰白色。
     */
    public void setColor(AttributeItem Color) {
        this.Color = Color;
    }

}

