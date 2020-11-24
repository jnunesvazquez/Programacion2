
package com.Programacion.Boletin_8.Ejercicio_7;

import javax.swing.JOptionPane;

/**
 * Ejemplo: Figuras xeometricas
 */
public class Figuras {
    private float base_cuadrado;
    private float base_triangulo;
    private float altura_triangulo;
    private float radio_circulo;
    private float area;
    public final double PI = 3.1416;

    /**
     * Calcular el area del cuadrado
     */
    public void hacerCuadrado(){
        base_cuadrado = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca la medida del lado "));
        area = (float) Math.pow(base_cuadrado,2);
        System.out.println(" El area del cuadrado es igual a " + area);
    }

    /**
     * Calcular el area del triangulo
     */
    public void hacerTriangulo(){
        base_triangulo = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca la medida de la base"));
        altura_triangulo = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca la medida de la altura"));
        area = base_triangulo * altura_triangulo / 2;
        System.out.println(" El area del triangulo es igual a " + area);
    }

    /**
     * Calcular el area del circulo
     */
    public void hacerCirculo(){
        radio_circulo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida del radio"));
        area = (float) (PI * (Math.pow(radio_circulo,2)));
        System.out.println(" El area del circulo es igual a " + area);
    }
}
