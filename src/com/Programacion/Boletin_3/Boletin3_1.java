
package com.Programacion.Boletin_3;

import java.util.Scanner;

/**
 * Calculo del descuento
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin3_1 {

    /**
     * Calcular descuento a partir de tarifas
     * @param args Metodo principal
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float precio_tarifa, precio_pagado, descuento;
       System.out.println("Teclee el precio tarifa :");
       precio_tarifa = sc.nextFloat();
       System.out.println("Teclee el precio pagado :");
       precio_pagado = sc.nextFloat();
       descuento = (precio_tarifa - precio_pagado) * 100 / precio_tarifa;
       System.out.println("El descuento de " + precio_tarifa + " € es igual al " + descuento + " % ");
    }
    
}
