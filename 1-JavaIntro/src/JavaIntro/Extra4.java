import java.util.Scanner;

/* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano. */

public class Extra4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10.");
        int numero = read.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.println("¡Error! Ingrese un numero entre 1 y 10. ");
            numero = read.nextInt();
        }
        switch (numero) {
            case 1:
                System.out.println(numero + " en romano es I.");
                break;
            case 2:
                System.out.println(numero + " en romano es II.");
                break;
            case 3:
                System.out.println(numero + " en romano es III.");
                break;
            case 4:
                System.out.println(numero + " en romano es IV.");
                break;
            case 5:
                System.out.println(numero + " en romano es V.");
                break;
            case 6:
                System.out.println(numero + " en romano es VI.");
                break;
            case 7:
                System.out.println(numero + " en romano es VII.");
                break;
            case 8:
                System.out.println(numero + " en romano es VIII.");
                break;
            case 9:
                System.out.println(numero + " en romano es IX.");
                break;
            case 10:
                System.out.println(numero + " en romano es X.");
                break;
            default:
                System.out.println("Error");
        }
    }

}
