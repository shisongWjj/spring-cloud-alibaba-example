package com.ss.spring.cloud.example;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SayHelloController
 *
 * @author shisong
 * @date 2020-08-10
 */
@RestController
public class SayHelloController {

    @Reference
    private ISayHelloService sayHelloService;

    @RequestMapping("test")
    public String sayHello(String name){
        return sayHelloService.sayHello(name);
    }

}
