
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;


public class CancionServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){
        Cancion c = new Cancion();
        System.out.println("Introduzca el nombre de la cancion");
        c.setTitulo(leer.next());
        System.out.println("Introduzca el autor de la cancion '"+c.getTitulo()+"'");
        c.setAutor(leer.next());
        
        return c;
    }
}
