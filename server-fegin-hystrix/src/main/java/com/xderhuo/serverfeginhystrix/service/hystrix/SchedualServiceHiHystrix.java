package com.xderhuo.serverfeginhystrix.service.hystrix;

import com.xderhuo.serverfeginhystrix.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements TestService {
    @Override
    public String sayHello(String name) {
        return "Error! " + name;
    }
}
