package com.example.demo.Model;

public class Client extends Person{
    private String direction;
    public Client(String name,int edad, String identificationCard, String phone, String email,String direction) {
        super(name, edad,identificationCard, phone, email);
        this.direction=direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
