
package com.Programacion.Boletin_8.pkg8_7;

import javax.swing.JOptionPane;

public class Figuras {
    private float base_c;
    private float base_t;
    private float altura_t;
    private float radio_ci;
    private float area;
    public final double PI = 3.1416;
    
    public void hacerCuadrado(){
        base_c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida del lado"));
        area =(float) Math.pow(base_c,2);
        System.out.println("El area del cuadrado es igual a "+area);
    }
    public void hacerTriangulo(){
        base_t = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la base"));
        altura_t = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida de la altura"));
        area = base_t*altura_t/2;
        System.out.println("El area del triangulo es igual a "+area);
    }
    public void hacerCirculo(){
        radio_ci = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la medida del radio"));
        area = (float) (PI*(Math.pow(radio_ci,2)));
        System.out.println("El area del circulo es igual a "+area);
    }
}
