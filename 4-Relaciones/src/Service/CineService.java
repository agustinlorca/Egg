package Service;

import Entity.Cine;
import Entity.Espectador;
import Entity.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class CineService {

    Scanner leer = new Scanner(System.in);
    
    //Creamos espectadores aleatoriamente
    public Espectador crearEspectador() {
        Espectador espectador = new Espectador();
        espectador.setID((int) (Math.random() * 100));
        espectador.setEdad((int) (Math.random() * 100));
        espectador.setDinero(Math.round((((Math.random() * 100) + 1) * 100) * 100.0) / 100.0);

        return espectador;
    }

    public void crearListaEspectadores(ArrayList<Espectador> espectadores) {
        int cantidad = (int) (Math.random() * 100);
        System.out.println("Hay " + cantidad + " espectadores para ver la película.");

        for (int i = 0; i < cantidad; i++) {
            espectadores.add(crearEspectador());
        }

    }

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula("Harry Potter y las reliquias de la Muerte", 2.1, 13, "J.K. Rowling");
        return pelicula;
    }

    public String[][] crearSala() {
        String sala[][] = new String[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = " ";
            }
        }
        return sala;
    }

    public Cine crearCine(Pelicula pelicula, ArrayList<Espectador> espectadores) {
        Cine cine = new Cine();
        String sala[][] = new String[8][6];
        cine.setPelicula(pelicula);

        crearListaEspectadores(espectadores);
        cine.setSala(crearSala());

        cine.setListaEspectadores(espectadores);
        cine.setPrecioEntrada(Math.round((((Math.random() * 100) + 1) * 100) * 100.0) / 100.0);

        return cine;
    }

    public void llenarSala(Cine cine) {
        String sala[][] = cine.getSala();
        boolean sentado = false;
        int fila;
        int columna;
        
        System.out.println("---------------------Egg Cines-------------------------");
        System.out.println("Película en cartelera: "+cine.getPelicula());
        System.out.println("Precio entrada: $"+cine.getPrecioEntrada());
        System.out.println("---------------------Egg Cines-------------------------");

        for (int i = 0; i < cine.getListaEspectadores().size(); i++) {

            if (cine.getListaEspectadores().get(i).getDinero() < cine.getPrecioEntrada()) {
                System.out.println("El espectador " + cine.getListaEspectadores().get(i).getID() + " no tiene el dinero suficiente para comprar la entrada.");
                continue;
            }

            if (cine.getListaEspectadores().get(i).getEdad() < cine.getPelicula().getEdad()) {
                System.out.println("El espectador " + cine.getListaEspectadores().get(i).getID() + " no tiene la edad suficiente para ver la película.");
                continue;
            }

            do {
                System.out.println("Buscando lugar para " + cine.getListaEspectadores().get(i).getID());

                //Establecemos asientos aleatorios
                fila = (int) (Math.random() * 8);
                columna = (int) (Math.random() * 6);

                if (sala[fila][columna] != "X") {
                    sala[fila][columna] = "X";
                    sentado = true;
                    System.out.println("Entrada adquirida correctamente para el espectador " + cine.getListaEspectadores().get(i).getID()+". Asiento: '"+(fila+1)+"-"+(columna+1)+"'");
                    //System.out.println("{ID: "+cine.getListaEspectadores().get(i).getID());
                } else {
                    System.out.println("El lugar " + fila + "-" + columna + " está ocupado.");
                    System.out.println("Buscando otro asiento..");
                    sentado = false;
                }

            } while (!sentado);

            cine.setSala(sala);

        }
    }

    public void mostrarSala(Cine cine) {
        System.out.println("------------ Sala ------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" [" + cine.getSala()[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
    public void mostrarEspectadores(ArrayList<Espectador> espectadores){
        
        for (Espectador espectador : espectadores) {
            System.out.println(espectador);
        }
    }
}
