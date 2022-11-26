import java.util.Scanner;
import java.util.Random;
/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero */

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = read.nextInt();
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = aleatorio(10);
        }
        System.out.println("Indique un numero a buscar en el vector");
        int num = read.nextInt();
        int contador = 0;

        for (int i = 0; i < N; i++) {
            if (vector[i] == num) {
                System.out.println("El número que indicó se encuentra en la posición: " + i + " del vector.");
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("El número que indicó no se encuentra en el vector.");
        }

        for (int i = 0; i < N; i++) {
            System.out.print("[" + vector[i] + "]");
            System.out.println("");
        }
    }

    public static int aleatorio(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

}
