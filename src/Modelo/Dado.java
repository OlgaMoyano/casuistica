package Modelo;

/**
 *
 * @author Camilo
 */
public class Dado {
    
    public int lanzarDado() {
        return (int) (Math.random() * 6) + 1;
    }
}
