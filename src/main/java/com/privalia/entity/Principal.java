package com.privalia.entity;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){
        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student);

        Student studentConstructor = (Student)context.getBean("studentConstructor");
        System.out.println(studentConstructor);
    }
}
