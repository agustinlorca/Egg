import java.util.Scanner;

/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().  */

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
        int doble = 2 * numero;
        int triple = 3 * numero;
        double raiz = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);

    }
}
