package Service;

import Entity.Alumno;
import Entity.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import static Utilities.ComparadorVotos.votoDesc;
import java.util.Scanner;

public class SimuladorEggService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList generarNombresAleatorios(int cantidad) {
        ArrayList<String> nombresAleatorios = new ArrayList();
        String[] nombres = {"Agustin", "Italo", "Matias", "Micaela", "Romina", "Agustina", "Valeria", "Valentina", "Francisco", "Leandro", "Bautista", "Nahir", "Juan Pablo", "Morena", "Luciana", "Tomas", "Lucia", "Rocio", "Martin", "Franco"};
        String[] apellidos = {"Gonzalez", "Rodriguez", "Lorca", "Videla", "Bologna", "Gomez", "Alaniz", "Garcia", "Cano", "Perez", "Lopez", "Fernandez", "Martinez"};

        for (int i = 0; i < cantidad; i++) {

            nombresAleatorios.add(nombres[(int) (Math.random() * nombres.length - 1)] + " " + apellidos[(int) (Math.random() * apellidos.length - 1)]);
        }
        return nombresAleatorios;
    }

    public ArrayList generarDNIaleatorios(int cantidad) {
        ArrayList<Integer> listaDNI = new ArrayList();
        int num = 0;
        int alternativo = 0;
        for (int i = 0; i < cantidad; i++) {
            num = (int) (Math.random() * 35000000 + 15000000);

            if (listaDNI.contains(num)) {
                do {
                    alternativo = (int) (Math.random() * 35000000 + 15000000);
                } while (alternativo != num);
                listaDNI.add(alternativo);
            } else {
                listaDNI.add(num);
            }
        }
        return listaDNI;
    }

    public ArrayList generarAlumnos(int cantidad) {
        ArrayList<String> nombres = new ArrayList();
        ArrayList<Integer> dni = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();

        nombres = generarNombresAleatorios(cantidad);
        dni = generarDNIaleatorios(cantidad);

        for (int i = 0; i < cantidad; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nombres.get(i));
            alumno.setDNI(dni.get(i));
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public void votacion(ArrayList<Alumno> alumnos, ArrayList<Voto> votos) {

        //Generamos la lista con la cantidad de alumnos solicitado por el usuario
        System.out.println("Ingrese la cantidad de alumnos");
        int cantidad = leer.nextInt();
        if (cantidad < 10) {
            cantidad = 10;
        }
        alumnos = generarAlumnos(cantidad);

        //Con un for, iteramos toda la lista de los alumnos
        for (int i = 0; i < cantidad; i++) {
            //Por cada iteracion vamos a tener:
            //-Un nuevo objeto de voto, donde vamos a guardar el alumno y la lista de los votados
            Voto voto = new Voto();
            ArrayList<Alumno> alumnosVotados = new ArrayList();
            int contador = 0;
            //Nos aseguramos traer un alumno distinto del alumno que va a votar y distinto de uno ya votado
            do {
                int aleatorio = (int) (Math.random() * (alumnos.size() - 1));
                if (alumnos.get(i).getDNI() != alumnos.get(aleatorio).getDNI()) {
                    if (!alumnosVotados.contains(alumnos.get(aleatorio))) {
                        alumnos.get(aleatorio).setVotos(alumnos.get(aleatorio).getVotos() + 1);
                        alumnosVotados.add(alumnos.get(aleatorio));
                    }
                }
            } while (alumnosVotados.size() < 3);

            voto.setAlumno(alumnos.get(i));
            voto.setListaVotos(alumnosVotados);
            votos.add(voto);
        }

    }

    public void mostrarListaVotos(ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println(voto);
        }
    }

    public void facilitadores(ArrayList<Voto> votos) {
        ArrayList<Alumno> facilitadores = new ArrayList();
        ArrayList<Alumno> suplentes = new ArrayList();
        
        //Ordenamos la lista en forma descendente
        votos.sort(votoDesc);
        for (int i = 0; i < 10; i++) {
            if(i<5){
                facilitadores.add(votos.get(i).getAlumno());
            }else{
                suplentes.add(votos.get(i).getAlumno());
            }
        }
        System.out.println("--------Facilitadores---------");
        for (Alumno facilitador : facilitadores) {
            System.out.println(facilitador);
        }
        System.out.println("--------Facilitadores suplentes---------");
        for (Alumno suplente : suplentes) {
            System.out.println(suplente);
        }
    }
}
