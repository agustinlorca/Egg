package Service;

import Entity.Pais;
import static Utilities.ComparadorPais.paisesAsc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<Pais> conjuntoPaises = new HashSet();
    
    public Pais crearPais(){
        Pais p = new Pais();
        
        System.out.println("Ingrese un pais");
        p.setPais(leer.next());
        return p;
        
    }
    
    public void llenarConjunto(){
        String respuesta = "S";
        
        do{
            conjuntoPaises.add(crearPais());
            System.out.println("¿Desea agregar otro pais?");
            respuesta = leer.next();
        }while(respuesta.equalsIgnoreCase("S"));
    }
    
    public void mostrarConjAsc(){
        
        ArrayList<Pais> listaPaises = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaises, paisesAsc);
        
        System.out.println("------Listado de Paises------");
        for (Pais aux : listaPaises) {
            System.out.println(aux.toString());
        }
        
    }
    
    public void eliminarPais(){
        String paisEliminado;
        Boolean eliminado = false;
        
        Iterator<Pais> it = conjuntoPaises.iterator();
        System.out.println("Ingrese el país que desea eliminar");
        paisEliminado = leer.next();
        
        while(it.hasNext()){
            if (it.next().getPais().equalsIgnoreCase(paisEliminado)){
                eliminado = true;
                it.remove();
            }
        }
        if(eliminado){
            System.out.println("El pais '"+paisEliminado+"' fue eliminado.");
            mostrarConjAsc();
        } else System.out.println("El país que ingresó no existe.");
    }
}
