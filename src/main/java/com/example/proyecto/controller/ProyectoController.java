package com.example.proyecto.controller;


import com.example.proyecto.model.Vivienda;
import com.example.proyecto.model.Casa;
import com.example.proyecto.model.Departamento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ProyectoController implements Initializable {
    @FXML
    private TableView<Vivienda>tablaViviendas;

    @FXML
    private TableColumn<Vivienda,String> colTipo;

    @FXML
    private TableColumn<Vivienda,String> colCodigo;

    @FXML
    private TableColumn<Vivienda,Double> colSuperficie;

    @FXML
    private TableColumn<Vivienda,Integer> colHabitaciones;

    @FXML
    private TableColumn<Vivienda,Integer> colCostoArriendo;

    private ObservableList<Vivienda> listaViviendas;

    private void cargarDatos(){
        listaViviendas = FXCollections.observableArrayList();
        tablaViviendas.setItems(listaViviendas);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colSuperficie.setCellValueFactory(new PropertyValueFactory<>("superficie"));
        colHabitaciones.setCellValueFactory(new PropertyValueFactory<>("habitaciones"));
        colCostoArriendo.setCellValueFactory(new PropertyValueFactory<>("costoArriendo"));
    }


}
