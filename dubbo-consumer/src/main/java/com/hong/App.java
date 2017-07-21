package com.hong;

import com.hong.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by hong on 2017/7/21.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        HelloService helloService = (HelloService) context.getBean("helloService");

        String hello = helloService.hello("hong");

        System.out.println(hello);

        try {
            // 按任意键退出
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
