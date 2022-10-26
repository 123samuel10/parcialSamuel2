package com.example.demo.ServiceImpl;

import com.example.demo.Model.Client;
import com.example.demo.ServiceImpl.Services.ClietServices;

import java.util.ArrayList;

public class ClientServiceImpl implements ClietServices {
    ArrayList<Client> clients=new ArrayList<>();
    @Override
    public void add(String nombre,int edad ,String identification, String phone,String email ,String direction) {
        this.clients.add(new Client(nombre,edad,identification,phone,email,direction));
    }

    @Override
    public void buscar(String nombre) {
        for (int i=0;i<clients.size();i++){
            if (clients.get(i)!=null && clients.get(i).getName().equals(nombre) && clients.get(i).getEdad()>=18){
                System.out.println("se encontro");
            }
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
