package com.xderhuo.serverribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String sayHelloworld(String name) {
        return restTemplate.getForObject("http://service-hi/helloworld?name="+name, String.class);
    }
    public String testError(String name){
        return "Error!you are " + name;
    }
}
