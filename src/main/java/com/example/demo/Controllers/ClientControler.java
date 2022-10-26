package com.example.demo.Controllers;

import com.example.demo.Model.Client;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClientControler {
    @FXML
    private TextField escribirEdad;

    @FXML
    private TextField escribirNombre;

    @FXML
    private TableColumn<?, ?> mostrarEdad;

    @FXML
    private TableColumn<?, ?> mostrarNombre;
    @FXML
    private TableView<?> tabla;
    ObservableList<Client>clients;
    ModelFactoryController mfc=new ModelFactoryController();
    @FXML
    private String mostrarInformacion;

    @FXML
    void btnGuardar(ActionEvent event) {
        String nombre = null;
        int edad=0;
        String identificacion = null;
        String phone = null;
        String email = null;
        String diretion = null;

        try {
            nombre = escribirNombre.getText();
            identificacion = escribirEdad.getText();
            if ("" != escribirNombre.getText()) {
                clients.add(new Client(nombre,edad ,identificacion, phone, email, diretion));
                mfc.add(nombre,edad,identificacion,phone,email,diretion);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnVer(ActionEvent event) {
        mostrarInformacion=clients.toString();
        String nombre=null;
        mfc.buscar(nombre);

    }
}
