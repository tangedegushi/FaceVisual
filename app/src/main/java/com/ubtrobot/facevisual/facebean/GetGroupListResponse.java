package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class GetGroupListResponse {

    /**
     * 返回的人员库信息
     */
    @SerializedName("GroupInfos")
    @Expose
    private GroupInfo[] GroupInfos;

    /**
     * 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的人员库信息
     *
     * @return GroupInfos 返回的人员库信息
     */
    public GroupInfo[] getGroupInfos() {
        return this.GroupInfos;
    }

    /**
     * Set 返回的人员库信息
     *
     * @param GroupInfos 返回的人员库信息
     */
    public void setGroupInfos(GroupInfo[] GroupInfos) {
        this.GroupInfos = GroupInfos;
    }

    /**
     * Get 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @return GroupNum 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set 人员库总数量
     * 注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param GroupNum 人员库总数量
     *                 注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
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

