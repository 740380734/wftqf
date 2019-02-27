package com.qianfeng.dao;

import com.qianfeng.pojo.WtfService;

import java.util.List;

public interface WtfServiceMapper {
    int deleteByPrimaryKey(Integer serviceId);

    int insert(WtfService record);

    int insertSelective(WtfService record);

    WtfService selectByPrimaryKey(Integer serviceId);

    int updateByPrimaryKeySelective(WtfService record);

    int updateByPrimaryKey(WtfService record);

    List<WtfService> findAllService();
}