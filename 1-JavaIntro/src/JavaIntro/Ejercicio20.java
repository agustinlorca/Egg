import java.util.Scanner;

/*  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.  */

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la fila " + i + ", columna " + j);
                int num = read.nextInt();
                matriz[i][j] = num;
            }
        }
        /* Escribo matriz */
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        /* Compruebo si es mágica o no */
        if (sumaFilasyColumnas(matriz) == true && sumaDiagonales(matriz) == true) {
            System.out.println("La matriz es mágica");

        } else {
            System.out.println("La matriz no es mágica");
        }
    }

    /* Comprobacion de filas y columnas */
    public static boolean sumaFilasyColumnas(int matriz[][]) {
        int cont = 0, sumaFila = 0, sumaColumna = 0;
        boolean sumaFyC = false;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila == sumaColumna) {
                cont++;
            }

        }
        if (cont == 3) {
            sumaFyC = true;
        }
        return sumaFyC;
    }

    /* Comprobacion de diagonales */
    public static boolean sumaDiagonales(int matriz[][]) {
        int sumaDiagPrinc = 0, sumaDiagSec = 0, cont = 0;
        boolean sumaDiagonales = false;
        for (int i = 0; i < 3; i++) {
            sumaDiagPrinc += matriz[i][i];
        }
        for (int i = 2; i >= 0; i--) {
            sumaDiagSec += matriz[i][cont];
            cont++;
        }
        if (sumaDiagPrinc == sumaDiagSec) {
            sumaDiagonales = true;
        }
        return sumaDiagonales;
    }

}
