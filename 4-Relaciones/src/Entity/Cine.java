
package Entity;

import java.util.ArrayList;


public class Cine {
    private Pelicula pelicula;
    private String sala[][];
    private ArrayList<Espectador> listaEspectadores;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, String[][] sala, ArrayList<Espectador> listaEspectadores, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.listaEspectadores = listaEspectadores;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public ArrayList<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public void setListaEspectadores(ArrayList<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", listaEspectadores=" + listaEspectadores + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
    
}
