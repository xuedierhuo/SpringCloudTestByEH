package com.xderhuo.serverfeign.controller;

import com.xderhuo.serverfeign.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping("/sayhelloworld")
    public String test(){
        String user123 = testService.sayHello("user123");
        return user123;
    }
}
