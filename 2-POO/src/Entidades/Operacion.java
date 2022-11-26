
package Entidades;

public class Operacion {
    //Creamos atributos
    private int numero1;
    private int numero2;
    
    //Constructor con parametros

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Constructor vacio

    public Operacion() {
    }
    //Metodo get

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }
    
    //Metodo set

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
}
