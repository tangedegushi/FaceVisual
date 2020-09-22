package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class CheckSimilarPersonRequest {

    /**
     * 待整理的人员库列表。
     * 人员库总人数不可超过200万，人员库个数不可超过10个。
     * 数组元素取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupIds")
    @Expose
    private String[] GroupIds;

    /**
     * 人员查重整理力度的控制。
     * 1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
     * 2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

    /**
     * Get 待整理的人员库列表。
     * 人员库总人数不可超过200万，人员库个数不可超过10个。
     * 数组元素取值为创建人员库接口中的GroupId
     *
     * @return GroupIds 待整理的人员库列表。
     * 人员库总人数不可超过200万，人员库个数不可超过10个。
     * 数组元素取值为创建人员库接口中的GroupId
     */
    public String[] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 待整理的人员库列表。
     * 人员库总人数不可超过200万，人员库个数不可超过10个。
     * 数组元素取值为创建人员库接口中的GroupId
     *
     * @param GroupIds 待整理的人员库列表。
     *                 人员库总人数不可超过200万，人员库个数不可超过10个。
     *                 数组元素取值为创建人员库接口中的GroupId
     */
    public void setGroupIds(String[] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 人员查重整理力度的控制。
     * 1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
     * 2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     *
     * @return UniquePersonControl 人员查重整理力度的控制。
     * 1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
     * 2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set 人员查重整理力度的控制。
     * 1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
     * 2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     *
     * @param UniquePersonControl 人员查重整理力度的控制。
     *                            1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
     *                            2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
    }

}

