package com.xderhuo.serverribbon.controller;

import com.xderhuo.serverribbon.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    TestService testService;

    @RequestMapping("/test")
    public String test(){
        String rest = testService.sayHelloworld("rest");
        return rest;
    }
}
