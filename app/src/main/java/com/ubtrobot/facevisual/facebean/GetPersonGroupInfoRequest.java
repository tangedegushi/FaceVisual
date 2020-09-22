package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonGroupInfoRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 起始序号，默认值为0
     */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * 返回数量，默认值为10，最大值为100
     */
    @SerializedName("Limit")
    @Expose
    private Long Limit = 10l;

    public GetPersonGroupInfoRequest(@NonNull String personId) {
        PersonId = personId;
    }

    /**
     * Get 人员ID，取值为创建人员接口中的PersonId
     *
     * @return PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，取值为创建人员接口中的PersonId
     *
     * @param PersonId 人员ID，取值为创建人员接口中的PersonId
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 起始序号，默认值为0
     *
     * @return Offset 起始序号，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始序号，默认值为0
     *
     * @param Offset 起始序号，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为10，最大值为100
     *
     * @return Limit 返回数量，默认值为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为10，最大值为100
     *
     * @param Limit 返回数量，默认值为10，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

}

