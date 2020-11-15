
package com.Programacion.Boletin_5;

/**
 * Consumo dun vehiculo
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin_5 {

    /**
     * Mostrar os diferentes consumos dun vehiculo
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Consumo objetoConsumo = new Consumo(2000,60,50,(float)1.57);
        float kilometros = objetoConsumo.kilometros;
        System.out.println("Kilometros recorridos = " + kilometros);
        float litrosConsumidos = objetoConsumo.litros;
        System.out.println("Litros consumidos = " + litrosConsumidos);
        float precioGasolina = objetoConsumo.pGas;
        System.out.println("Precio de la gasolina = " + precioGasolina + " € ");
        float velocidadMedia = objetoConsumo.vMed;
        System.out.println("Velocidad media = " + velocidadMedia);
        float tempo = objetoConsumo.getTempo();
        System.out.println("Tiempo empleado en llegar = " + tempo);
        float consumoMedioLitros = objetoConsumo.consumoMedioLitros();
        System.out.println("Consumo medio de litros = " + consumoMedioLitros);
        float gastoEuros = objetoConsumo.consumoEuros();
        System.out.println("Gasto medio en euros = " + gastoEuros);
        
    }
    
}
