
package Entidades;


public class EdificioDeOficinas extends Edificio {
    
    private int oficinas;
    private int personas;
    private int pisos;

    public EdificioDeOficinas() {
    }
    
    public EdificioDeOficinas(int oficinas, int personas, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    
    @Override
    public double calcularSuperficie() {
        double sup = 2*((ancho*largo)+(ancho*alto)+(largo*alto));
        
        return Math.round(sup*100)/100;
    }

    @Override
    public double calcularVolumen() {
        double vol = ancho*largo*alto;
        return Math.round(vol*100)/100;
    }
    
    
}
