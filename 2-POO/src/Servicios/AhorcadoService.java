package Servicios;

import Entity.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        Ahorcado ah = new Ahorcado();

        System.out.println("Ingrese la palabra a buscar");
        String palabraSecreta = leer.next();

        String vPalabraSecreta[] = new String[palabraSecreta.length()];

        for (int i = 0; i < vPalabraSecreta.length; i++) {
            vPalabraSecreta[i] = palabraSecreta.substring(i, i + 1);

        }
        ah.setPalabraBuscar(vPalabraSecreta);

        System.out.println("Ingrese la cantidad máxima de intentos");
        ah.setMaximosIntentos(leer.nextInt());

        return ah;
    }

    public void longitud(Ahorcado ah) {
        System.out.println("Longitud de la palabra: " + ah.getPalabraBuscar().length);
    }

    public void buscar(Ahorcado ah, String letra) {
        for (int i = 0; i < ah.getPalabraBuscar().length; i++) {
            if (ah.getPalabraBuscar()[i].equalsIgnoreCase(letra)) {
                System.out.println("¡Muy bien! La letra '" + letra.toUpperCase() + "' pertenece a la palabra");
                return;
            }
        }
        System.out.println("¡Ups! La letra '" + letra.toUpperCase() + "' no pertenece a la palabra");
    }

    public boolean encontradas(Ahorcado ah, String letra) {
        int contador = 0;
        boolean bool;
        for (int i = 0; i < ah.getPalabraBuscar().length; i++) {
            if (ah.getPalabraBuscar()[i].equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        
        if (contador > 0) {
            ah.setLetrasEncontradas(contador);
            bool = true;
        } else {
            bool = false;
        }
        int letrasFaltantes = ah.getPalabraBuscar().length-ah.getLetrasEncontradas();
        System.out.println("Cantidad de letras (encontradas/faltantes): ("+ah.getLetrasEncontradas()+","+ letrasFaltantes+")");
        return bool;
    }

    public void intentos(Ahorcado ah) {
        System.out.println("Intentos restantes: " + ah.getMaximosIntentos());
    }

    public void juego() {
        Ahorcado ah = crearJuego();
        String palabra = "";
        String vPalabrasEncont[] = new String [ah.getPalabraBuscar().length];
        int contador = 0;
        do {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            longitud(ah);
            buscar(ah, letra);
            
            if (encontradas(ah, letra) == false ){
                ah.setMaximosIntentos(ah.getMaximosIntentos()-1);
            } else {
                for (int i = 0; i <vPalabrasEncont.length ; i++) {
                    if (letra.equals(vPalabrasEncont[i])){
                        System.out.println("La letra "+letra.toUpperCase()+" ya fue ingresada.");
                        break;
                    }
                }
                contador++;
                vPalabrasEncont[contador]=letra;
            }
            intentos(ah);
        } while (ah.getMaximosIntentos() > 0 && ah.getLetrasEncontradas() < ah.getPalabraBuscar().length);
        
        if (ah.getMaximosIntentos() == 0) {
            System.out.println("Lo sentimos, no hay mas intentos.");
        } else {
            for (int i = 0; i < ah.getPalabraBuscar().length; i++) {
                palabra += ah.getPalabraBuscar()[i];
            }
            System.out.println("¡Lo lograste! La palabra completa era: "+palabra.toUpperCase());
        }
    }
}
