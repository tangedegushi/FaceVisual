package com.ubtrobot.facevisual.facebean;


import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class AttributeItem {

    /**
    * 属性值
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Type识别概率值，【0,1】,代表判断正确的概率。
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

    /**
     * Get 属性值 
     * @return Type 属性值
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 属性值
     * @param Type 属性值
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Type识别概率值，【0,1】,代表判断正确的概率。 
     * @return Probability Type识别概率值，【0,1】,代表判断正确的概率。
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set Type识别概率值，【0,1】,代表判断正确的概率。
     * @param Probability Type识别概率值，【0,1】,代表判断正确的概率。
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

}

