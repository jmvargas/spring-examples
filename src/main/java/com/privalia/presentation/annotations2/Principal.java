package com.privalia.presentation.annotations2;

import com.privalia.presentation.annotations.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.privalia.presentation.annotations2");
        context.refresh();

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.getHello());

        HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloWorld");
        System.out.println(helloWorld2.getHello());

        context.close();
    }
}
