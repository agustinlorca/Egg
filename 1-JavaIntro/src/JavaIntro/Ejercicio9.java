import java.util.Scanner;

/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java. */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase con 'A' al comienzo");
        String frase = read.nextLine();
        String primerLetra = frase.substring(0, 1);

        System.out.println(primerLetra);
        if (primerLetra.equals("A")) {

            System.out.println("CORRECTO");

        } else {

            System.out.println("INCORRECTO");
        }
    }

}
