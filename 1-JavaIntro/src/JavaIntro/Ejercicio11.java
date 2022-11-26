import java.util.Scanner;

/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
*/

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int opcion;
        String respuesta = "";

        do {

            System.out
                    .println("A continuación indique las operaciones que desea realizar entre los numeros ingresados");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + suma);
                    break;
                case 2:
                    int resta = num2 - num1;
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
                    break;
                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + multiplicar);
                    break;
                case 4:
                    double dividir = num2 / num1;
                    System.out.println("La división entre " + num1 + " y " + num2 + " es: " + dividir);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = read.next();
                    break;
                default:
                    System.out.println("El valor ingresado no es válido para una opción");
                    break;

            }

        } while (!respuesta.equals("S"));

    }

}
