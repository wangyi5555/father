package com.wangyi.web.controller;

import com.wangyi.dao.TestDao;
import com.wangyi.pojo.TestPojo;
import com.wangyi.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Wrysunny
 * @Date 2020/1/922:33
 * @Version 1.0
 **/
@RestController
public class TestController {
    @RequestMapping("/test")
    private String test(){
        System.out.println(new TestPojo().show());
        TestService testService = new TestService();
        return testService.show()+"我是web";
    }

}
