package com.privalia.entity.listas;

import java.util.List;

public class Student {
    private String idStudent;
    private String name;
    private String surname;
    private String age;
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
