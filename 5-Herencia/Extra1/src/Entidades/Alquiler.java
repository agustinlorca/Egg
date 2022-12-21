
package Entidades;

import java.time.LocalDate;



public class Alquiler {
    
    protected String nombre;
    protected int dni;
    protected LocalDate fechaAlq;
    protected LocalDate fechaDev;
    protected int amarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, LocalDate fechaAlq, LocalDate fechaDev, int amarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Barco{" + "cliente=" + nombre + ", dni=" + dni + ", fecha Alquiler=" + fechaAlq + ", fecha devolucion=" + fechaDev + ", amarre=" + amarre + ", barco=" + barco + '}';
    }
    
}
