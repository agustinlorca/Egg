import java.util.Scanner;
import java.util.Random;
/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */

public class Extra10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean acierto = false;
        int num1, num2, multiplicacion;
        num1 = aleatorio(10);
        num2 = aleatorio(10);
        while (acierto != true) {
            multiplicacion = num1 * num2;
            System.out
                    .println("Intente adivinar el resultado de la multiplicación de 2 numeros aleatorios entre 0 y 10");
            int num = read.nextInt();
            if (num == multiplicacion) {
                acierto = true;
            }
        }
        System.out.println("¡Adivinaste! La multiplicación era entre " + num1 + " y " + num2);
    }

    public static int aleatorio(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

}
