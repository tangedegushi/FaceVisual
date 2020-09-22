package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class FaceDetailInfo {

    /**
     * 检测出的人脸框位置。
     */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
     * 人脸属性信息，根据 FaceAttributesType 输入的类型，返回年龄（Age）、颜值（Beauty）
     * 情绪（Emotion）、眼睛信息（Eye）、眉毛（Eyebrow）、性别（Gender）
     * 头发（Hair）、帽子（Hat）、姿态（Headpose）、口罩（Mask）、嘴巴（Mouse）、胡子（Moustache）
     * 鼻子（Nose）、脸型（Shape）、肤色（Skin）、微笑（Smile）等人脸属性信息。
     * 若 FaceAttributesType 没有输入相关类型，则FaceDetaiAttributesInfo返回的细项不具备参考意义。
     */
    @SerializedName("FaceDetailAttributesInfo")
    @Expose
    private FaceDetailAttributesInfo FaceDetailAttributesInfo;

    /**
     * Get 检测出的人脸框位置。
     *
     * @return FaceRect 检测出的人脸框位置。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * Set 检测出的人脸框位置。
     *
     * @param FaceRect 检测出的人脸框位置。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * Get 人脸属性信息，根据 FaceAttributesType 输入的类型，返回年龄（Age）、颜值（Beauty）
     * 情绪（Emotion）、眼睛信息（Eye）、眉毛（Eyebrow）、性别（Gender）
     * 头发（Hair）、帽子（Hat）、姿态（Headpose）、口罩（Mask）、嘴巴（Mouse）、胡子（Moustache）
     * 鼻子（Nose）、脸型（Shape）、肤色（Skin）、微笑（Smile）等人脸属性信息。
     * 若 FaceAttributesType 没有输入相关类型，则FaceDetaiAttributesInfo返回的细项不具备参考意义。
     *
     * @return FaceDetailAttributesInfo 人脸属性信息，根据 FaceAttributesType 输入的类型，返回年龄（Age）、颜值（Beauty）
     * 情绪（Emotion）、眼睛信息（Eye）、眉毛（Eyebrow）、性别（Gender）
     * 头发（Hair）、帽子（Hat）、姿态（Headpose）、口罩（Mask）、嘴巴（Mouse）、胡子（Moustache）
     * 鼻子（Nose）、脸型（Shape）、肤色（Skin）、微笑（Smile）等人脸属性信息。
     * 若 FaceAttributesType 没有输入相关类型，则FaceDetaiAttributesInfo返回的细项不具备参考意义。
     */
    public FaceDetailAttributesInfo getFaceDetailAttributesInfo() {
        return this.FaceDetailAttributesInfo;
    }

    /**
     * Set 人脸属性信息，根据 FaceAttributesType 输入的类型，返回年龄（Age）、颜值（Beauty）
     * 情绪（Emotion）、眼睛信息（Eye）、眉毛（Eyebrow）、性别（Gender）
     * 头发（Hair）、帽子（Hat）、姿态（Headpose）、口罩（Mask）、嘴巴（Mouse）、胡子（Moustache）
     * 鼻子（Nose）、脸型（Shape）、肤色（Skin）、微笑（Smile）等人脸属性信息。
     * 若 FaceAttributesType 没有输入相关类型，则FaceDetaiAttributesInfo返回的细项不具备参考意义。
     *
     * @param FaceDetailAttributesInfo 人脸属性信息，根据 FaceAttributesType 输入的类型，返回年龄（Age）、颜值（Beauty）
     *                                 情绪（Emotion）、眼睛信息（Eye）、眉毛（Eyebrow）、性别（Gender）
     *                                 头发（Hair）、帽子（Hat）、姿态（Headpose）、口罩（Mask）、嘴巴（Mouse）、胡子（Moustache）
     *                                 鼻子（Nose）、脸型（Shape）、肤色（Skin）、微笑（Smile）等人脸属性信息。
     *                                 若 FaceAttributesType 没有输入相关类型，则FaceDetaiAttributesInfo返回的细项不具备参考意义。
     */
    public void setFaceDetailAttributesInfo(FaceDetailAttributesInfo FaceDetailAttributesInfo) {
        this.FaceDetailAttributesInfo = FaceDetailAttributesInfo;
    }

}

