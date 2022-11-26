
package Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoService {
    private Scanner leer= new Scanner(System.in);
    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    
    public Alumno crearAlumno(){
        Alumno a = new Alumno();
        ArrayList<Integer> listaNotas = new ArrayList();
        
        System.out.println("Ingrese el nombre del alumno");
        a.setNombre(leer.next());
        System.out.println("Ingrese la nota 1");
        listaNotas.add(leer.nextInt());
        System.out.println("Ingrese la nota 2");
        listaNotas.add(leer.nextInt());
        System.out.println("Ingrese la nota 3");
        listaNotas.add(leer.nextInt());
        a.setNotas(listaNotas);
        return a;
    }
    
    public void llenarListaAlumnos(){
        
        String respuesta = "S";
        
        do {
            listaAlumnos.add(crearAlumno());
            System.out.println("¿Desea agregar otro alumno? (S/N)");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("S"));
        
        System.out.println(listaAlumnos.toString());
    }
    
    
    public boolean comprobarAlumno(String alumno){
        
        Integer aux = 0;
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(alumno)){
                aux = 1;
            }
        }
        
        if (aux == 1){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void notaFinal(String alumno){
        
        Integer notaTotal = 0;
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equalsIgnoreCase(alumno)){
                for (int j = 0; j < listaAlumnos.get(i).getNotas().size(); j++) {
                    notaTotal += listaAlumnos.get(i).getNotas().get(j);
                }  
            }
        }
        System.out.println("La nota final del alumno '"+alumno+"' es: "+notaTotal/3);
        
    }
}
