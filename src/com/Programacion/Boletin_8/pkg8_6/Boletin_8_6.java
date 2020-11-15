
package com.Programacion.Boletin_8.pkg8_6;

import javax.swing.JOptionPane;

/**
 * Vendas anuais
 * @author Joel Nunes
 * @version 06/11/2020
 */
public class Boletin_8_6 {

    /**
     * Definir o un artigo en base das ventas anuais
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        int vendasAnuais = Integer.parseInt(JOptionPane.showInputDialog("Introduzca as vendas anuais do artigo "));
        if (vendasAnuais>0){
            if (vendasAnuais<=100){
                System.out.println("O artigo e de baixo consumo");
            }
            if (vendasAnuais>100 && vendasAnuais<=500){
                System.out.println("O artigo e de medio consumo");
            }
            if (vendasAnuais>500 && vendasAnuais<=1000){
                System.out.println("O artigo e de alto consumo");
            }
            if (vendasAnuais>1000){
                System.out.println("O artigo e de primeira necesidade");
            }
        }
        else{
            System.out.println("O valor das vendas ten que ser maior de 0");    
        }
        
    }
}
