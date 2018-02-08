package com.privalia.entity.listas;

public class Teacher {
    private String idTeacher;
    private String name;

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher='" + idTeacher + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
