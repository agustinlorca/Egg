import java.util.Scanner;

/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. */

public class Ejercicio7 {
    public static boolean FraseEureka(String frase) {

        return frase.equals("eureka");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        if (FraseEureka(frase)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
