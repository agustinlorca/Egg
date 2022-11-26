import java.util.Scanner;

/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. */

public class Extra18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = read.nextInt();
        int vector[] = new int[N];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el valor para vector[" + i + "]");
            vector[i] = read.nextInt();
            suma += vector[i];

        }
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }

}
