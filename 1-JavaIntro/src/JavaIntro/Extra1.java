import java.util.Scanner;

/* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */

public class Extra1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos que desea convertir");
        int minutos = read.nextInt();
        double hora = minutos / 60;
        if (hora < 24) {
            System.out.println(minutos + " minutos equivalen a " + hora + " horas.");
        } else if (hora == 24) {
            System.out.println(minutos + " minutos equivalen a 1 día.");
        } else {
            double horaRestante = hora;
            int dias = 0;
            while (horaRestante > 24) {
                horaRestante = horaRestante - 24;
                dias++;
            }
            System.out.println(minutos + " minutos equivalen a " + dias + " dia(s) y " + horaRestante + " horas.");
        }

    }

}
