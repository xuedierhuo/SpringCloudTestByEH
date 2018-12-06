package com.xderhuo.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHelloworld(String name){
        return restTemplate.getForObject("http://service-hi/helloworld?name="+name, String.class);
    }
}
