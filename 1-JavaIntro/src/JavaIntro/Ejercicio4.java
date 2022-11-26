import java.util.Scanner;

/* Dada una cantidad de grados celsius se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).  */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una cantidad en grados celsius");
        int gradosC = read.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);

        System.out.println(gradosC + "°C (grados Celsius), equivalen a: " + gradosF + "°F (grados Fahrenheit)");

    }

}
