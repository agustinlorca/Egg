package Entidades;

import java.util.Comparator;

public class Hotel extends Alojamiento  {

    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected Double precioHab;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, Double precioHab) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Double precioHab) {
        this.precioHab = precioHab;
    }
    
    //Metodo que compara los precios en orden descendente
    public static Comparator<Hotel> precioDesc = (Hotel h1, Hotel h2) -> h2.getPrecioHab().compareTo(h1.getPrecioHab());

    @Override
    public String toString() {
        return super.toString() + ", Cant. habitaciones: " + cantHabitaciones + ", Cant. camas: " + numCamas + ", Pisos: " + cantPisos;
    }

}
