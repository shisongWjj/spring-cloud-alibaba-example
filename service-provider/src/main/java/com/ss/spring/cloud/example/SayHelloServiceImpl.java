package com.ss.spring.cloud.example;

import org.apache.dubbo.config.annotation.Service;

/**
 * SayHelloServiceImpl
 *
 * @author shisong
 * @date 2020-08-10
 */
@Service
public class SayHelloServiceImpl  implements ISayHelloService{
    @Override
    public String sayHello(String name) {
        return name + "say hello world";
    }
}
