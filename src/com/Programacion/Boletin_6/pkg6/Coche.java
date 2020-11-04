
package com.Programacion.Boletin_6.pkg6;

import java.util.Scanner;

public class Coche {
    Scanner sc = new Scanner(System.in);
    private int velocidade;

    public Coche(){
        velocidade =0 ;
    }
    public void acelerar (int valor){
        int newVelocidade;
        newVelocidade = velocidade + valor;
        System.out.println("El coche acelera: ");
        valor = sc.nextInt();
        System.out.println("El coche ahora va a "+newVelocidade);
    } 
    public void frenar (int menos){
        int newVelocidade2;
        newVelocidade2 = velocidade - menos;
        System.out.println("El coche frena: ");
        menos = sc.nextInt();
        System.out.println("El coche ahora va a "+newVelocidade2);
    }
}
