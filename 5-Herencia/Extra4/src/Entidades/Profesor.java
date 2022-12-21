
package Entidades;


public class Profesor extends Empleado{
    private String departamento;

    public Profesor() {
    }

   
    public Profesor(String nombre, String apellido, int dni, String estadoCivil, int anioIncorporacion, int despacho,String departamento) {
        super(nombre, apellido, dni, estadoCivil, anioIncorporacion, despacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "Departamento: " + departamento + '}';
    }
    
    
}
