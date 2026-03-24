package com.example.ejemplofx.ui;

import com.example.ejemplofx.modelo.Dado;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class DadoView extends Label {
    private Dado dado;
    public final int EMOJI_DADO = 9855;
    // No se ocupa esto segun la profe: int base = 0x1F382;

    public DadoView() {
        dado = new Dado();
        Font font = new Font("Arial",80);
        String emoji = new String(Character.toChars(EMOJI_DADO + 1));
        setText(emoji);
        setFont(font);
    }
    /*
    public void pintarDado(int valor) {
        System.out.println("Dado \u2680");
        System.out.println("Grinning face:base"+new String(Character.toChars(base)));
    }
     */
    public void cambiarCara() {
        dado.lanzar();
        int valorx = dado.getValor();
        String emoji = new String(Character.toChars(EMOJI_DADO + valorx));
        setText(emoji);
    }
    public int getValor() {
        return dado.lanzar();
    }
}

