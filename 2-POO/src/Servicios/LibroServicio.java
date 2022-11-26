
package Servicios;

import Entidades.Libro;
import java.util.Scanner;


public class LibroServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro(){
        //Instanciamos un objeto tipo Libro
        Libro libro1 = new Libro();
        
        //Asignamos valores a los atributos
        System.out.println("Ingrese el ISBN del libro");
        libro1.setISBN(leer.nextInt());
        System.out.println("Ingrese el título del libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        libro1.setNumPag(leer.nextInt());
       
        return libro1;
    }
}
