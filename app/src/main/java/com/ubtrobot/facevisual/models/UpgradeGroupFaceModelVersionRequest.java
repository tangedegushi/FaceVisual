package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpgradeGroupFaceModelVersionRequest {

    /**
     * 需要升级的人员库ID。
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 需要升级至的算法模型版本。默认为最新版本。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get 需要升级的人员库ID。
     *
     * @return GroupId 需要升级的人员库ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 需要升级的人员库ID。
     *
     * @param GroupId 需要升级的人员库ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 需要升级至的算法模型版本。默认为最新版本。
     *
     * @return FaceModelVersion 需要升级至的算法模型版本。默认为最新版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 需要升级至的算法模型版本。默认为最新版本。
     *
     * @param FaceModelVersion 需要升级至的算法模型版本。默认为最新版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

}

