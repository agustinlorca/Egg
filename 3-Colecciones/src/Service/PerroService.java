
package Service;

import Entity.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class PerroService {
    
    private Scanner leer = new Scanner(System.in);
    private ArrayList<String> perros;
    
    public PerroService(){
       this.perros = new ArrayList(); 
    }
    
    public Perro crearPerro(){
        Perro p = new Perro();
        
        System.out.println("Ingrese una raza de perro");
        p.setRaza(leer.next());
                
        return p;
    }
    public void llenarLista(){
        Perro p;
        String respuesta = "";
        
        do {
            p = crearPerro();
            perros.add(p.getRaza());
            System.out.println("¿Quiere agregar otro perro (S/N)");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("S"));

    }
    public void mostrarLista(){
        System.out.println("Los perros actuales son");
        for (String aux : perros) {
            System.out.println(aux.toString());
        }
    } 
    public void eliminarPerro(){
        String razaEliminada;
        boolean eliminado = false;
        
        Iterator<String> it = perros.iterator();
        System.out.println("Ingrese la raza de perro que desea eliminar");
        razaEliminada = leer.next();
        
        while (it.hasNext()){
            if(it.next().equals(razaEliminada)) {
        
                it.remove();
                eliminado = true;
            }
        }
        if (eliminado){
            System.out.println("El perro de raza '"+razaEliminada+"' fue eliminado.");
        } else System.out.println("La raza '"+razaEliminada+"' no existe en la lista.");
    }
}
