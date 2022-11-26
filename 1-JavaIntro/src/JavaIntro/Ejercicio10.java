
import java.util.Scanner;



/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int limite = read.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            int numero = read.nextInt();
            suma = suma + numero;

        } while (suma <= limite);
    }

}
