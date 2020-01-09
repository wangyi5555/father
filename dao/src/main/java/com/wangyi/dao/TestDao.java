package com.wangyi.dao;

import com.wangyi.pojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestDao
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/922:31
 * @Version 1.0
 **/

public class TestDao {
    public String show(){
        TestPojo testPojo = new TestPojo();
        return testPojo.show()+"我是dao";
    }
}
