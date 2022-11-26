import java.util.Scanner;

/* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos). */

public class Extra19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = read.nextInt();
        int vector1[] = new int[N];
        int vector2[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor para vector1[" + i + "]");
            vector1[i] = read.nextInt();

        }
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor para vector2[" + i + "]");
            vector2[i] = read.nextInt();

        }
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores son distintos");
                break;
            } else {
                contador++;
            }

        }
        if (contador == N) {
            System.out.println("Los vectores son iguales");
        }
    }

}
