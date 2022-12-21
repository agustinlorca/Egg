package Entidades;

public class Hotel4 extends Hotel {

    protected String gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4() {
    }

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, String gimnasio, String nombreRest, int capacidadRest, double precioHab) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHab);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public String toString() {
        return "Hotel{"+super.toString() + ", Gimnasio: " + gimnasio + ", Nombre rest: " + nombreRest + ", Capacidad rest=" + capacidadRest+", Precio Habitacion= $"+precioHab+"}";
    }

}
