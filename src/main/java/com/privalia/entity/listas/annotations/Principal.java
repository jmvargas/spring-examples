package com.privalia.entity.listas.annotations;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.privalia.entity.listas.annotations");
        context.refresh();

        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
