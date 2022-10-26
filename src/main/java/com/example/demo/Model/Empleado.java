package com.example.demo.Model;

public class Empleado extends Person{
    private String salary;
    public Empleado(String name,int edad, String identificationCard, String phone, String email,String salary) {
        super(name, edad,identificationCard, phone, email);
        this.salary=salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
