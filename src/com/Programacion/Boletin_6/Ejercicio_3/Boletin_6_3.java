
package com.Programacion.Boletin_6.Ejercicio_3;

/**
 * Satelite
 * @author Joel Nunes
 * @version 1.8.0_261
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
