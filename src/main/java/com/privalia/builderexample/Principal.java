package com.privalia.builderexample;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){
        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee = (Employee)context.getBean("employee");

        System.out.println(employee);
        //context.close();
    }
}
