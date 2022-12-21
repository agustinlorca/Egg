
package Entidades;


public class Camping extends ExtraHoteleros{
    private int capacidadCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping() {
    }

 

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados,int capacidadCarpas, int cantBanios, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +super.toString()+ "Capacidad carpas: " + capacidadCarpas + ", Cant.Baños: " + cantBanios + ", Restaurante: " + restaurante + '}';
    }
    
    
    
}
