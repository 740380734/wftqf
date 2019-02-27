package com.qianfeng.dao;

import com.qianfeng.pojo.WtfStaff;

public interface WtfStaffMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(WtfStaff record);

    int insertSelective(WtfStaff record);

    WtfStaff selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(WtfStaff record);

    int updateByPrimaryKey(WtfStaff record);
}