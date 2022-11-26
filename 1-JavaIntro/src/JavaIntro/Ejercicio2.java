import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String name = read.nextLine();
    }
}
