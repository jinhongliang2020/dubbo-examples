package com.hong.service;

import org.springframework.stereotype.Service;

/**
 * Created by hong on 2017/7/21.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(String name) {
        return "hello..."+name;
    }
}
