package Entidades;

public class Animal {

    protected String Nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String Nombre, String alimento, Integer edad, String raza) {
        this.Nombre = Nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    
    public String toString() {
        return "Animal{" + "Nombre=" + Nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    

    public void alimentarse() {
        System.out.println(Nombre+", se alimenta de " + alimento);
    }
}
