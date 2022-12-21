package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import java.util.Scanner;

public class ServicioFacultad {
    
    private Scanner leer = new Scanner(System.in);

    //Meotodo que cambia el estado civil de una persona
    public void cambioEstadoCivil(Persona p) {
        System.out.println("Ingrese el nuevo estado civil para " + p.getApellido() + ", " + p.getNombre());
        p.setEstadoCivil(leer.next());
    }

    //Metodo que reasigna un nuevo despacho a un empleado
    public void reasignarDespacho(Empleado e) {
        
        System.out.println("Ingrese el nuevo N° de despacho para " + e.getApellido() + ", " + e.getNombre());
        e.setDespacho(leer.nextInt());
    }

    //Metodo que matricula a un estudiante en un nuevo curso
    public void matricularEstudiante(Estudiante e) {
        
        System.out.println("Ingrese el nuevo curso para el estudiante " + e.getApellido() + ", " + e.getNombre());
        e.setCurso(leer.next());
    }
    
    //Metodo que realiza el cambio de departamento a un profesor
    public void cambioDepartamento(Profesor p) {
        
        System.out.println("Ingrese el nuevo departamento para el profesor " + p.getApellido() + ", " + p.getNombre());
        p.setDepartamento(leer.next());
    }
    
    //Metodo que traslada de seccion a un empleado del personal de servicio
    public void trasladoSeccion(PersonalServicio ps){
        System.out.println("Ingrese a que seccion desea trasladar al empleado del personal de servicio "+ ps.getApellido() + ", " + ps.getNombre());
        ps.setSeccion(leer.next());
    }
}
