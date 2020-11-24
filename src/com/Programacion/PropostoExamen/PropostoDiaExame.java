
package com.Programacion.PropostoExamen;

/**
 * Informacion de Docentes Universitarios
 * @author Joel
 * @version 1.8.0_261
 */
public class PropostoDiaExame {

    /**
     * Instanciamos la información de la clase secundaria
     * @param args Metodo principal
     */
    public static void main(String[] args) {  
        InformacionDocentes objetoInfo = new InformacionDocentes();
        objetoInfo.introducirDatos();
        objetoInfo.escogerCategoria();
        objetoInfo.calcularPagoParcial();
        objetoInfo.calculoSoldoBruto();
        objetoInfo.calcularSoldoNeto();
        objetoInfo.informacionDocentes();
        objetoInfo.resultados();
    }
}
