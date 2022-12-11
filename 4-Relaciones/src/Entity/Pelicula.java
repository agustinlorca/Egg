
package Entity;


public class Pelicula {
    private String titulo;
    private double duracion;
    private int edad;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edad, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad = edad;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getEdad() {
        return edad;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "{" + "titulo=" + titulo + ", duracion=" + duracion + ", edad=" + edad + ", director=" + director + '}';
    }

  
    
    
    
}
