
package com.Programacion.Boletin_2;

import java.util.Scanner;

public class Boletin2_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        float euros,dolares;
        float cambio = (float) 1.17;
        System.out.println("teclee la cantidad de euros: ");
        euros = sc.nextFloat();
        dolares = euros * cambio;
        System.out.println(euros + " € = "+ dolares +"$");
    }
    
}
