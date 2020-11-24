
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
        float suma;
        float producto;
        float numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 10 y 90"));
        float numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero entre 10 y 90"));
        if (numero1 >= 10 && numero1 <= 90 && numero2 >= 10 && numero2 <= 90){
            suma = numero1 + numero2;
            producto = numero1 * numero2;
            System.out.println("Suma = " + suma + "\nProducto = " + producto);
        }
        else {
            System.out.println("Datos erroneos");
        }
    }
}

