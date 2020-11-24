
package com.Programacion.Boletin_7.Ejercicio_4;

/**
 * Ejemplo: Pesos
 */
public class Peso_Persoas {
    private float peso1;
    private float peso2;
    private float diferencia;

    /**
     * Constructor
     * @param peso1 peso primera persona
     * @param peso2 peso segunda persona
     */
    public Peso_Persoas(float peso1, float peso2){
        this.peso1 = peso1;
        this.peso2 = peso2;
    }

    /**
     * Getter
     * @return peso1
     */
    public float getPeso1(){
        System.out.println(" Peso primeira persoa = " + peso1 + " kg ");
        return peso1;
    }

    /**
     * Getter
     * @return peso2
     */
    public float getPeso2(){
        System.out.println(" Peso segunda persoa = " + peso2 + " kg ");
        return peso2;
    }

    /**
     * Definir que persoa pesa mais e calcular a sua diferencia
     */
    public void calcularPeso(){
        if (peso1 > peso2){
            System.out.println(" A primeira persoa pesa mais ");
            diferencia = peso1 - peso2;
            System.out.println(" A diferencia e igual a = " + diferencia);
        }
        if (peso1 < peso2){
            System.out.println(" A segunda persoa pesa mais ");
            diferencia = peso2 - peso1;
            System.out.println(" A diferencia e igual a = " + diferencia);
        }
        if (peso1 == peso2){
            System.out.println(" As dous persoas pesan o mesmo ");
        }
        System.out.println(" Remata o condicional ");
    }
    
}
