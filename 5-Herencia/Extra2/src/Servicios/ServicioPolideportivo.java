package Servicios;

import Entidades.Polideportivo;
import java.util.Scanner;

public class ServicioPolideportivo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo crearPoli() {
        //Medidas estandares 
        double ancho = (Math.random()*35) + 30; //Aleatorio entre 30 y 36
        double alto = (Math.random()*8) + 5; //Aleatorio entre 5 y 8
        double largo = (Math.random()*35) + 40; //Aleatorio entre 40 y 45
        String tipoInstalacion = "";
        
        System.out.println("Ingrese el nombre del Polideportivo");
        String nombre = leer.next();
        
        System.out.println("Ingrese el tipo de instalación");
        System.out.println("1- Techado");
        System.out.println("2- Abierto");
        int opcion = leer.nextInt();
        
        if (opcion == 1){
            tipoInstalacion = "Techado";
        } else {
            //Sino es techado, dejamos por default 'Abierto'
            tipoInstalacion = "Abierto";
        }
     
        return new Polideportivo(nombre, tipoInstalacion, ancho, alto, largo);
    }
}
