import java.util.Scanner;

/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */

public class Extra3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una letra");
        String letra = read.nextLine().toLowerCase();
        while (letra.length() > 1) {
            System.out.println("¡Error! Usted ingresó más de 1 caracter.");
            System.out.println("Ingrese una letra");
            letra = read.nextLine().toLowerCase();
        }
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {

            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }
    }

}
