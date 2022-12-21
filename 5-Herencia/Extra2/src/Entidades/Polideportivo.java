package Entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }
    
    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public double calcularSuperficie() {
        double sup = 2 * ((ancho * largo) + (ancho * alto) + (largo * alto));
        return Math.round(sup * 100) / 100;
    }

    @Override
    public double calcularVolumen() {
        double vol = ancho*largo*alto;
        return Math.round(vol*100)/100;
    }

}
