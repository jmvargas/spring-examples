package com.privalia.external.configuration;

import lombok.Cleanup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    private final static Logger slf4jLogger = LoggerFactory.getLogger(Principal.class);
    public static void main(String[] args){
        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Database database = (Database) context.getBean("database");
        slf4jLogger.info(database.toString());
    }
}
