package Entidades;

public class Rectangulo {

    private int base;
    private int altura;

    //Constructor vacio
    public Rectangulo() {

    }
    
    //Constructor por parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura= altura;
    }
    
    //Metodo get

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
     
    

}
