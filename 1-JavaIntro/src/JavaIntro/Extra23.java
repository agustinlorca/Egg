import java.util.Scanner;
import java.util.Random;
/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). */

public class Extra23 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String matriz[][] = new String[20][20];
        /* Creo matriz vacía */

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }
        /* Relleno de palabras */

        for (int x = 0; x < 5; x++) {
            System.out.println("Ingrese una palabra (minimo 3 caracteres, maximo 5)");
            String palabra = read.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("¡Error!");
                System.out.println("Debe ingresar una palabra entre 3 y 5 caracteres");
                System.out.println("Por favor, ingrese la palabra correctamente");
                palabra = read.nextLine();
            }
            int aleatorio = random(20);
            for (int i = aleatorio; i < (aleatorio + 1); i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    String letra = palabra.substring(j, j + 1);
                    matriz[i][j] = letra;
                }
            }
        }
        /* Relleno de numeros */
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int aleatorio = random(9);
                if (matriz[i][j].equals(" ")) {
                    matriz[i][j] = Integer.toString(aleatorio);
                }
            }
        }
        /* Muestro sopa de letras */
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

    }

    public static int random(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }
}
