package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Eyebrow {

    /**
     * 眉毛浓密。
     * AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     */
    @SerializedName("EyebrowDensity")
    @Expose
    private AttributeItem EyebrowDensity;

    /**
     * 眉毛弯曲。
     * AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     */
    @SerializedName("EyebrowCurve")
    @Expose
    private AttributeItem EyebrowCurve;

    /**
     * 眉毛长短。
     * AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     */
    @SerializedName("EyebrowLength")
    @Expose
    private AttributeItem EyebrowLength;

    /**
     * Get 眉毛浓密。
     * AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     *
     * @return EyebrowDensity 眉毛浓密。
     * AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     */
    public AttributeItem getEyebrowDensity() {
        return this.EyebrowDensity;
    }

    /**
     * Set 眉毛浓密。
     * AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     *
     * @param EyebrowDensity 眉毛浓密。
     *                       AttributeItem对应的Type为 —— 0：淡眉，1：浓眉。
     */
    public void setEyebrowDensity(AttributeItem EyebrowDensity) {
        this.EyebrowDensity = EyebrowDensity;
    }

    /**
     * Get 眉毛弯曲。
     * AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     *
     * @return EyebrowCurve 眉毛弯曲。
     * AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     */
    public AttributeItem getEyebrowCurve() {
        return this.EyebrowCurve;
    }

    /**
     * Set 眉毛弯曲。
     * AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     *
     * @param EyebrowCurve 眉毛弯曲。
     *                     AttributeItem对应的Type为 —— 0：不弯，1：弯眉。
     */
    public void setEyebrowCurve(AttributeItem EyebrowCurve) {
        this.EyebrowCurve = EyebrowCurve;
    }

    /**
     * Get 眉毛长短。
     * AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     *
     * @return EyebrowLength 眉毛长短。
     * AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     */
    public AttributeItem getEyebrowLength() {
        return this.EyebrowLength;
    }

    /**
     * Set 眉毛长短。
     * AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     *
     * @param EyebrowLength 眉毛长短。
     *                      AttributeItem对应的Type为 —— 0：短眉毛，1：长眉毛。
     */
    public void setEyebrowLength(AttributeItem EyebrowLength) {
        this.EyebrowLength = EyebrowLength;
    }

}

