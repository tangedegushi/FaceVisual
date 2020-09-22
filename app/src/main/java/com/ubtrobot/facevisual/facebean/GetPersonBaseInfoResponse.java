package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetPersonBaseInfoResponse {

    /**
     * 人员名称
     */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
     * 人员性别，0代表未填写，1代表男性，2代表女性
     */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * 包含的人脸 ID 列表
     */
    @SerializedName("FaceIds")
    @Expose
    private String[] FaceIds;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人员名称
     *
     * @return PersonName 人员名称
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 人员名称
     *
     * @param PersonName 人员名称
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 人员性别，0代表未填写，1代表男性，2代表女性
     *
     * @return Gender 人员性别，0代表未填写，1代表男性，2代表女性
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 人员性别，0代表未填写，1代表男性，2代表女性
     *
     * @param Gender 人员性别，0代表未填写，1代表男性，2代表女性
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 包含的人脸 ID 列表
     *
     * @return FaceIds 包含的人脸 ID 列表
     */
    public String[] getFaceIds() {
        return this.FaceIds;
    }

    /**
     * Set 包含的人脸 ID 列表
     *
     * @param FaceIds 包含的人脸 ID 列表
     */
    public void setFaceIds(String[] FaceIds) {
        this.FaceIds = FaceIds;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

}

