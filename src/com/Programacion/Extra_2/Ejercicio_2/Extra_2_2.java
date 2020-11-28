
package com.Programacion.Extra_2.Ejercicio_2;

import javax.swing.JOptionPane;

/**
 * Fecha valida
 * @author Joel Nunes
 * @version 1.8.0
 */
public class Extra_2_2 {
    private static int dia, mes, ano, dia_maximo;
    private static boolean validacion;
    
    /**
     * Validar una fecha introducida por pantalla
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        dia = dia_maximo;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año"));
        if (ano >= 1600 && ano <= 3000 && dia >= 1 && dia <= 31){ 
            if (dia_maximo == 28 || dia_maximo == 29 || dia_maximo == 30 || dia_maximo == 31){
                switch (mes){
                    case 1: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 2: if (ano % 4 == 0){
                        dia_maximo = 29; System.out.println("Data valida"); validacion = true;
                    }
                    else {
                        dia_maximo = 28; System.out.println("Data valida"); validacion = true;
                    }
                    break;
                    case 3: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 4: dia_maximo = 30; System.out.println("Data valida"); validacion = true;
                    break;
                    case 5: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 6: dia_maximo = 30; System.out.println("Data valida"); validacion = true;
                    break;
                    case 7: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 8: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 9: dia_maximo = 30; System.out.println("Data valida"); validacion = true;
                    break;
                    case 10: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    case 11: dia_maximo = 30; System.out.println("Data valida"); validacion = true;
                    break;
                    case 12: dia_maximo = 31; System.out.println("Data valida"); validacion = true;
                    break;
                    default: validacion = false; System.out.println("Data non valida");
                }
            }
            else {
            validacion = false;
            System.out.println("Data non valida");
            }
        }
        else {
            validacion = false;
            System.out.println("Data non valida");
        }    
    }
}