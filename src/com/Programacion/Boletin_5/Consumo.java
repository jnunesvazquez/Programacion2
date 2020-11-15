
package com.Programacion.Boletin_5;

/**
 * Clase y Metodos de la clase Consumo
 */
public class Consumo {
    public float kilometros;
    public float litros;
    public float vMed;
    public float pGas;

    /**
     * Constructor
     * @param km kilometros recorridos
     * @param l litros consumidos
     * @param vm velocidade media
     * @param pg precio do gas
     */
    public Consumo(float km, float l, float vm, float pg) {
        kilometros = km;
        litros = l;
        vMed = vm;
        pGas = pg;
    }

    /**
     * Templo empleado en chegar
     * @return tempo
     */
    public float getTempo() {
        float tempo;
        tempo = kilometros / vMed; 
        return tempo;
    }

    /**
     * Consumo medio dos litros durante o viaxe
     * @return consumoMedioLitros
     */
    public float consumoMedioLitros(){
        float consumoMedioLitros;
        consumoMedioLitros = litros * 100 / kilometros;
        return consumoMedioLitros;
    }

    /**
     * O gasto de repostaxe
     * @return gastoEuros
     */
    public float consumoEuros(){
        float gastoEuros;
        gastoEuros = pGas * (litros * 100 / kilometros);
        return gastoEuros;
    }

    /**
     * Setter
     * @param km kilometros recorridos
     */
    public void setKms(float km){
        kilometros = km;
    }

    /**
     * Setter
     * @param l litros consumidos
     */
    public void setlitros(float l){
        litros = l;
    }

    /**
     * Setter
     * @param vm velocidade media
     */
    public void setvMed(float vm){
        vMed = vm;
    }

    /**
     * Setter
     * @param pg precio do gas
     */
    public void setpGas(float pg){
        pGas = pg;
    }
}
