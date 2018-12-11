package com.xderhuo.serverhelloconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServerHelloConsul {
    public static void main(String[] args) {
        SpringApplication.run(ServerHelloConsul.class, args);
    }

    @RequestMapping("hello")
    public String test(){
        return "hello world";
    }
}
