
package Entity;


public class Espectador {
    private int ID;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(int ID, int edad, double dinero) {
        this.ID = ID;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "ID=" + ID + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
    
    
}
