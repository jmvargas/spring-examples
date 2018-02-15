package com.privalia.functional;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Belly {
    private int cukes;

    public void eat(int cukes){
        this.cukes = cukes;
    }

    public String getSound(int waitingTime){
        if (this.cukes > 41 && waitingTime >= 1) {
            return "growl";
        }
        return "silent";
    }
}