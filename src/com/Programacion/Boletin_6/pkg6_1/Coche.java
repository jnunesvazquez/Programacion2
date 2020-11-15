
package com.Programacion.Boletin_6.pkg6_1;

/**
 * Descripcion de la clase coche
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Coche {
    private final int velocidade;

    /**
     * Constructor
     */
    public Coche() {
        velocidade = 0;
    }

    /**
     * Metodo acelerar
     * @param valor la velocidad que acelera
     */
    public void acelerar(int valor) {
        int newVelocidade;
        newVelocidade = velocidade + valor;
        System.out.println("El coche ahora va a " + newVelocidade);
    }

    /**
     * Metodo frenar
     * @param menos la velocidad que reduce
     */
    public void frenar(int menos) {
        int newVelocidade2;
        newVelocidade2 = velocidade - menos;
        System.out.println("El coche ahora va a " + newVelocidade2);
    }
}
