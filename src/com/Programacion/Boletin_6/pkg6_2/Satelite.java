package com.Programacion.Boletin_6.pkg6_2;

/**
 * Ejemplo: Satelite
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    /**
     * Constructor
     */
     public Satelite ( ) {
         meridiano = paralelo = distanciaTerra = 0;
 }

    /**
     * Constructor
     * @param meridiano o meridiano do satelite
     * @param paralelo o paralelo do satelite
     * @param distaciaTerra a distacia a terra do satelite
     */
     public Satelite(double meridiano, double paralelo, double distaciaTerra){
         this.meridiano = meridiano;
         this.paralelo = paralelo;
         this.distanciaTerra = distaciaTerra ;
}

    /**
     * Metodo para ver a posicion do satelite
     */
    public void verPosicion () {
      System.out.println(" O satelite atopase  no paralelo " + paralelo + "meridiano" + meridiano +
              "a unha distancia da terra " + distanciaTerra);
}
}