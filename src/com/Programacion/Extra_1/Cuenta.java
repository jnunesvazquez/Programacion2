
package com.Programacion.Extra_1;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    public String nombreCliente;
    public String numeroCuenta;
    public double tipoIntereses;
    public double saldo;
    
    public Cuenta(){
    }
    public Cuenta(String noCl, String nuCu, double ti, double s){
        nombreCliente = noCl;
        numeroCuenta = nuCu;
        tipoIntereses = ti;
        saldo = s;
    }
    public void setnombreCliente(String noCl){
        nombreCliente = noCl;
    }
    public String getnombreCliente(){
        return nombreCliente;
    }
    public void setnumeroCuenta(String nuCu){
        numeroCuenta = nuCu;
    }
    public String getnumeroCuenta(){
        return numeroCuenta;
    }
    public void settipointeres(double ti){
        tipoIntereses = ti;
    }
    public double gettipointeres(){
        return tipoIntereses;
    }
    public void setsaldo(double s){
        saldo = s;
    }
    public double getsaldo(){
        return saldo;
    }
    public double calcularreintegro(double saldo){
        double reintegro;
        double total;
        System.out.println("Indique cuanto quiere retirar: ");
        reintegro = sc.nextDouble();
        total = saldo - reintegro;
        return total;
    }
    public double calcularintegro(double saldo){
        double ingreso;
        double total;
        System.out.println("Indique cuanto quiere ingresar: ");
        ingreso = sc.nextDouble();
        total = saldo + ingreso;
        return total;
    }
    public double transferencia(double saldo){
        double transferencia;
        double cuentaOrigen;
        System.out.println("Indique la cantidad que quiere transferir: ");
        transferencia = sc.nextDouble();
        cuentaOrigen = saldo - transferencia;
        return cuentaOrigen;
    }
    public void visualizar (){
        System.out.println("El nombre del cliente es "+nombreCliente+" El numero de cuenta es "+numeroCuenta+" Los intereses de la cuenta equivalen a "+tipoIntereses+" El saldo de la cuenta es igual a "+saldo);
    }
}