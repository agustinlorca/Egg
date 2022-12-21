
package Entidades;


public abstract class Empleado extends Persona{
    
    protected int anioIncorporacion;
    protected int despacho;

    public Empleado() {
    }


    public Empleado(String nombre, String apellido, int dni, String estadoCivil,int anioIncorporacion, int despacho) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ ", Año incorp.: " + anioIncorporacion + ", Despacho: " + despacho + "} ---> ";
    }
    
    
}
