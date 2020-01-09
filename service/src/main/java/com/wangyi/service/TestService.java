package com.wangyi.service;

import com.wangyi.dao.TestDao;
import com.wangyi.pojo.TestPojo;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/922:32
 * @Version 1.0
 **/
public class TestService {
    public String show(){
        TestDao testDao = new TestDao();
        return testDao.show() + "我是service";
    }
}
