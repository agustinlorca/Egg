package Entidades;

public class Hotel5 extends Hotel4 {

    private int cantSalones;
    private int cantSuites;
    private int cantLimusinas;

    public Hotel5() {
    }

    public Hotel5(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, String gimnasio, String nombreRest, int capacidadRest, int cantSalones, int cantSuites, int cantLimusinas, double precioHab) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, gimnasio, nombreRest, capacidadRest, precioHab);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }


    @Override
    public String toString() {
        return super.toString()+" {Cant. salones: " + cantSalones + ", Cant. suites: " + cantSuites + ", Cant. limusinas: " + cantLimusinas+"}";
    }

}
