
package com.Programacion.Boletin_11;

import javax.swing.JOptionPane;

/**
 * Clase para los metodos del juego
 */
public class XogoAdivinanza {

    /**
     * Metodo para crear un xogo de adiviñar un numero introducido por nos
     */
    public void xogoAdivinanza(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir número a adivinar"));
        if (numero >= 1 && numero <= 50){
            for(int i = 1; i <= 5; i++){
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número"));
                if (numero2 != numero){
                    if (numero2 < numero){
                    JOptionPane.showMessageDialog(null, "El número introducido es menor");
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "El número introducido es mayor");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "El numero es correcto");
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero para adivinar incorrecto");
        }
    }

    /**
     * Metodo para crear un xogo de adiviñar un numero introducido polo ordenador
     */
    public void xogoAdivinanzaOrdenador(){
        double numero = Math.floor(Math.random() * 50 + 1);
        System.out.println(numero);
        if (numero >= 1.0 && numero <= 50.0){
            for(int i = 1; i <= 10; i++){
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Adivina el número"));
                if (numero2 != numero){
                    if (numero2 - numero > 20 || numero - numero2 > 20){
                        JOptionPane.showMessageDialog(null, "Moi lonxe");
                    }
                    else if(numero2 - numero <= 20 && numero2 - numero >= 10 || numero - numero2 <= 20 && numero - numero2 >= 10){
                        JOptionPane.showMessageDialog(null, "Lonxe");
                    }
                    else if(numero2 - numero < 10 && numero2 - numero > 5 || numero - numero2 < 10 && numero - numero2 > 5){
                        JOptionPane.showMessageDialog(null, "Preto");
                    }
                    else if(numero2 - numero <= 5 || numero - numero2 <= 5){
                        JOptionPane.showMessageDialog(null, "Moi preto");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "El numero es correcto");
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero para adivinar incorrecto");
        }
    }
}
