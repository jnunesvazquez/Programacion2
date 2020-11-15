
package com.Programacion.Boletin_4;

/**
 * Ejemplo: Libro
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    /**
     * Contructor.
     */
    public Libro() {
    }

    /**
     * Contructor
     * @param titulo o titulo do libro
     * @param autor o autor do libro
     * @param ano o ano de publicacion do libro
     * @param numPaginas o numero de paxinas
     * @param valoracion a valoracion do libro
     */
    public Libro(String titulo, String autor, int ano, short numPaginas, float valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
    }

    /**
     * Setter
     * @param titulo o titulo do libro
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Getter
     * @return titulo
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     * Setter
     * @param autor o autor do libro
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Getter
     * @return autor
     */
    public String getAltura(){
        return autor;
    }

    /**
     * Setter
     * @param ano o ano de publicacion do libro
     */
    public void setAno(int ano){
        this.ano = ano;
    }

    /**
     * Getter
     * @return ano
     */
    public float getAno(){
        return ano;
    }

    /**
     * Setter
     * @param numPaginas o numero de paxinas
     */
    public void setNumPaginas(short numPaginas){
        this.numPaginas = numPaginas;
    }

    /**
     * Getter
     * @return numPaginas
     */
    public float getNumPaginas(){
        return numPaginas;
    }

    /**
     * Setter
     * @param valoracion a valoracion do libro
     */
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }

    /**
     * Getter
     * @return valoracion
     */
    public float getValoracion(){
        return valoracion;
    }

    /**
     * Mostrar en pantalla a informacion
     */
    public void visualizar (){
        System.out.println("O titulo do libro e " + titulo + " \n O autor do libro e" + autor +
                " \n O ano no que se escribiu e " + ano + " \n Ten " + numPaginas + " numero de paginas"+
                " \n Su valoracion es de " + valoracion);
    }
}