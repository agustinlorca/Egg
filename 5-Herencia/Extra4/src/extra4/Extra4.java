package extra4;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import Servicios.ServicioFacultad;
import java.util.ArrayList;
import java.util.Scanner;

/*Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:

• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).

El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:

• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioFacultad sf = new ServicioFacultad();

        ArrayList<Persona> personas = new ArrayList();

        //Creamos distintos objetos y lo agregamos al ArrayList de personas
        personas.add(new Estudiante("Agustin", "Lorca", 40596443, "Soltero/a", "6°B"));
        personas.add(new Estudiante("Franco", "Gonzalez", 40725565, "Soltero/a", "5°B"));

        personas.add(new Profesor("Fabian", "Negri", 18444222, "Casado/a", 2012, 1413514, "Matematicas"));
        personas.add(new Profesor("Teresa", "Ranzuglia", 17555222, "Casado/a", 2008, 311661, "Quimica"));

        personas.add(new PersonalServicio("Graciela", "Lopez", 19777222, "Soltero/a", 2010, 151616, "Bibilioteca"));
        personas.add(new PersonalServicio("Jonathan", "Garcia", 26888999, "Soltero/a", 2017, 13216415, "Baños"));

        int opcion = 0;
        do {
            int dni = 0;
            boolean existe = false;

            System.out.println("");
            System.out.println("-----------Sistema Gestión Facultad--------------");
            System.out.println("1- Cambio del estado civil de una persona");
            System.out.println("2- Reasignación de despacho a un empleado");
            System.out.println("3- Matriculación de un estudiante en un nuevo curso");
            System.out.println("4- Cambio de departamento de un profesor");
            System.out.println("5- Traslado de sección de un empleado del personal de servicio");
            System.out.println("6- Imprimir estudiantes");
            System.out.println("7- Imprimir profesores");
            System.out.println("8- Imprimir personal de servicio");
            System.out.println("9- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("A continuación se va a realizar el cambio de estado civil.");
                    System.out.println("Ingrese el DNI de la persona");
                    dni = leer.nextInt();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni() == dni) {
                            sf.cambioEstadoCivil(personas.get(i));
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("El dni '" + dni + "' no corresponde a ninguna persona en nuestra base de datos.");
                    }
                    break;
                case 2:
                    System.out.println("A continuación se va a reasignar de despacho a un empleado");
                    System.out.println("Ingrese el DNI de la persona");
                    dni = leer.nextInt();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni() == dni) {
                            sf.reasignarDespacho((Empleado) personas.get(i));
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("El dni '" + dni + "' no corresponde a ninguna persona en nuestra base de datos.");
                    }
                    break;
                case 3:
                    System.out.println("A continuación va a matricular a un alumno en un nuevo curso.");
                    System.out.println("Ingrese el DNI del estudiante");
                    dni = leer.nextInt();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni() == dni) {
                            sf.matricularEstudiante((Estudiante) personas.get(i));
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("El dni '" + dni + "' no corresponde a ninguna persona en nuestra base de datos.");
                    }
                    break;
                case 4:
                    System.out.println("A continuación va a realizar el cambio de departamento para un profesor.");
                    System.out.println("Ingrese el DNI del profesor");
                    dni = leer.nextInt();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni() == dni) {
                            sf.cambioDepartamento((Profesor) personas.get(i));
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("El dni '" + dni + "' no corresponde a ninguna persona en nuestra base de datos.");
                    }
                    break;
                case 5:
                    System.out.println("A continuación va a realizar el traslado de seccion para un empleado del personal de servicio.");
                    System.out.println("Ingrese el DNI del empleado");
                    dni = leer.nextInt();
                    for (int i = 0; i < personas.size(); i++) {
                        if (personas.get(i).getDni() == dni) {
                            sf.trasladoSeccion((PersonalServicio) personas.get(i) );
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("El dni '" + dni + "' no corresponde a ninguna persona en nuestra base de datos.");
                    }
                    break;
                case 6:
                    System.out.println("------------------------Estudiantes--------------------------");
                    for (Persona persona : personas) {
                        if (persona instanceof Estudiante) {
                            System.out.println(persona.toString());
                        }
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("------------------------Profesores--------------------------");
                    for (Persona persona : personas) {
                        if (persona instanceof Profesor) {
                            System.out.println(persona.toString());
                        }
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("------------------------Personal de Servicio--------------------------");
                    for (Persona persona : personas) {
                        if (persona instanceof PersonalServicio) {
                            System.out.println(persona.toString());
                        }
                    }
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("¡Opción inválida!");
                    break;
            }

        } while (opcion != 9);

    }
}
