
package com.Programacion.Boletin_9.Ejercicio_5;

import javax.swing.JOptionPane;

/**
 * Clase secundaria para hacer calculos
 */
public class Numeros {
    
    /**
     * Metodo para calcular el sueldo
     */
    public void soldoTraballadores(){
        int numero_soldos_sup = 0;
        int numero_soldos_inf = 0;
        float porcentaje_soldos;
        int soldo = 1;
        int i;
        for(i = 0; soldo != 0; i++){
            soldo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sus sueldo"));
            if(soldo > 0){
                if(soldo >= 1000 && soldo <= 1750){
                    numero_soldos_sup++;  
                }
                else if(soldo < 1000){
                    numero_soldos_inf++;  
                }
            }
            else if(soldo < 0){
                System.out.println("Non se admiten soldos negativos");
                }               
            }
        System.out.println("Numero de soldos superiores = " + numero_soldos_sup);
        i--;
        porcentaje_soldos = numero_soldos_inf / (float) i * 100;
        System.out.println("Porcentaje de soldos = " + porcentaje_soldos + "%");
        }
}

    
    


