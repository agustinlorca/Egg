import java.util.Scanner;

/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */

public class Extra2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A, B, C, D, aux;
        A = 5;
        B = 10;
        C = 15;
        D = 20;
        aux = B;
        System.out.println("Valores iniciales");
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
        System.out.println("D= " + D);
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Valores finales");
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
        System.out.println("D= " + D);

    }

}
