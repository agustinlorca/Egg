
package ejerciciospoo;

import Entidades.PersonaEj12;
import Servicios.PersonaServicioEj12;
import java.util.Scanner;


/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/

public class Ejercicio12 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicioEj12 ps = new PersonaServicioEj12();
        PersonaEj12 p1 = ps.crearPersona();
        PersonaEj12 p2 =  ps.crearPersona();
        int edadp1 =  ps.calcularEdad(p1);
        int edadp2 = ps.calcularEdad(p2);
        
        //System.out.println("La edad de "+p1.getNonmbre()+" es "+edadp1+" años.");
        boolean menorQue = ps.menorQue(edadp1,edadp2);
        if (menorQue == true) {
            System.out.println(p1.getNonmbre()+" es menor que "+p2.getNonmbre());
            
        } else {
            System.out.println(p1.getNonmbre()+" es mayor que "+p2.getNonmbre());
        }
        System.out.println("------------------------");
        //Mostrar persona 2
        ps.mostrarPersona(p2);
    }
    
}
