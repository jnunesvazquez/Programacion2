
package com.Programacion.Boletin_3;

import java.util.Scanner;

/**
 * Cantidad total en billetes
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin3_4 {

   /**
    * Separar en billetes la cantidad total aportada
    * @param args Metodo principal
    */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float billete_100, billete_20, billete_5, moneda_1, cantidad_total;
       System.out.println(" Introduzca la cantidad total : ");
       cantidad_total = sc.nextFloat();
       billete_100 = (cantidad_total - cantidad_total % 100) / 100;
       billete_20 = (cantidad_total % 100 - cantidad_total % 100 % 20) / 20;
       billete_5 = (cantidad_total % 100 % 20 - cantidad_total % 100 % 20 % 5) / 5;
       moneda_1 = cantidad_total % 100 % 20 % 5;
       System.out.println(billete_100 + " billetes de 100€ ");
       System.out.println(billete_20 + " billetes de 20€ ");
       System.out.println(billete_5 + " billetes de 5€ ");
       System.out.println(moneda_1 + " monedas de 1€ ");
    }
    
}
