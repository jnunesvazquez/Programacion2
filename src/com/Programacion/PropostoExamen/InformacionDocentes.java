
package com.Programacion.PropostoExamen;

import javax.swing.JOptionPane;

/**
 * Clase para almacenar información y hacer calculos
 */
public class InformacionDocentes {
    private String codigo;
    private String nome;
    private float pagoHoras;
    private float pagoParcial;
    private float soldoBruto;
    private float soldoNeto;
    private int estudosPosgrao;
    private float anosAntiguidade; 
    private int categoria;
    private float horasClase;

    /**
     * Metodo para introducir datos por teclado
     */
    public void introducirDatos(){
        codigo = JOptionPane.showInputDialog("Introduzca o seu codigo");
        nome = JOptionPane.showInputDialog("Introduzca o seu nome");
        categoria = Integer.parseInt(JOptionPane.showInputDialog("Seleccione su categoria de universitario \n \t 1.Principal \n \t 2.Asociado \n \t 3.Auxiliar"));
        estudosPosgrao = Integer.parseInt(JOptionPane.showInputDialog("Seleccione sus estudios de posgrado \n \t 1.Doctorado \n \t 2.Maestria \n \t 3.Ambas \n \t 4.Ninguno"));
        horasClase = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad de horas de clase"));
        anosAntiguidade = Float.parseFloat(JOptionPane.showInputDialog("Introduzca os seus anos de antigüedade"));
    }

    /**
     * Metodo para escoger la categoria del docente
     */
    public void escogerCategoria(){
        switch (categoria) {
            case 1 -> pagoHoras = 25;
            case 2 -> pagoHoras = 18;
            case 3 -> pagoHoras = 15;
            default -> System.out.println("Dato erroneo");
        }
    }

    /**
     * Metodo para calcular el pago parcial
     */
    public void calcularPagoParcial(){
        pagoParcial = horasClase * pagoHoras;
    }

    /**
     * Metodo para calcular el sueldo bruto
     */
    public void calculoSoldoBruto(){
        switch (estudosPosgrao){
            case 1: if (categoria == 1){
                if (anosAntiguidade < 7){
                    soldoBruto = pagoParcial + (pagoParcial * 20 / 100) + (pagoParcial * 5 / 100);
                }
                else {
                    soldoBruto = pagoParcial + (pagoParcial * 20 / 100) + (pagoParcial * 7 / 100);
                }
            }
            else { 
                if(categoria == 2){
                    if (anosAntiguidade < 7){
                        soldoBruto = pagoParcial + (pagoParcial * 15 / 100) + (pagoParcial * 4 / 100);
                    }
                    else {
                        soldoBruto = pagoParcial + (pagoParcial * 15 / 100) + (pagoParcial * 6 / 100);
                    }
                }
                else {
                    if (categoria == 3){
                        if (anosAntiguidade < 7){
                            soldoBruto = pagoParcial + (pagoParcial * 12 / 100) + (pagoParcial * 2 / 100);
                        }
                        else {
                            soldoBruto = pagoParcial + (pagoParcial * 12 / 100) + (pagoParcial * 5 / 100);
                        }
                    }
                }
            }
            break;
            case 2: if (categoria == 1){
                if (anosAntiguidade < 7){
                    soldoBruto = pagoParcial + (pagoParcial * 17 / 100) + (pagoParcial * 5 / 100);
                }
                else {
                    soldoBruto = pagoParcial + (pagoParcial * 17 / 100) + (pagoParcial * 7 / 100);
                }
            }
            else { 
                if(categoria == 2){
                    if (anosAntiguidade < 7){
                        soldoBruto = pagoParcial + (pagoParcial * 10 / 100) + (pagoParcial * 4 / 100);
                    }
                    else {
                        soldoBruto = pagoParcial + (pagoParcial * 10 / 100) + (pagoParcial * 6 / 100);
                    }
                }
                else {
                    if (categoria == 3){
                        if (anosAntiguidade < 7){
                            soldoBruto = pagoParcial + (pagoParcial * 8 / 100) + (pagoParcial * 2 / 100);
                        }
                        else {
                            soldoBruto = pagoParcial + (pagoParcial * 8 / 100) + (pagoParcial * 5 / 100);
                        }
                    }
                }
            }
            break;
            case 3: if (categoria == 1){
                if (anosAntiguidade < 7){
                    soldoBruto = pagoParcial + (pagoParcial * 25 / 100) + (pagoParcial * 5 / 100);
                }
                else {
                    soldoBruto = pagoParcial + (pagoParcial * 25 / 100) + (pagoParcial * 7 / 100);
                }
            }
            else { 
                if(categoria == 2){
                    if (anosAntiguidade < 7){
                        soldoBruto = pagoParcial + (pagoParcial * 20 / 100) + (pagoParcial * 4 / 100);
                    }
                    else {
                        soldoBruto = pagoParcial + (pagoParcial * 20 / 100) + (pagoParcial * 6 / 100);
                    }
                }
                else {
                    if (categoria == 3){
                        if (anosAntiguidade < 7){
                            soldoBruto = pagoParcial + (pagoParcial * 2 / 100) + (pagoParcial * 2 / 100);
                        }
                        else {
                            soldoBruto = pagoParcial + (pagoParcial * 2 / 100) + (pagoParcial * 5 / 100);
                        }
                    }
                }
            }
            break;
            case 4: if (categoria == 1){
                if (anosAntiguidade < 7){
                    soldoBruto = pagoParcial + (pagoParcial * 5 / 100);
                }
                else {
                    soldoBruto = pagoParcial + (pagoParcial * 7 / 100);
                }
            }
            else { 
                if(categoria == 2){
                    if (anosAntiguidade < 7){
                        soldoBruto = pagoParcial + (pagoParcial * 4 / 100);
                    }
                    else {
                        soldoBruto = pagoParcial + (pagoParcial * 6 / 100);
                    }
                }
                else {
                    if (categoria == 3){
                        if (anosAntiguidade < 7){
                            soldoBruto = pagoParcial + (pagoParcial * 2 / 100);
                        }
                        else {
                            soldoBruto = pagoParcial + (pagoParcial * 5 / 100);
                        }
                    }
                }
            }
            break;
            default: System.out.println("Dato erroneo");
        }  
    }

    /**
     * Metodo para calcular el sueldo neto
     */
    public void calcularSoldoNeto(){
        soldoNeto = soldoBruto - (soldoBruto * 13 / 100 + soldoBruto * 5 / 100);
    }

    /**
     * Metodo para mostrar los resultados de los calculos
     */
    public void resultados(){
        System.out.println("Pago parcial = " + pagoParcial + "\nSoldo Bruto = "
                + soldoBruto + "\nSoldo neto = " + soldoNeto);
    }

    /**
     * Metodo para mostrar los datos del docente
     */
    public void informacionDocentes(){
        System.out.println("Codigo = " + codigo + "\nNome = " + nome + 
                "\nCategoria = " + categoria + "\nEstudos de Posgrado = " + estudosPosgrao + 
                "\nHoras de clase = " + horasClase + "\nAnos de antigüedade = " + anosAntiguidade);
    }
}