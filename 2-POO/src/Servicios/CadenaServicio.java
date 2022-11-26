package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }

    public void mostrarVocales(Cadena c1) {
        int contador = 0;
        String letra = c1.getFrase().toLowerCase();
        for (int i = 0; i < c1.getLongitud(); i++) {

            if (letra.charAt(i) == 'a' || letra.charAt(i) == 'e' || letra.charAt(i) == 'i' || letra.charAt(i) == 'o' || letra.charAt(i) == 'u') {
                contador++;
            }
        }

        System.out.println("La frase tiene " + contador + " vocales");

    }

    public void invertirFrase(Cadena c1) {
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            String letra = c1.getFrase().toLowerCase();
            System.out.print(letra.charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c1) {
        int contador = 0;
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        String letraFrase = c1.getFrase().toLowerCase();

        for (int i = 0; i < c1.getLongitud(); i++) {

            if (letraFrase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");

    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.next();
        int long2 = frase2.length();

        if (c1.getLongitud() > long2) {

            System.out.println("La primer frase tiene " + (c1.getLongitud() - long2) + " caracteres más que la frase 2.");

        } else if (c1.getLongitud() == long2) {
            System.out.println("Ambas frases tienen la misma cantidad de caracteres");
        } else {
            System.out.println("La segunda frase tiene " + (long2 - c1.getLongitud()) + " caracteres más que la frase 1.");
        }
    }

    public void unirFrases(Cadena c1) {
        System.out.println("Ingrese una frase");
        String frase3 = leer.next();
        System.out.println(c1.getFrase() + frase3);
    }

    public void reemplazar(Cadena c1) {
        String reemplazar = c1.getFrase().replace("a","@");
        System.out.println(reemplazar);
    }
    public boolean contiene(Cadena c1){
        boolean retorno = false;
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        String letraFrase = c1.getFrase().toLowerCase();
        for (int i = 0; i < c1.getLongitud(); i++) {

            if (letraFrase.charAt(i) == letra.charAt(0)) {
               retorno = true;
            } else {
                retorno = false;
            }
        }
        return retorno;
    }

}
