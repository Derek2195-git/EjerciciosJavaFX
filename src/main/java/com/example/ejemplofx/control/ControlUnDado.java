package com.example.ejemplofx.control;

import com.example.ejemplofx.ui.PantallaDado;
public class ControlUnDado {
    private PantallaDado vista;
    private int suma = 0;
    public ControlUnDado() {
        vista = new PantallaDado();
        // Boton
        vista.getBoton().setOnAction(event -> {
            vista.actualizarDado();
            suma += vista.getValor();
            vista.actualizarTexto(suma+"");
        });
        // Color
        vista.getColor().getSelectionModel().selectedItemProperty().addListener((observable, valorNuevo, valorViejo) -> {
            if (valorNuevo != null) {
                vista.cambiarColor(valorNuevo);
            }
        });

    }

    public PantallaDado getPantalla() {
        return vista;
    }
}
