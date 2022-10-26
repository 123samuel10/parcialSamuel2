package com.example.demo.Model;

public class Sale {
    private String saleNumber;
    private String date;
    private String cliente;
    private String numberP;

    public Sale(String saleNumber,String date,String cliente,String numberP) {
        this.saleNumber=saleNumber;
        this.date=date;
        this.cliente = cliente;
        this.numberP=numberP;
    }

    public String getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(String saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getNumberP() {
        return numberP;
    }

    public void setNumberP(String numberP) {
        this.numberP = numberP;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
