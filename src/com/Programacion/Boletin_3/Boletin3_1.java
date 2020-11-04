
package com.Programacion.Boletin_3;

import java.util.Scanner;


public class Boletin3_1 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float precio_tarifa, precio_pagado, descuento;
       System.out.println("teclee el precio tarifa :");
       precio_tarifa = sc.nextFloat();
       System.out.println("teclee el precio pagado :");
       precio_pagado = sc.nextFloat();
       descuento = (precio_tarifa - precio_pagado)*100/precio_tarifa;
       System.out.println("El descuento de "+precio_tarifa+" € es igual al "+descuento+" % ");
    }
    
}
