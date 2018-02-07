package com.privalia.builderexample;

public class Employee {
    private Long id;
    private String name;
    private int gender;
    private String address;
    private String hobby;

    private Employee(){}

    public static class EmployeeBuilder {
        private Long id;
        private String name;
        private int gender;
        private String address;
        private String hobby;

        public EmployeeBuilder(Long id, String name){
            this.id = id;
            this.name = name;
        }

        public void setGender(int gender){
            this.gender = gender;
        }


        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public Employee build(){
            Employee em = new Employee();
            em.id = this.id;
            em.name = this.name;
            em.gender = this.gender;
            em.address = this.address;
            em.hobby = this.hobby;
            return em;
        }
    }
    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
