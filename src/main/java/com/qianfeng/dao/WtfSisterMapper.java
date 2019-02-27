package com.qianfeng.dao;

import com.qianfeng.pojo.WtfSister;

import java.util.List;

public interface WtfSisterMapper {
    int deleteByPrimaryKey(Integer sisId);

    int insert(WtfSister record);

    int insertSelective(WtfSister record);

    WtfSister selectByPrimaryKey(Integer sisId);

    int updateByPrimaryKeySelective(WtfSister record);

    int updateByPrimaryKey(WtfSister record);

    List<WtfSister> findAllSister();

}