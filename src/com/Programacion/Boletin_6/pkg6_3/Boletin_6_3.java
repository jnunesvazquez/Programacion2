
package com.Programacion.Boletin_6.pkg6_3;

public class Boletin_6_3 {
    
    public static void main(String[] args) {
        Circulo objCirculo = new Circulo();
        double radio = objCirculo.getRadio();
        double pi = objCirculo.getPi();
        double area = objCirculo.calcularArea();
        double lonxitude = objCirculo.calcularLonxitude();
        System.out.println("Area = "+area);
        System.out.println("Lonxitude = "+lonxitude);
    }
}
