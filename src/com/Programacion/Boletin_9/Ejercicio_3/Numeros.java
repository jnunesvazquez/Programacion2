
package com.Programacion.Boletin_9.Ejercicio_3;

import javax.swing.JOptionPane;

/**
 * Clase secundaria para hacer calculos
 */
public class Numeros {
    private int base;
    private int altura;
    private int area;
    
    /**
     * Metodo para calcular el area de un rectangulo
     */
    public void areaRectangulo(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
        if (base > 0 && altura > 0){
            area = base * altura;
            System.out.println("Area = " + area);
        } 
        else {
            System.out.println("Datos erroneos");
        }
    }
}

