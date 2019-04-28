/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;

import Modelo.Moneda;
import Modelo.Metodo_Bernolli;
import vista.*;

/**
 *
 * @author olgal
 */
public class Estadistica {
 Moneda moneda;
   
    public static void main(String[] args) {
        
        Moneda moneda=new Moneda();
        Metodo_Bernolli bernoulli= new Metodo_Bernolli(2,5,0.55);
        Vista.VistaEjercicio ve = new Vista.VistaEjercicio();
        ve.setVisible(true);
        moneda.setProbabilidad(0.5);
//        System.out.print(bernoulli.calculo_Bernoulli()+" -- "+moneda.lanzar());
         
    }
    
}
