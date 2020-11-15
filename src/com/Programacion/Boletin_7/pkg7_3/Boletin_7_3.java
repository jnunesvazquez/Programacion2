
package com.Programacion.Boletin_7.pkg7_3;

import javax.swing.JOptionPane;

/**
 * Positivo ou negativo 2
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Boletin_7_3 {

    /**
     * Deducir se un numero e negativo, postivo ou cero
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Teclea un numero : "));
          if(numero != 0){
              if(numero > 0){
                  System.out.println(" O numero e positivo ");
              }
              else{
                  System.out.println(" O numero e negativo ");
              }
          }
          else{
              System.out.println(" O numero e 0 ");
          }
          System.out.println(" Remata o condicional ");
    }
}
