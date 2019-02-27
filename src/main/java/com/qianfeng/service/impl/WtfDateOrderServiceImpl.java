package com.qianfeng.service.impl;

import com.qianfeng.dao.WtfDateOrderMapper;
import com.qianfeng.pojo.WtfDateOrder;
import com.qianfeng.service.WtfDateOrderService;
import org.apache.ibatis.ognl.OgnlOps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WtfDateOrderServiceImpl implements WtfDateOrderService {

    @Autowired
    private WtfDateOrderMapper dateOrderDao;

    @Override
    public void addDateOrder(WtfDateOrder wtfDateOrder) {


        if (wtfDateOrder.getLinkPhone().length() == 11) {
            dateOrderDao.insertSelective(wtfDateOrder);
        } else {

            throw new RuntimeException("请输入正确手机号");
        }

    }
}
