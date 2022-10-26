package com.example.demo.Model;

public class Person {
    private String name;
    private String identificationCard;
    private String phone;
    private String email;
    private int edad;

    public Person(String name,int edad,String identificationCard,String phone,String email) {
        this.name = name;
        this.edad=edad;
        this.identificationCard=identificationCard;
        this.phone=phone;
        this.email=email;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
