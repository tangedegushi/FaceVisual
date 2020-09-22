package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class DeleteFaceRequest {

    /**
     * 人员ID，取值为创建人员接口中的PersonId
     */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     */
    @SerializedName("FaceIds")
    @Expose
    private String[] FaceIds;

    public DeleteFaceRequest(@NonNull String personId,@NonNull String[] faceIds) {
        PersonId = personId;
        FaceIds = faceIds;
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
     * Get 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     *
     * @return FaceIds 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     */
    public String[] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     *
     * @param FaceIds 待删除的人脸ID列表，数组元素取值为增加人脸接口返回的FaceId
     */
    public void setFaceIds(String[] FaceIds) {
        this.FaceIds = FaceIds;
    }

}

