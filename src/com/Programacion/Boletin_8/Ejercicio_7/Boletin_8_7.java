package com.Programacion.Boletin_8.Ejercicio_7;

import javax.swing.JOptionPane;

/**
 * Figuras xeometricas
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Boletin_8_7 {

    /**
     * Calcular a area dunha figura segun decida o usuario
     * @param args Metodo principal
     */
    public static void main(String[] args){
        Figuras objetoFiguras = new Figuras();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog
                (" Selecciona de que figura quieres calcular su superficie.\n 1.Cuadrado\n 2.Triangulo\n 3.Circulo"));
        if (opcion >= 1 && opcion <= 3){
            switch (opcion) {
                case 1 -> objetoFiguras.hacerCuadrado();
                case 2 -> objetoFiguras.hacerTriangulo();
                case 3 -> objetoFiguras.hacerCirculo();
            }
        }
        else {
            System.out.println(" Opcion incorrecta ");
        }
    }
}
