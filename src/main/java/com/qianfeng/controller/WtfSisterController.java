package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.WtfSister;
import com.qianfeng.service.SisterService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sister")
public class WtfSisterController {

    @Autowired
    private SisterService sisterService;

    @RequestMapping("/sislist.do")
    @ResponseBody
    public JsonBean findAllSisters(){

        JsonBean bean = null;

        try {
            List<WtfSister> allSister = sisterService.findAllSister();
            bean = JsonUtils.createJsonBean(1,allSister);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
}
