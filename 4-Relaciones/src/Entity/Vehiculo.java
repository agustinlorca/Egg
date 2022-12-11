
package Entity;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private String patente;
    private int anio;
    private String motor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String patente, int anio, String motor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public int getAnio() {
        return anio;
    }

    public String getMotor() {
        return motor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca: " + marca + ", Modelo: " + modelo + ", Patente: " + patente + ", Anio: " + anio + ", Motor: " + motor + ", Chasis: " + chasis + ", Color: " + color + ", Tipo: " + tipo + '}';
    }
    
    
    
    
}
