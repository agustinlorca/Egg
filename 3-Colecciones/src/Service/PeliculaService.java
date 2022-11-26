
package Service;

import Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import static Utilities.ComparadorPelicula.duracionDesc;
import static Utilities.ComparadorPelicula.duracionAsc;
import static Utilities.ComparadorPelicula.tituloAsc;
import static Utilities.ComparadorPelicula.directorAsc;

import java.util.Comparator;
import java.util.Scanner;


public class PeliculaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        
        System.out.println("Ingrese el título de la película");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de la película '"+p.getTitulo()+"'");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duración en horas de la película '"+p.getTitulo()+"'");
        p.setDuracion(leer.nextDouble());
        
        return p;
    }
    
    public void listaPeliculas(){
        
        String respuesta = "S";
        
        do {
            //Añadimos el objeto de pelicula a una lista de objetos de peliculas
            listaPeliculas.add(crearPelicula());
            
            System.out.println("¿Desea crear otra película? (S/N)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
       
    }
    
    public void mostrarPeliculas(){
        
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("");
    }
    
    public void duracionMayorHora(){
        System.out.println("----------Peliculas con duración mayor a 1 hora ----------");
        
        for (Pelicula listaPelicula : listaPeliculas) {
            
            if (listaPelicula.getDuracion()>1){
                System.out.println(listaPelicula);
            }
            
        }
        System.out.println("");
    }
    
    public void duracionDesc(){
        System.out.println("----------Peliculas ordenadas en forma descendente según duración----------");
        listaPeliculas.sort(duracionDesc);
        mostrarPeliculas();
        
    }
    
    public void duracionAsc(){
        System.out.println("----------Peliculas ordenadas en forma ascendente según duración----------");
        listaPeliculas.sort(duracionAsc);
        mostrarPeliculas();
    }
    
    public void tituloAlfabeticamente(){
        System.out.println("----------Peliculas ordenadas por título alfabeticamente----------");
        listaPeliculas.sort(tituloAsc);
        mostrarPeliculas();
    }
    public void directorAlfabeticamente(){
        System.out.println("----------Peliculas ordenadas por director alfabeticamente----------");
        listaPeliculas.sort(directorAsc);
        mostrarPeliculas();
    }
   
}
