package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModifyPersonBaseInfoRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 需要修改的人员名称
     */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
     * 需要修改的人员性别，1代表男性，2代表女性
     */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    public ModifyPersonBaseInfoRequest(@NonNull String personId) {
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
     * Get 需要修改的人员名称
     *
     * @return PersonName 需要修改的人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 需要修改的人员名称
     *
     * @param PersonName 需要修改的人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 需要修改的人员性别，1代表男性，2代表女性
     *
     * @return Gender 需要修改的人员性别，1代表男性，2代表女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 需要修改的人员性别，1代表男性，2代表女性
     *
     * @param Gender 需要修改的人员性别，1代表男性，2代表女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

}

