package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class DeletePersonRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    public DeletePersonRequest(@NonNull String personId) {
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

}

