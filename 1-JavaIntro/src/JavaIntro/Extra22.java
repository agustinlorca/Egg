import java.util.Scanner;
import java.util.Random;
/* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos. */

public class Extra22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas para la matriz");
        int N = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas para la matriz");
        int M = read.nextInt();
        int matriz[][] = new int[N][M];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = aleatorio(100);
                suma += matriz[i][j];
            }
        }
        /* Escribo matriz */
        System.out.println("Matriz");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }

    public static int aleatorio(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }
}
