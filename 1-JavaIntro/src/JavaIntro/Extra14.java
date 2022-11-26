import java.util.Scanner;

/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias. */

public class Extra14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int N = read.nextInt();
        int cantidadHijos = 0;
        int sumaEdades = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i);
            int M = read.nextInt();
            cantidadHijos += M;
            for (int j = 1; j <= M; j++) {
                System.out.println("Ingrese la edad del hijo N° " + j + " correspondiente a la familia " + i);
                int edad = read.nextInt();
                sumaEdades += edad;
            }

        }
        int media = sumaEdades / cantidadHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + media);
    }

}
