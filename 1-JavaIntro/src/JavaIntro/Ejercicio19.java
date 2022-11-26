import java.util.Scanner;

/* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). */

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz A");
        int N = read.nextInt();
        int matrizA[][] = new int[N][N];
        int matrizAT[][] = new int[N][N];
        /* Matriz A */
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ", columna " + j);
                int num = read.nextInt();
                matrizA[i][j] = num;
            }
        }

        /* Matriz -AT (TRANSPUESTA NEGATIVA) */

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                matrizAT[i][j] = -matrizA[i][j];
            }
        }

        /* Compruebo matriz antisimétrica */
        int contador = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (-matrizA[i][j] == matrizAT[i][j]) {
                    contador++;
                }
            }
        }
        if (contador == N * N) {
            System.out.println("La matriz A es anti-simétrica, ya que A = -AT");
        } else {
            System.out.println("La matriz A no es anti-simétrica, ya que A ≠ -AT");
        }
        /* Escribo matriz A */
        System.out.println("Matriz A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
        /* Escribo matriz -AT */

        System.out.println("Matriz -AT");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
