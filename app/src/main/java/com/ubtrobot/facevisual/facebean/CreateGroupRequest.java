package com.ubtrobot.facevisual.facebean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class CreateGroupRequest {

    /**
     * 人员库名称，[1,60]个字符，可修改，不可重复。
     */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * 人员库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 人员库自定义描述字段，用于描述人员库中人员属性，该人员库下所有人员将拥有此描述字段。
     * 最多可以创建5个。
     * 每个自定义描述字段支持[1,30]个字符。
     * 在同一人员库中自定义描述字段不可重复。
     * 例： 设置某人员库“自定义描述字段”为["学号","工号","手机号"]，
     * 则该人员库下所有人员将拥有名为“学号”、“工号”、“手机号”的描述字段，
     * 可在对应人员描述字段中填写内容，登记该人员的学号、工号、手机号等信息。
     */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String[] GroupExDescriptions;

    /**
     * 人员库信息备注，[0，40]个字符。
     */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    private CreateGroupRequest() {
    }

    /**
     * Get 人员库名称，[1,60]个字符，可修改，不可重复。
     *
     * @return GroupName 人员库名称，[1,60]个字符，可修改，不可重复。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 人员库名称，[1,60]个字符，可修改，不可重复。
     *
     * @param GroupName 人员库名称，[1,60]个字符，可修改，不可重复。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 人员库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     *
     * @return GroupId 人员库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     *
     * @param GroupId 人员库 ID，不可修改，不可重复。支持英文、数字、-%@#&_，长度限制64B。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 人员库自定义描述字段，用于描述人员库中人员属性，该人员库下所有人员将拥有此描述字段。
     * 最多可以创建5个。
     * 每个自定义描述字段支持[1,30]个字符。
     * 在同一人员库中自定义描述字段不可重复。
     * 例： 设置某人员库“自定义描述字段”为["学号","工号","手机号"]，
     * 则该人员库下所有人员将拥有名为“学号”、“工号”、“手机号”的描述字段，
     * 可在对应人员描述字段中填写内容，登记该人员的学号、工号、手机号等信息。
     *
     * @return GroupExDescriptions 人员库自定义描述字段，用于描述人员库中人员属性，该人员库下所有人员将拥有此描述字段。
     * 最多可以创建5个。
     * 每个自定义描述字段支持[1,30]个字符。
     * 在同一人员库中自定义描述字段不可重复。
     * 例： 设置某人员库“自定义描述字段”为["学号","工号","手机号"]，
     * 则该人员库下所有人员将拥有名为“学号”、“工号”、“手机号”的描述字段，
     * 可在对应人员描述字段中填写内容，登记该人员的学号、工号、手机号等信息。
     */
    public String[] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set 人员库自定义描述字段，用于描述人员库中人员属性，该人员库下所有人员将拥有此描述字段。
     * 最多可以创建5个。
     * 每个自定义描述字段支持[1,30]个字符。
     * 在同一人员库中自定义描述字段不可重复。
     * 例： 设置某人员库“自定义描述字段”为["学号","工号","手机号"]，
     * 则该人员库下所有人员将拥有名为“学号”、“工号”、“手机号”的描述字段，
     * 可在对应人员描述字段中填写内容，登记该人员的学号、工号、手机号等信息。
     *
     * @param GroupExDescriptions 人员库自定义描述字段，用于描述人员库中人员属性，该人员库下所有人员将拥有此描述字段。
     *                            最多可以创建5个。
     *                            每个自定义描述字段支持[1,30]个字符。
     *                            在同一人员库中自定义描述字段不可重复。
     *                            例： 设置某人员库“自定义描述字段”为["学号","工号","手机号"]，
     *                            则该人员库下所有人员将拥有名为“学号”、“工号”、“手机号”的描述字段，
     *                            可在对应人员描述字段中填写内容，登记该人员的学号、工号、手机号等信息。
     */
    public void setGroupExDescriptions(String[] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get 人员库信息备注，[0，40]个字符。
     *
     * @return Tag 人员库信息备注，[0，40]个字符。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 人员库信息备注，[0，40]个字符。
     *
     * @param Tag 人员库信息备注，[0，40]个字符。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     *
     * @return FaceModelVersion 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     * 2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     * 不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     *
     * @param FaceModelVersion 人脸识别服务所用的算法模型版本。目前入参支持 “2.0”和“3.0“ 两个输入。
     *                         2020年4月2日开始，默认为“3.0”，之前使用过本接口的账号若未填写本参数默认为“2.0”。
     *                         不同算法模型版本对应的人脸识别算法不同，新版本的整体效果会优于旧版本，建议使用“3.0”版本。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public static class Builder {
        private String GroupName;
        private String GroupId;
        private String[] GroupExDescriptions;
        private String Tag;
        private String FaceModelVersion;

        public Builder(@NonNull String groupName, @NonNull String groupId) {
            GroupName = groupName;
            GroupId = groupId;
        }

        public Builder setGroupName(String groupName) {
            GroupName = groupName;
            return this;
        }

        public Builder setGroupId(String groupId) {
            GroupId = groupId;
            return this;
        }

        public Builder setGroupExDescriptions(String[] groupExDescriptions) {
            GroupExDescriptions = groupExDescriptions;
            return this;
        }

        public Builder setTag(String tag) {
            Tag = tag;
            return this;
        }

        public Builder setFaceModelVersion(String faceModelVersion) {
            FaceModelVersion = faceModelVersion;
            return this;
        }

        public CreateGroupRequest build() {
            CreateGroupRequest request = new CreateGroupRequest();
            request.setGroupName(GroupName);
            request.setGroupId(GroupId);
            request.setFaceModelVersion(FaceModelVersion);
            request.setGroupExDescriptions(GroupExDescriptions);
            request.setTag(Tag);
            return request;
        }
    }

}

