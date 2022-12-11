package Service;

import Entity.Juego;
import Entity.Jugador;
import Entity.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class RuletaService {

    private Scanner leer = new Scanner(System.in);

    /*llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.*/
    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionActual((int) (Math.random() * 6) + 1);
        r.setPosicionAgua((int) (Math.random() * 6) + 1);
        //System.out.println("Posicion actual: "+r.getPosicionActual());
        //System.out.println("Posicion del chorro de agua: "+r.getPosicionAgua());
        return r;
    }

    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(Revolver r) {

        if (r.getPosicionActual() == r.getPosicionAgua()) {
            return true;
        }
        return false;
    }

    //siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(Revolver r) {
        if (r.getPosicionActual() == 6) {
            r.setPosicionActual(1);

        } else {
            r.setPosicionActual(r.getPosicionActual() + 1);
        }

    }

    /*disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    devuelve true, sino false.*/
    public boolean disparo(Jugador jugador, Revolver r) {

        if (mojar(r) == true) {
            jugador.setMojado(true);
            return true;
        } else {

            jugador.setMojado(false);
            siguienteChorro(r);
            return false;
        }

    }

    public Jugador crearJugador(Integer id) {
        Jugador j = new Jugador();
        j.setId(id);
        j.setNombre("Jugador " + id);

        return j;
    }
    
    /*llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
    y el revolver para guardarlos en los atributos del juego.*/
    public Juego llenarJuego(ArrayList<Jugador> listaJugadores, Revolver r) {

        Juego juego = new Juego();

        System.out.println("Ingrese la cantidad de jugadores (1 a 6)");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            listaJugadores.add(crearJugador(i + 1));
        }

        juego.setJugadores(listaJugadores);
        juego.setRevolver(r);

        return juego;

    }
    
    /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
    aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
    moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
    mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda(Juego juego) {

        int contador = 0;
        boolean disparo;
        System.out.println("-------Posición inicial del tambor: " + juego.getRevolver().getPosicionActual() + " ----------");
        do {

            System.out.println("Turno " + juego.getJugadores().get(contador).getNombre());
            System.out.println("Comienza su disparo..");
            disparo = disparo(juego.getJugadores().get(contador), juego.getRevolver());
            if (!disparo) {
                System.out.println("El " + juego.getJugadores().get(contador).getNombre() + " no recibe disparo de agua.");
                System.out.println("-------------El tambor gira a la posición: " + juego.getRevolver().getPosicionActual() + "-----------");
                contador += 1;

            }

            if (contador == juego.getJugadores().size()) {
                contador = 0;
            }

        } while (!disparo);
        System.out.println("El " + juego.getJugadores().get(contador).getNombre() + " acaba de recibir un disparo de agua.");
        System.out.println(juego.getJugadores().get(contador).getNombre() + " pierde el juego.");

    }

}
