package com.privalia.presentation;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){
        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");

        System.out.println(helloWorld.getHello());

        HelloWorld helloWorldCons = (HelloWorld)context.getBean("helloWorldCons");
        System.out.println(helloWorldCons.getHello());

        //context.close();
    }
}
