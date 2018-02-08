package com.privalia.entity.listas.annotations;

public class Teacher {
    private String idTeacher;
    private String name;

    public Teacher() {
    }

    public Teacher(String idTeacher, String name) {
        this.idTeacher = idTeacher;
        this.name = name;
    }

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
