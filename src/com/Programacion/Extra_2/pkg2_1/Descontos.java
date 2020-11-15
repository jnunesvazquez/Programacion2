
package com.Programacion.Extra_2.pkg2_1;

/**
 * Ejemplo: Descontos
 */
public class Descontos {
    private final int cota = 800;
    private int desconto;

    /**
     * Calcular o desconto dos maiores
     */
    public void descontoMaiores(){
        desconto = cota - cota * 40 / 100;
        System.out.println(" A cota e igual a " + desconto);
    }

    /**
     * Calcular o desconto dos menores dos pais que son socios
     */
    public void descontoMenoresSocios(){
        desconto = cota - cota * 45 / 100;
        System.out.println(" A cota e igual a " + desconto);
    }

    /**
     * Calcular o desconto dos menores dos pais que non son socios
     */
    public void descontoMenoresNoSocios(){
        desconto = cota - cota * 25 / 100;
        System.out.println(" A cota e igual a " + desconto);
    }
}
