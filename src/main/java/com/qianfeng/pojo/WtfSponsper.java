package com.qianfeng.pojo;

public class WtfSponsper {
    private Integer sponsorId;

    private String sponsorName;

    private String sponsorDesc;

    private String sponsorBoss;

    public Integer getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName == null ? null : sponsorName.trim();
    }

    public String getSponsorDesc() {
        return sponsorDesc;
    }

    public void setSponsorDesc(String sponsorDesc) {
        this.sponsorDesc = sponsorDesc == null ? null : sponsorDesc.trim();
    }

    public String getSponsorBoss() {
        return sponsorBoss;
    }

    public void setSponsorBoss(String sponsorBoss) {
        this.sponsorBoss = sponsorBoss == null ? null : sponsorBoss.trim();
    }
}