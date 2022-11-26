import java.util.Scanner;

/* Realizar un programa que solo permita introducir frases de 8 de largo. Si el
usuario ingresa una frase de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java. */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String frase = null;
        do {
            System.out.println("Ingrese una frase de 8 caracteres");
            frase = read.nextLine();
            if (frase.length() == 8) {
                System.out.println("CORRECTO");
            }

        } while (frase.length() == 8);

        System.out.println("INCORRECTO");
    }
}
