
package com.Programacion.Boletin_4;

public class Libro {
    public String titulo;
    public String autor;
    public int ano;
    public short numPaginas;
    public float valoracion;
    
    public Libro(){
        
    }
    
    public Libro(String t, String au, int a, short nP, float v) {
        titulo = t;
        autor = au;
        ano = a;
        numPaginas = nP;
        valoracion = v;
    }
    
    public void setTitulo(String t){
        titulo = t;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String au){
        autor = au;
    }
    public String getAltura(){
        return autor;
    }
    public void setAno(int a){
        ano = a;
    }
    public float getAno(){
        return ano;
    }
    public void setNumPaginas(short nP){
        numPaginas = nP;
    }
    public float getNumPaginas(){
        return numPaginas;
    }
    public void setValoracion(float v){
        valoracion = v;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void visualizar (){
        System.out.println("o titulo do libro e "+titulo+"o autor do libro e"+autor+"o ano no que se escribiu e "+ano+"ten "+numPaginas+" numero de paginas"+"su valoracion es de "+valoracion);
    }
}