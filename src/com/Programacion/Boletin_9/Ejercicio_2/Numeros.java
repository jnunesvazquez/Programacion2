
package com.Programacion.Boletin_9.Ejercicio_2;

import javax.swing.JOptionPane;

/**
 * Clase secundaria para hacer calculos
 */
public class Numeros {
    
    /**
     * Metodo para separar los numeros por tipo
     */
    public void suma_e_producto(){
        float numero;
        float suma = 0;
        float producto = 1;
        for (numero = 10; numero <= 90; numero++){
            suma = suma + numero;
            producto = producto * numero;
        }
        suma--;
        System.out.println("Suma = " + suma + "\nProducto = " + producto);
    }
}

