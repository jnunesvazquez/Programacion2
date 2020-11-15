
package com.Programacion.Boletin_6.pkg6_3;

import java.util.Scanner;

/**
 * Ejemplo: Circulo
 */
public class Circulo {
    Scanner sc = new Scanner(System.in);
    private double radio;
    public final double pi = 3.14;

    /**
     * Constructor
     */
    public Circulo(){
    }

    /**
     * Constructor
     * @param radio radio do circulo
     * @param pi numero pi
     */
    public Circulo(double radio, double pi){
        this.radio = radio;
    }

    /**
     * Getter
     * @return radio
     */
    public double getRadio(){
        System.out.println(" Radio = ");
        radio = sc.nextDouble();
        System.out.println(" Radio = " + radio);
        return radio;
    }

    /**
     * Getter
     * @return pi
     */
    public double getPi(){
        System.out.println("Pi = 3.14");
        return pi;
    }

    /**
     * Calcular area
     * @return area
     */
    public double calcularArea(){
        double area;
        area = Math.pow(radio,2);
        return area;
    }

    /**
     * Calcular lonxitude
     * @return lonxitude
     */
    public double calcularLonxitude(){
        double lonxitude;
        lonxitude = 2 * pi * radio;
        return lonxitude;
    }

}
