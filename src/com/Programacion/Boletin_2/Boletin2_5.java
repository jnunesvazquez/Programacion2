
package com.Programacion.Boletin_2;

import java.util.Scanner;

public class Boletin2_5 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float millas_marinas, metros;
       System.out.println("teclee millas marinas");
       millas_marinas = sc.nextFloat();
       metros = millas_marinas*1852;
       System.out.println(millas_marinas +" millas marinas son "+ metros +" metros ");
    }
    
}
