
package com.Programacion.Extra_1;

import java.util.Scanner;

/**
 * Cuenta
 */
public class Cuenta {
    Scanner sc = new Scanner(System.in);
    public String nombreCliente;
    public String numeroCuenta;
    public double tipoIntereses;
    public double saldo;

    /**
     * Constructor
     */
    public Cuenta(){
    }

    /**
     * Constructor
     * @param noCl nombre do cliente
     * @param nuCu numero de cuenta
     * @param ti tipo de intereses
     * @param s saldo
     */
    public Cuenta(String noCl, String nuCu, double ti, double s){
        nombreCliente = noCl;
        numeroCuenta = nuCu;
        tipoIntereses = ti;
        saldo = s;
    }

    /**
     * Setter
     * @param noCl nombre do cliente
     */
    public void setnombreCliente(String noCl){
        nombreCliente = noCl;
    }

    /**
     * Getter
     * @return nombreCliente
     */
    public String getnombreCliente(){
        return nombreCliente;
    }

    /**
     * Setter
     * @param nuCu numero de cuenta
     */
    public void setnumeroCuenta(String nuCu){
        numeroCuenta = nuCu;
    }

    /**
     * Getter
     * @return numeroCuenta
     */
    public String getnumeroCuenta(){
        return numeroCuenta;
    }

    /**
     * Setter
     * @param ti tipo de intereses
     */
    public void settipointeres(double ti){
        tipoIntereses = ti;
    }

    /**
     * Getter
     * @return tipoIntereses
     */
    public double gettipointeres(){
        return tipoIntereses;
    }

    /**
     * Setter
     * @param s saldo
     */
    public void setsaldo(double s){
        saldo = s;
    }

    /**
     * Getter
     * @return saldo
     */
    public double getsaldo(){
        return saldo;
    }

    /**
     * Metodo para calcular o reintegro
     * @param saldo saldo
     * @return total
     */
    public double calcularreintegro(double saldo){
        double reintegro;
        double total;
        System.out.println("Indique cuanto quiere retirar: ");
        reintegro = sc.nextDouble();
        total = saldo - reintegro;
        return total;
    }

    /**
     * Metodo para calcular o integro
     * @param saldo saldo
     * @return total
     */
    public double calcularintegro(double saldo){
        double ingreso;
        double total;
        System.out.println("Indique cuanto quiere ingresar: ");
        ingreso = sc.nextDouble();
        total = saldo + ingreso;
        return total;
    }

    /**
     * A transferencia a cuenta orixe
     * @param saldo saldo
     * @return cuentaOrigen
     */
    public double transferencia(double saldo){
        double transferencia;
        double cuentaOrigen;
        System.out.println("Indique la cantidad que quiere transferir: ");
        transferencia = sc.nextDouble();
        cuentaOrigen = saldo - transferencia;
        return cuentaOrigen;
    }

    /**
     * Visualizar os datos
     */
    public void visualizar (){
        System.out.println(" El nombre del cliente es " + nombreCliente + " \n El numero de cuenta es " + numeroCuenta +
                " \n Los intereses de la cuenta equivalen a " + tipoIntereses + " \n El saldo de la cuenta es igual a "
                + saldo);
    }
}