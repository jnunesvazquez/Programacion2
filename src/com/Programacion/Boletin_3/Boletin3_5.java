
package com.Programacion.Boletin_3;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float soldo_bruto, soldo_liquido, soldo_fixo, comision, quilometraje, dia_desplazamiento;
       System.out.println("Introduzca o seu soldo fixo : ");
       soldo_fixo = sc.nextFloat();
       System.out.println("Introduzca a sua comision : ");
       comision = sc.nextFloat();
       System.out.println("Introduzca os kilometros reccorridos : ");
       quilometraje = sc.nextFloat();
       System.out.println("Introduzca os dias de desprazamento : ");
       dia_desplazamiento = sc.nextFloat();
       soldo_bruto = soldo_fixo + comision*5/100 - quilometraje*2 - dia_desplazamiento*30;
       soldo_liquido = soldo_bruto * 18 / 100 - 36;
       System.out.println(" O soldo bruto e igual a "+soldo_bruto);
       System.out.println(" O soldo liquido e igual a "+soldo_liquido);
    }
    
}
