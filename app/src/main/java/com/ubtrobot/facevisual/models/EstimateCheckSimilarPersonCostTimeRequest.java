package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class EstimateCheckSimilarPersonCostTimeRequest {

    /**
     * 待整理的人员库列表。
     * 人员库总人数不可超过200万，人员库个数不可超过10个。
     * 数组元素取值为创建人员库接口中的GroupId
     */
    @SerializedName("GroupIds")
    @Expose
    private String[] GroupIds;

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

}

