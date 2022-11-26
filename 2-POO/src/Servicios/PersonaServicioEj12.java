
package Servicios;

import Entidades.PersonaEj12;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicioEj12 {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public PersonaEj12 crearPersona(){
        PersonaEj12 p = new PersonaEj12();
        System.out.println("Ingrese su nombre");
        p.setNonmbre(leer.next());
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento");
        int anio = leer.nextInt();
        p.setFechaNacimiento(new Date(anio - 1900, mes - 1, dia));
        return p;
    }
    
    public int calcularEdad(PersonaEj12 p){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();
        return edad;
    }
    
    public boolean menorQue(int edadP1,int edadP2){
       
        if (edadP1< edadP2){
            return true;
        } else {
            return false;
        }
        
    }
    public void mostrarPersona(PersonaEj12 p){
        System.out.println("Nombre: "+p.getNonmbre());
        System.out.println("Fecha de nacimiento: "+ p.getFechaNacimiento());
        System.out.println("Edad: "+ calcularEdad(p));
    }
}
