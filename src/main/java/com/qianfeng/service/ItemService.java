package com.qianfeng.service;

import com.qianfeng.dao.WtfServiceMapper;
import com.qianfeng.pojo.WtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {

    public List<WtfService> findAllItem();

}
