
package Entidades;


public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio() {
    }


    public PersonalServicio(String nombre, String apellido, int dni, String estadoCivil, int anioIncorporacion, int despacho,String seccion) {
        super(nombre, apellido, dni, estadoCivil, anioIncorporacion, despacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()+"PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
    
}
