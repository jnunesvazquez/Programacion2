
package com.Programacion.Boletin_6.pkg6_3;

import java.util.Scanner;

public class Circulo {
    Scanner sc = new Scanner(System.in);
    public double radio;
    public double pi = 3.14;
    
    public Circulo(){
        
    }
    public Circulo(double r, double p){
        radio = r;
        pi = p;
    }
    public double getRadio(){
        System.out.println("Radio = ");
        radio = sc.nextDouble();
        System.out.println("Radio = "+radio);
        return radio;
    }
    public double getPi(){
        System.out.println("Pi = 3.14");
        return pi;
    }
    public double calcularArea(){
        double area;
        area = Math.pow(radio,2);
        return area;
    }
    public double calcularLonxitude(){
        double lonxitude;
        lonxitude = 2*pi*radio;
        return lonxitude;
    }

}
