import java.util.Scanner;

/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €   */

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Indique la cantidad en euros a convertir");
        double euros = read.nextDouble();
        System.out.println("Indique la divisa a convertir (libras, dolares, yenes)");
        String divisa = read.next();
        MostrarCambio(euros, divisa);
    }

    public static void MostrarCambio(Double euro, String divisa) {

        Double conversion = 0.0;

        if (divisa.equals("libras")) {
            conversion = euro * 0.86;
            System.out.println(euro + " euros son " + conversion + " " + divisa);
        } else if (divisa.equals("dolares")) {
            conversion = euro * 1.28611;
            System.out.println(euro + " euros son " + conversion + " " + divisa);
        } else if (divisa.equals("yenes")) {
            conversion = euro * 129.852;
            System.out.println(euro + " euros son " + conversion + " " + divisa);
        } else {
            System.out.println("La divisa ingresada no es correcta");
        }

    }

}
