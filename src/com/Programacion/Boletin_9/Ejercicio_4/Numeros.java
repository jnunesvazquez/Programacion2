
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
        int numero = 1;
        while (numero != 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            int x1 = numero;
            int x2 = numero * 2;
            int x3 = numero * 3;
            int x4 = numero * 4;
            int x5 = numero * 5;
            int x6 = numero * 6;
            int x7 = numero * 7;
            int x8 = numero * 8;
            int x9 = numero * 9;
            int x10 = numero * 10;
            System.out.println(numero + " x 1 = " + x1 + "\n" + 
                    numero + " x 2 = " + x2 + "\n" +
                    numero + " x 3 = " + x3 + "\n" +
                    numero + " x 4 = " + x4 + "\n" +
                    numero + " x 5 = " + x5 + "\n" +
                    numero + " x 6 = " + x6 + "\n" +
                    numero + " x 7 = " + x7 + "\n" +
                    numero + " x 8 = " + x8 + "\n" + 
                    numero + " x 9 = " + x9 + "\n" +
                    numero + " x 10 = " + x10 + "\n");
        }
          
    }
}

