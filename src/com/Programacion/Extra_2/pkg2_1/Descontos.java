
package com.Programacion.Extra_2.pkg2_1;

public class Descontos {
    public int cota = 800;
    public int desconto;
    
    public void descontoMaiores(){
        desconto = cota-cota*40/100;
        System.out.println("A cota e igual a "+desconto);
    }
    public void descontoMenoresSocios(){
        desconto = cota-cota*45/100;
        System.out.println("A cota e igual a "+desconto);
    }
    public void descontoMenoresNoSocios(){
        desconto = cota-cota*25/100;
        System.out.println("A cota e igual a "+desconto);
    }
}
