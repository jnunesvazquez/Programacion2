
package com.Programacion.Extra_2.pkg2_1;

import javax.swing.JOptionPane;

/**
 * Cota no padel
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Extra_2_1 {

    /**
     * Saber o descuento da cota a pagar
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Descontos objetoDescontos = new Descontos();
        int edad = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca su edad "));
        if (edad > 65){
            objetoDescontos.descontoMaiores();
        }
        else if (edad < 21){
                int socio = Integer.parseInt(JOptionPane.showInputDialog
                        (" Introduzca si es socio o no.  1.Socio  2.No socio ")) ;
                if (socio == 1){
                    objetoDescontos.descontoMenoresSocios();
                }
                if (socio == 2){
                    objetoDescontos.descontoMenoresNoSocios();
                }
                if (socio != 1 && socio != 2) {
                    System.out.println(" Ten que engadir 1 ou 2 ");
                }
            }
            else {
                System.out.println(" A cota e de 800 ");
            }   
        }   
    }
