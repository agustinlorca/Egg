import java.util.Scanner;

/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares */

public class Extra8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeros = 1, pares = 0, impares = 0;

        while (numeros % 5 != 0) {
            System.out.println("Ingrese numeros enteros");
            numeros = read.nextInt();
            if (numeros % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("La cantidad de numeros ingresados son: " + (pares + impares));
        System.out.println("La cantidad de numeros pares son: " + pares);
        System.out.println("La cantidad de numeros impares son: " + impares);
    }

}
