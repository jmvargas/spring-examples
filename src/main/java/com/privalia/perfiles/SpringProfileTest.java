package com.privalia.perfiles;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileTest {
    public static void main(String[] args){
        @Cleanup AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.scan("com.privalia.perfiles");
        ctx.refresh();

        User u = ctx.getBean(User.class);
        System.out.println(u);
    }
}
