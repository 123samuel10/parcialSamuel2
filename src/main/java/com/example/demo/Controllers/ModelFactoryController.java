package com.example.demo.Controllers;

import com.example.demo.ServiceImpl.Laboratorio;
import com.example.demo.ServiceImpl.Services.ModelFactoryService;

public class ModelFactoryController implements ModelFactoryService {
    Laboratorio laboratorio;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        laboratorio = new Laboratorio();
    }


    @Override
    public void add(String nombre,int edad,String identification, String phone, String email, String direction) {
        laboratorio.getClientService().add(nombre,edad,identification,phone,email,direction);
    }

    @Override
    public void buscar(String nombre) {
        laboratorio.getClientService().buscar(nombre);
    }


}
