import java.util.Scanner;

/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general. */

public class Extra6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Promedio de estaturas");
        System.out.println("Para finalizar ingrese 9999");
        int persona = 1;
        float promedioA = 0, sumaA = 0, contadorA = 0;
        float promedioB = 0, sumaB = 0, contadorB = 0;
        float estatura = 1111;

        while (estatura != 9999) {

            System.out.println("Ingrese la estatura de la persona " + persona);
            estatura = read.nextFloat();
            if (estatura <= 0) {
                System.out.println("¡Error! No es una estatura valida");
                break;
            } else if (estatura < 1.6) {
                sumaA += estatura;
                contadorA++;
            } else {
                sumaB += estatura;
                contadorB++;
            }
            persona++;
        }
        float A = contadorA - 1;
        float B = A + contadorB;
        promedioA = sumaA / (A);
        promedioB = (sumaA + sumaB) / (B);
        System.out.println("El promedio de estaturas por debajo de 1.6 mts es: " + promedioA);
        System.out.println("El promedio de estaturas generales es: " + promedioB);
    }

}
