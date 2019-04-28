/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author olgal
 */
public class Metodo_Bernolli {

    private int nro_aciertos;
    private int nro_experimentos;
    private double prob_exito;
    private double prob_final;

    public Metodo_Bernolli(int nro_aciertos, int nro_experimentos, double prob_exito) {
        this.nro_aciertos = nro_aciertos;
        this.nro_experimentos = nro_experimentos;
        this.prob_exito = prob_exito;
    }

    public int getNro_aciertos() {
        return nro_aciertos;
    }

    public int getNro_experimentos() {
        return nro_experimentos;
    }

   

    public double getProb_exito() {
        return prob_exito;
    }

    public double getProb_final() {
        return prob_final;
    }

    public void setNro_aciertos(int nro_aciertos) {
        this.nro_aciertos = nro_aciertos;
    }

    public void setNro_experimentos(int nro_experimentos) {
        this.nro_experimentos = nro_experimentos;
    }

    public void setProb_exito(double prob_exito) {
        this.prob_exito = prob_exito;
    }

    public void setProb_final(double prob_final) {
        this.prob_final = prob_final;
    }

    public double calculo_Bernoulli() {
        prob_final=factorial(nro_experimentos)/(factorial(nro_aciertos)*factorial(nro_experimentos-nro_aciertos))*Math.pow(prob_exito, nro_aciertos)*Math.pow(1-prob_exito,nro_experimentos-nro_aciertos);
        return this.prob_final*100;
    }

    public int factorial(double numero) {
        if (numero == 0) {
            return 1;
        }  else {
            return (int) (numero * factorial(numero - 1));
        }
    }

}
