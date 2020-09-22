package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class HeadPose {

    /**
     * 上下偏移[-30,30]。
     */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
     * 左右偏移[-30,30]。
     */
    @SerializedName("Yaw")
    @Expose
    private Long Yaw;

    /**
     * 平面旋转[-180,180]。
     */
    @SerializedName("Roll")
    @Expose
    private Long Roll;

    /**
     * Get 上下偏移[-30,30]。
     *
     * @return Pitch 上下偏移[-30,30]。
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set 上下偏移[-30,30]。
     *
     * @param Pitch 上下偏移[-30,30]。
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    /**
     * Get 左右偏移[-30,30]。
     *
     * @return Yaw 左右偏移[-30,30]。
     */
    public Long getYaw() {
        return this.Yaw;
    }

    /**
     * Set 左右偏移[-30,30]。
     *
     * @param Yaw 左右偏移[-30,30]。
     */
    public void setYaw(Long Yaw) {
        this.Yaw = Yaw;
    }

    /**
     * Get 平面旋转[-180,180]。
     *
     * @return Roll 平面旋转[-180,180]。
     */
    public Long getRoll() {
        return this.Roll;
    }

    /**
     * Set 平面旋转[-180,180]。
     *
     * @param Roll 平面旋转[-180,180]。
     */
    public void setRoll(Long Roll) {
        this.Roll = Roll;
    }

}

