package com.privalia.calculator;

import com.privalia.calculator.operations.Operation;
import lombok.Cleanup;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args){

        if (args.length != 3) {
            System.out.println("Usage example: java -jar app.jar plus 1 2");
            return;
        }

        String operation = args[0];
        Double operatorA = new Double(args[1]);
        Double operatorB = new Double(args[2]);

        @Cleanup AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Operation op;
        try {
            op = (Operation) context.getBean(operation);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Unknown operation, try plus substract, multiply or division");
            return;
        }

        System.out.println("Result i: " + op.calc(operatorA, operatorB));
    }
}
