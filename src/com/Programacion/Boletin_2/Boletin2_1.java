package com.Programacion.Boletin_2;

/**
 * Descripcion del programa
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Boletin2_1 {
    /**
     * Descripcion del metodo principal
     * @param args: El metodo principal
     */
    public static void main(String[] args) {
        float base = 4.5f; //pongo f para quelo tome como flato
        float altura = (float) 2.5; //hago un cast a float porque por defecto es double
        float area;

        area = base * altura;
        System.out.println(" area = " + area);
    }

}
