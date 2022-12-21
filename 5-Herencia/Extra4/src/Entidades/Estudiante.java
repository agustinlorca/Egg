
package Entidades;


public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

  

    public Estudiante(String nombre, String apellido, int dni, String estadoCivil,String curso) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+ ", Curso:" + curso + '}';
    }
    
    
}
