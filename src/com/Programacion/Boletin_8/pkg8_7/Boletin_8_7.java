package com.Programacion.Boletin_8.pkg8_7;

import javax.swing.JOptionPane;

public class Boletin_8_7 {

    public static void main(String[] args){
        Figuras objF = new Figuras();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona de que figura quieres calcular su superficie.   1.Cuadrado   2.Triangulo   3.Circulo"));
        if (opcion>=1 && opcion<=3){ 
            switch (opcion){
                case 1: objF.hacerCuadrado();
                break;
                case 2: objF.hacerTriangulo();
                break;
                case 3: objF.hacerCuadrado();
            }                   
        }
        else {
            System.out.println("Opcion incorrecta");
        }
    }
}
