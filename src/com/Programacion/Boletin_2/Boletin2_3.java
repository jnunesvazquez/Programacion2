
package com.Programacion.Boletin_2;

import java.util.Scanner;
/**
 * Pasar euros a dolares
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin2_3 {

    /**
     * Calculo del cambio
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float euros,dolares;
        float cambio = (float) 1.17;
        System.out.println(" Teclee la cantidad de euros: ");
        euros = sc.nextFloat();
        dolares = euros * cambio;
        System.out.println(euros + " € = " + dolares + "$");
    }
    
}
