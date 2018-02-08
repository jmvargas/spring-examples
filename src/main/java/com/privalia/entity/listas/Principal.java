package com.privalia.entity.listas;

import lombok.Cleanup;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] arg){
        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student s = (Student) context.getBean("studentHasTeachers");
        System.out.println(s);
    }
}
