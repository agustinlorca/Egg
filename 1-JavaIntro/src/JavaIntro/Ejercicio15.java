import java.util.Scanner;

/* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector = new int[100];

        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        for (int i = 99; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
            System.out.println("");
        }

    }

}
