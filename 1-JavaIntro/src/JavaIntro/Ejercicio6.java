import java.util.Scanner;

/* Crear un programa que dado un numero determine si es par o impar.  */

public class Ejercicio6 {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;

    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();

        if (esPar(numero)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

}
