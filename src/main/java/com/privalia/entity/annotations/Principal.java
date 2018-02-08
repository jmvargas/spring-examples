package com.privalia.entity.annotations;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.privalia.entity.annotations");
        context.refresh();

        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
