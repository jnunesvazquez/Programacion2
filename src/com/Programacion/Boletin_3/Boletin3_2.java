
package com.Programacion.Boletin_3;

import java.util.Scanner;

/**
 * Pasar ºC a Kelvin y Fahrenheit
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin3_2 {

    /**
     * Calculos de Kelvin y Fahrenheit a partir de ºC
     * @param args Metodo principal
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float Celsius, kelvin, fahrenheit;
       System.out.println(" Teclee los ºC : ");
       Celsius = sc.nextFloat();
       kelvin = Celsius + 273;
       fahrenheit = (float) (Celsius * 1.8 + 32);
       System.out.println(kelvin + " K ");
       System.out.println(fahrenheit + " ºF ");
    }
    
}
