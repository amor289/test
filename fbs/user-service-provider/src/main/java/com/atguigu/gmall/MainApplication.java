package com.atguigu.gmall;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext ioc  = new ClassPathXmlApplicationContext("provider.xml");
        ((ClassPathXmlApplicationContext) ioc).start();
        System.in.read();
    }
}
