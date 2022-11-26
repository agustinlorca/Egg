import java.util.Scanner;

/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */

public class Extra15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        System.out.println("Ingrese la operación a realizar");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(num1 + " + " + num2 + " es: " + suma(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " es: " + resta(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " es: " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " es: " + division(num1, num2));
                break;
        }

    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;

    }

    public static int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

}
