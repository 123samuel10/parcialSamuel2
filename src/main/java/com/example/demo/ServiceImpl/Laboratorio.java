package com.example.demo.ServiceImpl;

public class Laboratorio {

    ClientServiceImpl clientService;
    public Laboratorio(){
    this.clientService=new ClientServiceImpl();

    }

    public ClientServiceImpl getClientService() {
        return clientService;
    }
}
