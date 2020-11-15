
package com.Programacion.Boletin_4;

import java.util.Scanner;

/**
 * Informacion dun libro
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin_4 {

    /**
     * Introducir por pantalla os datos dun libro
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escribe el titulo del libro: ");
        String titulo = sc.nextLine();
        System.out.println(" Escribe el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println(" Escribe el año de publicacion del libro: ");
        int ano = sc.nextInt();
        System.out.println(" Escribe el numero de paginas del libro: ");
        short numPaginas = sc.nextShort();
        System.out.println(" Escribe la valoracion del libro: ");
        float valoracion = sc.nextFloat();
        System.out.println(" Informacion " + titulo + ", " + autor + ", " + ano + ", " + numPaginas + ", "
                + valoracion);
    }
}
