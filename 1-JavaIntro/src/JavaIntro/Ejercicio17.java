import java.util.Scanner;
import java.util.Random;
/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = read.nextInt();
        String[] vector = new String[N];

        for (int i = 0; i < N; i++) {
            int num = aleatorio(100000);
            vector[i] = String.valueOf(num);
        }
        /*
         * for (int i = 0; i < N; i++) {
         * System.out.print("[" + vector[i] + "]");
         * System.out.println("");
         * }
         */
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i].length() == 1) {
                cont1++;
            } else if (vector[i].length() == 2) {
                cont2++;
            } else if (vector[i].length() == 3) {
                cont3++;
            } else if (vector[i].length() == 4) {
                cont4++;
            } else {
                cont5++;
            }
        }

        System.out.println("Hay " + cont1 + " numeros de 1 dígito");
        System.out.println("Hay " + cont2 + " numeros de 2 dígito");
        System.out.println("Hay " + cont3 + " numeros de 3 dígito");
        System.out.println("Hay " + cont4 + " numeros de 4 dígito");
        System.out.println("Hay " + cont5 + " numeros de 5 dígito");

    }

    public static int aleatorio(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

}
