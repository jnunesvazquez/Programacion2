
package com.Programacion.Boletin_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float billete_100, billete_20, billete_5, moneda_1, cantidad_total;
       System.out.println("Introduzca billetes de 100€ : ");
       billete_100 = sc.nextFloat();
       System.out.println("Introduzca billetes de 20€ : ");
       billete_20 = sc.nextFloat();
       System.out.println("Introduzca billetes de 5€ : ");
       billete_5 = sc.nextFloat();
       System.out.println("Introduzca monedas de 1€ : ");
       moneda_1 = sc.nextFloat();
       cantidad_total = 100 * billete_100 + 20 * billete_20 + 5 * billete_5 + moneda_1;
       System.out.println(" Total = "+cantidad_total+ " € ");
    }
    
}
