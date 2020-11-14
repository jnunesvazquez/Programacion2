
package com.Programacion.Boletin_7.pkg7_3;

import javax.swing.JOptionPane;

public class Boletin_7_3 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Teclea un numero : "));
          if(numero!=0){
              if(numero>0){
                  System.out.println("O numero e positivo");
              }
              else{
                  System.out.println("O numero e negativo"); 
              }
          }
          else{
              System.out.println("O numero e 0");      
          }
          System.out.println("Remata o condicional");
    }
}
