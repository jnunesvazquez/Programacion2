
package com.Programacion.Boletin_6.pkg6_3;

/**
 * Satelite
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Boletin_6_3 {

    /**
     * Instanciar a area e lonxitude dun circulo
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Circulo objetoCirculo = new Circulo();
        double radio = objetoCirculo.getRadio();
        double pi = objetoCirculo.getPi();
        double area = objetoCirculo.calcularArea();
        double lonxitude = objetoCirculo.calcularLonxitude();
        System.out.println(" Area = " + area);
        System.out.println(" Lonxitude = " + lonxitude);
    }
}
