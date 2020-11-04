
package com.Programacion.Boletin_4;

import java.util.Scanner;

public class Boletin_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el titulo del libro: ");
        String t = sc.nextLine();
        System.out.println("Escribe el autor del libro: ");
        String au = sc.nextLine();
        System.out.println("Escribe el año de publicacion del libro: ");
        int a = sc.nextInt();
        System.out.println("Escribe el numero de paginas del libro: ");
        short nP = sc.nextShort();
        System.out.println("Escribe la valoracion del libro: ");
        float v = sc.nextFloat();
        System.out.println("Informacion"+t+", "+au+", "+a+", "+nP+", "+v);
    }
}
