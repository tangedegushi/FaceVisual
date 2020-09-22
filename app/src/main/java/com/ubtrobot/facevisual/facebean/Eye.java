package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;


public class Eye {

    /**
     * 识别是否佩戴眼镜。
     * AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     */
    @SerializedName("Glass")
    @Expose
    private AttributeItem Glass;

    /**
     * 识别眼睛的睁开、闭合状态。
     * AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     */
    @SerializedName("EyeOpen")
    @Expose
    private AttributeItem EyeOpen;

    /**
     * 识别是否双眼皮。
     * AttributeItem对应的Type为 —— 0：无，1：有。
     */
    @SerializedName("EyelidType")
    @Expose
    private AttributeItem EyelidType;

    /**
     * 眼睛大小。
     * AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     */
    @SerializedName("EyeSize")
    @Expose
    private AttributeItem EyeSize;

    /**
     * Get 识别是否佩戴眼镜。
     * AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     *
     * @return Glass 识别是否佩戴眼镜。
     * AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     */
    public AttributeItem getGlass() {
        return this.Glass;
    }

    /**
     * Set 识别是否佩戴眼镜。
     * AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     *
     * @param Glass 识别是否佩戴眼镜。
     *              AttributeItem对应的Type为 —— 0：无眼镜，1：普通眼镜，2：墨镜
     */
    public void setGlass(AttributeItem Glass) {
        this.Glass = Glass;
    }

    /**
     * Get 识别眼睛的睁开、闭合状态。
     * AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     *
     * @return EyeOpen 识别眼睛的睁开、闭合状态。
     * AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     */
    public AttributeItem getEyeOpen() {
        return this.EyeOpen;
    }

    /**
     * Set 识别眼睛的睁开、闭合状态。
     * AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     *
     * @param EyeOpen 识别眼睛的睁开、闭合状态。
     *                AttributeItem对应的Type为 —— 0：睁开，1：闭眼
     */
    public void setEyeOpen(AttributeItem EyeOpen) {
        this.EyeOpen = EyeOpen;
    }

    /**
     * Get 识别是否双眼皮。
     * AttributeItem对应的Type为 —— 0：无，1：有。
     *
     * @return EyelidType 识别是否双眼皮。
     * AttributeItem对应的Type为 —— 0：无，1：有。
     */
    public AttributeItem getEyelidType() {
        return this.EyelidType;
    }

    /**
     * Set 识别是否双眼皮。
     * AttributeItem对应的Type为 —— 0：无，1：有。
     *
     * @param EyelidType 识别是否双眼皮。
     *                   AttributeItem对应的Type为 —— 0：无，1：有。
     */
    public void setEyelidType(AttributeItem EyelidType) {
        this.EyelidType = EyelidType;
    }

    /**
     * Get 眼睛大小。
     * AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     *
     * @return EyeSize 眼睛大小。
     * AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     */
    public AttributeItem getEyeSize() {
        return this.EyeSize;
    }

    /**
     * Set 眼睛大小。
     * AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     *
     * @param EyeSize 眼睛大小。
     *                AttributeItem对应的Type为 —— 0：小眼睛，1：普通眼睛，2：大眼睛。
     */
    public void setEyeSize(AttributeItem EyeSize) {
        this.EyeSize = EyeSize;
    }

}

