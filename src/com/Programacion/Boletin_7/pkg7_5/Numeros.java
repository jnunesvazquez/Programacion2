
package com.Programacion.Boletin_7.pkg7_5;

public class Numeros {
    public int numero1;
    public int numero2;        
    public int numero3;
    
    public Numeros(int n1, int n2, int n3){
        numero1 = n1;
        numero2 = n2;        
        numero3 = n3;
    }
    public void numeroMayor(){
        if (numero1>numero2 && numero1>numero3){
            System.out.println("El primer numero es el mayor");
        }
        if (numero2>numero1 && numero2>numero3){
            System.out.println("El segundo numero es el mayor");
        }
        if (numero3>numero1 && numero3>numero2){
            System.out.println("El tercer numero es el mayor");
        }
        System.out.println("Remata o condicional");
        }
    }

