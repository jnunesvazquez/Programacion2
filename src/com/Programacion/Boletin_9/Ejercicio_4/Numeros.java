
package com.Programacion.Boletin_9.Ejercicio_4;

import javax.swing.JOptionPane;

/**
 * Clase secundaria para hacer calculos
 */
public class Numeros {

    
    /**
     * Metodo para calcular el area de un rectangulo
     */
    public void tablaMultiplicar(){
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
        while(numero != 0);     
    }
}

