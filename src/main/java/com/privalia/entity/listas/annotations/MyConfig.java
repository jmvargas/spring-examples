package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig {
    @Bean(value = "teachers")
    public List<Teacher> teachers(){
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("1", "Pepe"));
        teachers.add(new Teacher("2", "Manolo"));
        return teachers;
    }
}
