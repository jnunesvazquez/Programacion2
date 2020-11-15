package com.Programacion.Boletin_2;

import java.util.Scanner;

/**
 * Diferentes calculos con dos numeros
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin2_4 {

    /**
     * Calculos con dos numeros introducidos por consola
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2, suma, resta, producto, cociente;
        System.out.println(" Teclee un numero ");
        num1 = sc.nextFloat();
        System.out.println(" Teclee otro numero ");
        num2 = sc.nextFloat();
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        cociente = num1 / num2;
        System.out.println(" Suma = " + suma);
        System.out.println(" Resta = " + resta);
        System.out.println(" Producto = " + producto);
        System.out.println(" Cociente = " + cociente);
    }

}
