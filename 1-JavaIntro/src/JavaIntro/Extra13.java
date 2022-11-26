import java.util.Scanner;

/* Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123 */

public class Extra13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int altura = read.nextInt();
        System.out.println("Escalera de numeros");
        for (int i = 1; i <= altura; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }

}
