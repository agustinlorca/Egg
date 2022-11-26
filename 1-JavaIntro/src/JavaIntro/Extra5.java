import java.util.Scanner;

/* Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
- Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
- Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */

public class Extra5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese la categoría de obra social que posee (1-2-3 según corresponda)");
        System.out.println("1- Categoría A");
        System.out.println("2- Categoría B");
        System.out.println("3- Categoría C");
        int opcion = read.nextInt();

        System.out.println("Ingrese el costo del tratamiento");
        double costo = read.nextDouble();
        double costoFinal = 0.0;
        switch (opcion) {
            case 1:
                costoFinal = 0.5 * costo;
                System.out.println("El costo final de su tratamiento es de $" + costoFinal);
                break;
            case 2:
                costoFinal = costo - 0.35 * costo;
                System.out.println("El costo final de su tratamiento es de $" + costoFinal);
                break;
            case 3:
                System.out.println("El costo final de su tratamiento es de $" + costo);
                break;
            default:
                System.out.println("La categoría ingresada no es válida o no existe.");
                break;
        }
    }

}
