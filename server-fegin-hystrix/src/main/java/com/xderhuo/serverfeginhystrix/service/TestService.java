package com.xderhuo.serverfeginhystrix.service;

import com.xderhuo.serverfeginhystrix.service.hystrix.SchedualServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystrix.class)
@Service
public interface TestService {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    String sayHello(@RequestParam("name")String name);
}
