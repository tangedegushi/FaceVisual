package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Point {

    /**
     * x坐标
     */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
     * Y坐标
     */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get x坐标
     *
     * @return X x坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set x坐标
     *
     * @param X x坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get Y坐标
     *
     * @return Y Y坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set Y坐标
     *
     * @param Y Y坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

}

