
package Entidades;


public class Residencia extends ExtraHoteleros{
    
    private int cantHabitaciones;
    private boolean descGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados,int cantHabitaciones, boolean descGremios, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremios = descGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +super.toString()+ ", Cant. Habitaciones: " + cantHabitaciones + ", Desc.Gremios: " + descGremios + ", Campo Deportivo: " + campoDeportivo + '}';
    }
    
    
}
