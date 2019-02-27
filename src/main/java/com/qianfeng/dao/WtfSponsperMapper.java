package com.qianfeng.dao;

import com.qianfeng.pojo.WtfSponsper;

public interface WtfSponsperMapper {
    int deleteByPrimaryKey(Integer sponsorId);

    int insert(WtfSponsper record);

    int insertSelective(WtfSponsper record);

    WtfSponsper selectByPrimaryKey(Integer sponsorId);

    int updateByPrimaryKeySelective(WtfSponsper record);

    int updateByPrimaryKey(WtfSponsper record);
}