
package com.Programacion.Extra_2.pkg2_1;

import javax.swing.JOptionPane;

public class Extra_2_1 {

    public static void main(String[] args) {
        Descontos objD = new Descontos();
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        if (edad>65){
            objD.descontoMaiores();
        }
        else if (edad<21){
                int socio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca si es socio o no.  1.Socio  2.No socio")) ;
                if (socio==1){
                    objD.descontoMenoresSocios();
                }
                if (socio==2){
                    objD.descontoMenoresNoSocios();
                }
                if (socio!=1 && socio!=2) {
                    System.out.println("Ten que engadir 1 ou 2");
                }
            }
            else {
                System.out.println("A cota e de 800");
            }   
        }   
    }
