package com.qianfeng.service.impl;

import com.qianfeng.dao.WtfServiceMapper;
import com.qianfeng.pojo.WtfService;
import com.qianfeng.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private WtfServiceMapper itemDao;

    @Override
    public List<WtfService> findAllItem() {

        List<WtfService> allService = itemDao.findAllService();

        if (allService != null){
            return allService;
        }else {
            return null;
        }


    }
}
