package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Hat {

    /**
     * 帽子佩戴状态信息。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     */
    @SerializedName("Style")
    @Expose
    private AttributeItem Style;

    /**
     * 帽子颜色。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     */
    @SerializedName("Color")
    @Expose
    private AttributeItem Color;

    /**
     * Get 帽子佩戴状态信息。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     *
     * @return Style 帽子佩戴状态信息。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     */
    public AttributeItem getStyle() {
        return this.Style;
    }

    /**
     * Set 帽子佩戴状态信息。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     *
     * @param Style 帽子佩戴状态信息。
     *              AttributeItem对应的Type为 —— 0：不戴帽子，1：普通帽子，2：头盔，3：保安帽。
     */
    public void setStyle(AttributeItem Style) {
        this.Style = Style;
    }

    /**
     * Get 帽子颜色。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     *
     * @return Color 帽子颜色。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     */
    public AttributeItem getColor() {
        return this.Color;
    }

    /**
     * Set 帽子颜色。
     * AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     *
     * @param Color 帽子颜色。
     *              AttributeItem对应的Type为 —— 0：不戴帽子，1：红色系，2：黄色系，3：蓝色系，4：黑色系，5：灰白色系，6：混色系子。
     */
    public void setColor(AttributeItem Color) {
        this.Color = Color;
    }

}

