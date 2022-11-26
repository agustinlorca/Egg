import java.util.Scanner;
import java.util.Random;
/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.  */

public class Extra20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int N = read.nextInt();
        int vector[] = new int[N];
        rellenar(vector, N);
        mostrar(vector, N);
    }

    public static void rellenar(int vector[], int N) {
        for (int i = 0; i < N; i++) {
            vector[i] = aleatorio(1000);
        }
    }

    public static void mostrar(int vector[], int N) {
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
