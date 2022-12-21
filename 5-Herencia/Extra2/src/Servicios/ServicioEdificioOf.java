package Servicios;

import Entidades.EdificioDeOficinas;
import java.util.Scanner;

public class ServicioEdificioOf {

    private Scanner leer = new Scanner(System.in);

    public EdificioDeOficinas crearEdificioOf() {
        //Medidas estandares 
        
        double ancho = (Math.random()*25) + 20; //Aleatorio entre 20 y 25
        double altto = (Math.random()*19) + 17; //Aleatorio entre 17 y 19
        double largo = (Math.random()*16) + 13; //Aleatorio entre 13 y 16

        System.out.println("Ingrese cuantas personas entran en una oficina");
        int personas = leer.nextInt();

        System.out.println("Ingrese cuantas oficinas hay en el edificio");
        int oficinas = leer.nextInt();

        System.out.println("Ingrese la cantidad de pisos que hay en el edficio");
        int pisos = leer.nextInt();

        return new EdificioDeOficinas(oficinas, personas, pisos, ancho, altto, largo);

    }
    
    public void cantPersonas(EdificioDeOficinas edOf){
        //Suponiendo que por piso hay una oficina segun enunciado
        //Las personas que entrarían en un piso es:
        int personasPiso = edOf.getPersonas();
        System.out.println("Cantidad de personas por piso: "+personasPiso);
        
        //Personas en todo el edificio
        int personasEdificio = personasPiso*edOf.getPisos();
        System.out.println("Cantidad de personas en todo el edificio: "+personasEdificio);
        
    }
}
