package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Mouth {

    /**
     * 是否张嘴信息。
     * AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     */
    @SerializedName("MouthOpen")
    @Expose
    private AttributeItem MouthOpen;

    /**
     * Get 是否张嘴信息。
     * AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     *
     * @return MouthOpen 是否张嘴信息。
     * AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     */
    public AttributeItem getMouthOpen() {
        return this.MouthOpen;
    }

    /**
     * Set 是否张嘴信息。
     * AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     *
     * @param MouthOpen 是否张嘴信息。
     *                  AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     */
    public void setMouthOpen(AttributeItem MouthOpen) {
        this.MouthOpen = MouthOpen;
    }

}

