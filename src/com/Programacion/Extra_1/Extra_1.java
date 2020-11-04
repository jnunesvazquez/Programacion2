
package com.Programacion.Extra_1;

import java.util.Scanner;

public class Extra_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del cliente: ");
        String noCl = sc.nextLine();
        System.out.println("Introduzca el numero de cuenta: ");
        String nuCu = sc.nextLine();
        System.out.println("Introduzca los tipos de intereses: ");
        double ti = sc.nextDouble();
        System.out.println("Introduzca el saldo de la cuenta: ");
        double s = sc.nextDouble();
        System.out.println("Información: "+noCl+" "+nuCu+" "+ti+" "+s);
        Cuenta objCu = new Cuenta();
        double reintegro = objCu.calcularreintegro(800);
        System.out.println("Quedan "+reintegro+" en la cuenta");
        double ingreso = objCu.calcularintegro(800);
        System.out.println("Tiene "+ingreso+" en la cuenta");
        double transferencia = objCu.transferencia(800);
        System.out.println("Quedan "+transferencia+" en la cuenta");
    }
    
}
