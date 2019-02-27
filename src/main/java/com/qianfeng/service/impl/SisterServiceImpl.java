package com.qianfeng.service.impl;

import com.qianfeng.dao.WtfSisterMapper;
import com.qianfeng.pojo.WtfSister;
import com.qianfeng.service.SisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SisterServiceImpl implements SisterService {

    @Autowired
    private WtfSisterMapper sisterDao;

    @Override
    public List<WtfSister> findAllSister() {

        List<WtfSister> sisters = sisterDao.findAllSister();

        if (sisters != null){
            return sisters;
        }else{
            return null;
        }

    }
}
