package Modelo;

/**
 *
 * @author Camilo
 */
public class ModeloPoisson {
    private int numeroOccurencias; //k
    private int numeroVecesIntervalo; // λ Lambda
    
    private double resultado = Math.exp(1.0)*(int)Math.pow(numeroVecesIntervalo, numeroOccurencias)/factorial(numeroOccurencias);
            
    private int factorial (int numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

    public int getNumeroOccurencias() {
        return numeroOccurencias;
    }

    public void setNumeroOccurencias(int numeroOccurencias) {
        this.numeroOccurencias = numeroOccurencias;
    }

    public int getNumeroVecesIntervalo() {
        return numeroVecesIntervalo;
    }

    public void setNumeroVecesIntervalo(int numeroVecesIntervalo) {
        this.numeroVecesIntervalo = numeroVecesIntervalo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
