package com.xderhuo.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface TestService {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    String sayHello(@RequestParam("name")String name);
}
