import java.util.Scanner;

/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. */

public class Extra7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int n = read.nextInt();
        float maximo = 0, minimo = 0, suma = 0, promedio = 0;
        int contador = 0;
        if (n > 0) {
            while (contador < n) {

                System.out.println("Ingrese numeros");
                float numero = read.nextFloat();
                suma += numero;
                if (contador == 0) {
                    minimo = numero;
                }
                if (numero >= maximo) {
                    maximo = numero;
                } else if (numero <= minimo) {
                    minimo = numero;
                }
                contador++;
            }
            promedio = suma / n;
            System.out.println("El valor máximo es: " + maximo);
            System.out.println("El valor mínimo es: " + minimo);
            System.out.println("El promedio de los " + n + " números es: " + promedio);
        } else {
            System.out.println("Debe ingresar un valor mayor a 0.");
        }

    }

}
