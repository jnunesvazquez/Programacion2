
package com.Programacion.Boletin_7.pkg7_4;

public class Peso_Persoas {
    public float peso1;
    public float peso2;        
    public float diferencia;
    
    public Peso_Persoas(float p1, float p2){
        peso1 = p1;
        peso2 = p2;
    }
    public float getPeso1(){
        System.out.println("Peso primeira persoa = "+peso1+" kg ");
        return peso1;
    }
    public float getPeso2(){
        System.out.println("Peso segunda persoa = "+peso2+" kg ");
        return peso2;
    }
    
    public void calcularPeso(){
        if (peso1>peso2){
            System.out.println("A primeira persoa pesa mais");
            diferencia = peso1-peso2;
            System.out.println("A diferencia e igual a = "+diferencia);
        }
        if (peso1<peso2){
            System.out.println("A segunda persoa pesa mais");
            diferencia = peso2-peso1;
            System.out.println("A diferencia e igual a = "+diferencia);
        }
        if (peso1==peso2){
            System.out.println("As dous persoas pesan o mesmo");
        }
        System.out.println("Remata o condicional");
    }
    
}
