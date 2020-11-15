
package com.Programacion.Boletin_2;

import java.util.Scanner;

/**
 * Cambio de millas a metros
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin2_5 {

    /**
     * Calculo de metros a partir de un valor introducido por consola
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float millas_marinas, metros;
        System.out.println(" Teclee millas marinas ");
        millas_marinas = sc.nextFloat();
        metros = millas_marinas * 1852;
        System.out.println(millas_marinas + " millas marinas son " + metros + " metros ");
    }

}
