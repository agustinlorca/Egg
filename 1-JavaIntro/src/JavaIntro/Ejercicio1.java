import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + suma);
    }
}
