package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.WtfService;
import com.qianfeng.service.ItemService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/item")
public class WtfServiceController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/finditem.do")
    @ResponseBody
    public JsonBean findAllItem(){

        JsonBean bean = null;
        try {
            List<WtfService> list = itemService.findAllItem();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
