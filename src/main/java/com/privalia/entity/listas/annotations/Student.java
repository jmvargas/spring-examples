package com.privalia.entity.listas.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Autowired
    @Value(value = "23")
    private String idStudent;
    @Autowired
    @Value(value = "Pepito")
    private String name;
    @Autowired
    @Value(value = "Varas")
    private String surname;
    @Autowired
    @Value(value = "1")
    private String age;
    @Autowired
    @Qualifier(value = "teachers")
    private List<Teacher> listTeacher;

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setListTeacher(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", listTeacher=" + listTeacher +
                '}';
    }
}
