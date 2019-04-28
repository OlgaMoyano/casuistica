/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author olgal
 */
public class Moneda {

    boolean lado;
    double probabilidad;

    public Moneda() {
        this.probabilidad = 0.5;// probabilidad de  que  caiga cara  o sello
    }

    public boolean islado() {
        return lado;
    }

    public void setCaida(boolean lado) {
        this.lado = lado;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public boolean lanzar() {
        Random random = new Random();
        int valor = random.nextInt(2);
        lado = valor == 1; //cara
        //sello
        return lado;
    }
}
