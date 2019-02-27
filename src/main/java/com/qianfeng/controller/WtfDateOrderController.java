package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.WtfDateOrder;
import com.qianfeng.service.WtfDateOrderService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dateorder")
public class WtfDateOrderController {

    @Autowired
    private WtfDateOrderService dateOrderService;

    @RequestMapping("/adddateorder.do")
    @ResponseBody
    public JsonBean addDateOrder(WtfDateOrder dateOrder){

        JsonBean bean = null;
        try {
            dateOrderService.addDateOrder(dateOrder);
            bean = JsonUtils.createJsonBean(1,null);
            System.out.println("111111");
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
            System.out.println("我是傻逼 ");
        }
        return bean;
    }
}
