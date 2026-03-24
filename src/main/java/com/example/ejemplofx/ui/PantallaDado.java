package com.example.ejemplofx.ui;

import com.example.ejemplofx.modelo.Dado;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class PantallaDado extends BorderPane {
    private Label labelResultado;
    private DadoView dadoView;
    private Button boton;
    private ChoiceBox<String> lista;

    public PantallaDado() {
        dadoView = new DadoView();
        boton = new Button("Lanzar");
        labelResultado = new Label("?");
        labelResultado.setFont(new Font("Arial", 40));
        // Usaremos el choicebox para cambiar el color en la pantalla de los dados
        lista = new ChoiceBox<>(FXCollections.observableArrayList("Azul","Verde","Rojo", "Negro", "Blanco"));
        lista.setValue("Sin seleccionar");
        this.setCenter(dadoView);
        this.setBottom(boton);
        this.setTop(labelResultado);
            this.setTop(lista);
        BorderPane.setAlignment(boton, Pos.BOTTOM_CENTER);

        BorderPane.setAlignment(labelResultado, Pos.TOP_CENTER);
            BorderPane.setAlignment(lista, Pos.TOP_RIGHT);
        // No poner esto pq esta feo: BorderPane.setAlignment(dadoView,Pos.BASELINE_LEFT);
        this.cambiarColorDado("Negro");
    }

    public void actualizarTexto(String texto) {
        labelResultado.setText(texto);
    }
    public void actualizarDado() {
        dadoView.cambiarCara();
    }

    public void cambiarColorDado(String color) {
        if (color.equals("Verde")) {
            dadoView.setStyle("-fx-text-fill: green;");
        } else if (color.equals("Rojo")) {
            dadoView.setStyle("-fx-text-fill: red;");
        } else if (color.equals("Negro")) {
            dadoView.setStyle("-fx-text-fill: black;");
        } else if (color.equals("Azul")){
            dadoView.setStyle("-fx-text-fill: blue;");
        } else {
            dadoView.setStyle("-fx-text-fill: white;");
        }
    }

    public ChoiceBox<String> getColor() {
        return lista;
    }

    public Button getBoton() {
        return boton;

    }
    public int getValor() {
        return dadoView.getValor();
    }
}
