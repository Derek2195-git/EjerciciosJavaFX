package com.example.ejemplofx.modelo;
import java.util.Random;

/**
 * Esta clase modelará un dado de varias caras
 *
 * @author Derek Ramón Garzón Vizcarra
 * @version 10/02/26
 */
public class Dado
{
    /*
     * Estos son los atributos de la clase Dado
     */
    private int caras;
    private int valor;

    /*
     * Estos son los constructores de la clase Dado
     */
    public Dado() {
        caras = 6;
        valor = 1;
    }

    public Dado(int caras, int valor) {
        this.caras = caras;
        this.valor = valor;
    }

    public Dado(int caras) {
        this.caras = caras;
    }

    /*
     * Estos son los getters de la clase Dado, los cuales retornaran el valor de un atributo cuando se necesiten
     */

    public int getCaras() {
        return caras;
    }

    public int getValor() {
        return valor;
    }

    /*
     * Estos son los setters de la clase Dado, los cuales reescribiran el valor de un atributo cuando se necesite
     */
    public void setCaras(int caras) {
        this.caras = caras;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo que simula el lanzamiento de un dado con una cantidad de caras al azar
     *
     * @return El valor resultante al lanzar el dado
     */
    public int lanzar() {
        Random rnd = new Random();
        // caras = rnd.nextInt(getCaras()) + 1;
        valor = rnd.nextInt(caras) + 1;
        return valor;
    }

    public String toString() {
        return "Dado con "+ caras +" caras y un valor de " + valor;
    }
}