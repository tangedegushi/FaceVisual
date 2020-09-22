package com.ubtrobot.facevisual.models;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.HashMap;

public class FaceHairAttributesInfo {

    /**
     * 0：光头，1：短发，2：中发，3：长发，4：绑发
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
     * 0：有刘海，1：无刘海
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Bang")
    @Expose
    private Long Bang;

    /**
     * 0：黑色，1：金色，2：棕色，3：灰白色
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("Color")
    @Expose
    private Long Color;

    /**
     * Get 0：光头，1：短发，2：中发，3：长发，4：绑发
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Length 0：光头，1：短发，2：中发，3：长发，4：绑发
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 0：光头，1：短发，2：中发，3：长发，4：绑发
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Length 0：光头，1：短发，2：中发，3：长发，4：绑发
     *               注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 0：有刘海，1：无刘海
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Bang 0：有刘海，1：无刘海
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBang() {
        return this.Bang;
    }

    /**
     * Set 0：有刘海，1：无刘海
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Bang 0：有刘海，1：无刘海
     *             注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBang(Long Bang) {
        this.Bang = Bang;
    }

    /**
     * Get 0：黑色，1：金色，2：棕色，3：灰白色
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return Color 0：黑色，1：金色，2：棕色，3：灰白色
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColor() {
        return this.Color;
    }

    /**
     * Set 0：黑色，1：金色，2：棕色，3：灰白色
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param Color 0：黑色，1：金色，2：棕色，3：灰白色
     *              注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(Long Color) {
        this.Color = Color;
    }

}

