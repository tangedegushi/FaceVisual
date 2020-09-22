package com.ubtrobot.facevisual.facebean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupCandidate {

    /**
     * 人员库ID 。
     */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 识别出的最相似候选人。
     */
    @SerializedName("Candidates")
    @Expose
    private Candidate[] Candidates;

    /**
     * Get 人员库ID 。
     *
     * @return GroupId 人员库ID 。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 人员库ID 。
     *
     * @param GroupId 人员库ID 。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 识别出的最相似候选人。
     *
     * @return Candidates 识别出的最相似候选人。
     */
    public Candidate[] getCandidates() {
        return this.Candidates;
    }

    /**
     * Set 识别出的最相似候选人。
     *
     * @param Candidates 识别出的最相似候选人。
     */
    public void setCandidates(Candidate[] Candidates) {
        this.Candidates = Candidates;
    }

}

