package com.xderhuo.server_hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String address;

    @RequestMapping("/helloworld")
    public String test(@RequestParam(value = "name", defaultValue = "user") String name){
        return "hi  " + name + ", there is client " + address;
    }
}
