
package com.Programacion.Boletin_9.Ejercicio_1;

import javax.swing.JOptionPane;

/**
 * Clase secundaria para hacer calculos
 */
public class Numeros {
    private int negativos = 0;
    private int positivos = 0;
    private int ceros = 0;
    
    /**
     * Metodo para separar los numeros por tipo
     */
    public void separarNumeros(){
        for (int i = 0; i < 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if(numero != 0){
                if(numero > 0){
                    positivos++;
                }
                else{
                negativos++;
                }
            }
            else {
                ceros++;
            }
        }
        System.out.println("Numeros positivos: " + positivos + "\nNumeros negativos: " + negativos + "\nCeros : " + ceros);
    }
}

