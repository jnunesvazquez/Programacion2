
package com.Programacion.Boletin_3;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float Celsius, kelvin, fahrenheit;
       System.out.println("teclee los ºC :");
       Celsius = sc.nextFloat();
       kelvin = Celsius + 273;
       fahrenheit = (float) (Celsius * 1.8 + 32);
       System.out.println(kelvin+ " K ");
       System.out.println(fahrenheit+" ºF ");
    }
    
}
