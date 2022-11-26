
package Utilities;

import Entity.Pelicula;
import java.util.Comparator;


public class ComparadorPelicula {
 
    public static Comparator<Pelicula> duracionDesc = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }  
    };
    public static Comparator<Pelicula> duracionAsc = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }  
    };
    public static Comparator<Pelicula> tituloAsc = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }  
    };
    public static Comparator<Pelicula> directorAsc = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }  
    };
    
    
}
