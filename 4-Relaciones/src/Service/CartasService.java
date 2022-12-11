package Service;

import Entity.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CartasService {

    private Scanner leer = new Scanner(System.in);

    public Carta crearCarta(int numero, String palo) {

        Carta carta = new Carta(numero, palo);
        return carta;
    }

    public void armarMazo(ArrayList<Carta> mazo) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String palo[] = {"Espada", "Basto", "Oro", "Copa"};

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                mazo.add(crearCarta(numeros[j], palo[i]));
            }
        }
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(ArrayList<Carta> mazo) {
        Collections.shuffle(mazo);

    }

    /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    se haya llegado al final, se indica al usuario que no hay más cartas.*/
    public Carta siguienteCarta(ArrayList<Carta> mazo, ArrayList<Carta> monton) {
        Carta sigCarta = new Carta();
        Iterator iterator = mazo.iterator();

        sigCarta = (Carta) iterator.next();
        monton.add(sigCarta);
        iterator.remove();

        return sigCarta;
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(ArrayList<Carta> mazo) {
        return mazo.size();

    }

    /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    debemos indicárselo al usuario.*/
    public void darCartas(ArrayList<Carta> mazo, ArrayList<Carta> cartasPedidas, ArrayList<Carta> monton) {
        Iterator iterator = mazo.iterator();

        System.out.println("Ingrese la cantidad de cartas que quiere");
        int cantidad = leer.nextInt();
        if (mazo.size() < cantidad) {
            System.out.println("La cantidad ingresada superan a la cantidad de cartas disponibles");
            System.out.println("Para ver la cantidad disponible, vaya a la opción '3");
        } else {
            for (int i = 0; i < cantidad; i++) {
                cartasPedidas.add(siguienteCarta(mazo, monton));

            }

        }

        System.out.println("-----Se repartieron " + cantidad + " cartas-----");

    }
    
    /*cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    indicárselo al usuario*/
    public void cartasMonton(ArrayList<Carta> mazo, ArrayList<Carta> monton) {
        Iterator iterator = monton.iterator();

        if (iterator.hasNext()) {
            System.out.println("-----Las cartas que ya han salido son-----");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        } else {
            System.out.println("Aún no ha salido ninguna carta.");
        }
    }

    /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja(ArrayList<Carta> mazo) {
        System.out.println("-----Cartas restantes en el mazo-----");
        System.out.println(mazo);
    }

    public void juego(ArrayList<Carta> mazo, ArrayList<Carta> cartasPedidas, ArrayList<Carta> monton) {
        int opcion;
        System.out.println("Armando mazo...");
        armarMazo(mazo);
        System.out.println("Mezclando cartas...");
        barajar(mazo);

        do {
            System.out.println("----------MENU-----------");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente carta");
            System.out.println("3- Mostrar la cantidad de cartas disponibles en el mazo");
            System.out.println("4- Dar cartas");
            System.out.println("5- Mostrar las cartas que han salido");
            System.out.println("6- Mostrar cartas disponibles en el mazo");
            System.out.println("7- Reiniciar");
            System.out.println("8- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    barajar(mazo);
                    break;
                case 2:

                    if (cartasDisponibles(mazo) >= 1) {

                        System.out.println(siguienteCarta(mazo, monton));
                    } else {
                        System.out.println("No quedan cartas en el mazo.");
                    }
                    break;
                case 3:

                    System.out.println("Quedan " + cartasDisponibles(mazo) + " cartas en el mazo.");
                    break;
                case 4:
                    darCartas(mazo, cartasPedidas, monton);
                    break;
                case 5:
                    cartasMonton(mazo, monton);
                    break;
                case 6:
                    mostrarBaraja(mazo);
                    break;
                case 7:
                    System.out.println("Reiniciando juego...");
                    mazo.clear();
                    monton.clear();
                    System.out.println("Armando mazo...");
                    armarMazo(mazo);
                    System.out.println("Mezclando cartas...");
                    barajar(mazo);
                    break;
                case 8:
                    opcion = 8;
                    break;
                default:
                    System.out.println("El numero ingresado no corresponde a ninguna opción.");
                    System.out.println("Por favor ingrese una opcion correcta.");
                    break;

            }

        } while (opcion != 8);
        System.out.println("Saliste del juego.");
    }
}
