import java.util.Scanner;

/* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */

public class Extra9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Para realizar la división, el dividendo debe ser mayor que el divisor");
        System.out.println("Ingrese el dividendo");
        int num1 = read.nextInt();
        System.out.println("Ingrese el divisor");
        int num2 = read.nextInt();

        if (num1 > 1 && num2 > 1 && num1 > num2) {
            int residuo = num1;
            int restas = 0;
            while (residuo > num2) {
                residuo -= num2;
                restas++;
            }
            System.out.println(
                    num1 + "/" + num2 + " da como resultado un residuo de " + residuo + " y un cociente de " + restas);
        } else {
            System.out.println("¡Error en los datos ingresados!");
        }

    }

}
