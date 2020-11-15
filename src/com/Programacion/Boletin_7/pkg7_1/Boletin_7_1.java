
package com.Programacion.Boletin_7.pkg7_1;

import javax.swing.JOptionPane;

/**
 * Positivo ou negativo
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Boletin_7_1 {

    /**
     * Decidir se un numero e positivo ou negativo
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        float numero = Float.parseFloat(JOptionPane.showInputDialog(" Teclea un numero : "));
        if(numero >= 0)
            System.out.println(" O numero é positivo ");
        System.out.println(" Remata o condicional ");
     }
    }
    
