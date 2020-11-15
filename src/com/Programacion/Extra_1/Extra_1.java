
package com.Programacion.Extra_1;

import java.util.Scanner;

/**
 * Calcular pago de una cuenta
 * @author Joel Nunes
 * @version 1.8.0_261
 */
public class Extra_1 {

    /**
     * A traves de los datos introducidos, mostrar la cuenta
     * @param args Metodo principal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca el nombre del cliente: ");
        String noCl = sc.nextLine();
        System.out.println(" Introduzca el numero de cuenta: ");
        String nuCu = sc.nextLine();
        System.out.println(" Introduzca los tipos de intereses: ");
        double ti = sc.nextDouble();
        System.out.println(" Introduzca el saldo de la cuenta: ");
        double s = sc.nextDouble();
        System.out.println(" Información: \n " + noCl + " \n " + nuCu + " \n " + ti  + " \n " + s);
        Cuenta objetoCuenta = new Cuenta();
        objetoCuenta.visualizar();
        double reintegro = objetoCuenta.calcularreintegro(800);
        System.out.println(" Quedan " + reintegro + " en la cuenta ");
        double ingreso = objetoCuenta.calcularintegro(800);
        System.out.println(" Tiene " + ingreso + " en la cuenta ");
        double transferencia = objetoCuenta.transferencia(800);
        System.out.println(" Quedan " + transferencia + " en la cuenta ");
    }
    
}
