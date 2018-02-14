package com.privalia.aspectos.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@ComponentScan("com.privalia.aspectos.annotations")
public class Compra {
    public void compra(boolean error) throws Exception {
        if (error) {
            throw new Exception("Algo ha ido mal");
        }
        System.out.println("Realizando la compra...");
    }
}
