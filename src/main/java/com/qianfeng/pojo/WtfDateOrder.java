package com.qianfeng.pojo;

public class WtfDateOrder {
    private Integer dateId;

    private String dateSisName;

    private Integer datePrice;

    private String linkPhone;

    private String linkName;

    private Integer dateServices;



    public Integer getDateId() {
        return dateId;
    }

    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

    public String getDateSisName() {
        return dateSisName;
    }

    public void setDateSisName(String dateSisName) {
        this.dateSisName = dateSisName == null ? null : dateSisName.trim();
    }

    public Integer getDatePrice() {
        return datePrice;
    }

    public void setDatePrice(Integer datePrice) {
        this.datePrice = datePrice;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public Integer getDateServices() {
        return dateServices;
    }

    public void setDateServices(Integer dateServices) {
        this.dateServices = dateServices;
    }


}