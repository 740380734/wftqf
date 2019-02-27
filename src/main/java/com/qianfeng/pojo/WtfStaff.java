package com.qianfeng.pojo;

public class WtfStaff {
    private Integer staffId;

    private String staffName;

    private String staffWork;

    private String staffDesc;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffWork() {
        return staffWork;
    }

    public void setStaffWork(String staffWork) {
        this.staffWork = staffWork == null ? null : staffWork.trim();
    }

    public String getStaffDesc() {
        return staffDesc;
    }

    public void setStaffDesc(String staffDesc) {
        this.staffDesc = staffDesc == null ? null : staffDesc.trim();
    }
}