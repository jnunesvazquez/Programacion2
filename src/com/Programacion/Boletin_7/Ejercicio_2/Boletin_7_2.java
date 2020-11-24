
package com.Programacion.Boletin_7.Ejercicio_2;

import javax.swing.JOptionPane;

/**
 * Calculos condicionales
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin_7_2 {

    /**
     * Decidir que calculo se fara segun o usuario
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        int resta;
        short numero1 = Short.parseShort(JOptionPane.showInputDialog(" Teclea un numero : "));
        short numero2 = Short.parseShort(JOptionPane.showInputDialog(" Teclea outro numero : "));
        int suma;
          if(numero1 >= numero2){
              resta = numero1 - numero2;
              System.out.println(" A resta e igual a " + resta);
          }
          else {
              suma = numero1 + numero2;
              System.out.println(" A suma e igual a " + suma);
          }
        
        System.out.println(" Remata o condicional ");
     }
    }
