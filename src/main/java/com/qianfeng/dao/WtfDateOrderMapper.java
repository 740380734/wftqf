package com.qianfeng.dao;

import com.qianfeng.pojo.WtfDateOrder;

public interface WtfDateOrderMapper {
    int deleteByPrimaryKey(Integer dateId);

    int insert(WtfDateOrder record);

    int insertSelective(WtfDateOrder record);

    WtfDateOrder selectByPrimaryKey(Integer dateId);

    int updateByPrimaryKeySelective(WtfDateOrder record);

    int updateByPrimaryKey(WtfDateOrder record);
}