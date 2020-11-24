
package com.Programacion.Boletin_7.Ejercicio_5;

/**
 * Ejemplo: Numeros
 */
public class Numeros {
    private int numero1;
    private int numero2;
    private int numero3;

    /**
     * Constructor
     * @param numero1 primer numero
     * @param numero2 segundo numero
     * @param numero3 tercer numero
     */
    public Numeros(int numero1, int numero2, int numero3){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    /**
     * Definir cal dos tres numeros e o maior
     */
    public void numeroMayor(){
        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(" El primer numero es el mayor ");
        }
        if (numero2 > numero1 && numero2 > numero3){
            System.out.println(" El segundo numero es el mayor ");
        }
        if (numero3 > numero1 && numero3 > numero2){
            System.out.println(" El tercer numero es el mayor ");
        }
        System.out.println(" Remata o condicional ");
        }
    }

