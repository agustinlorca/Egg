import java.util.Scanner;

/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counterTrue = 0;
        int counterFalse = 0;
        String cadena = "";
        String primerLetra = "";
        String ultimaLetra = "";
        do {
            System.out.println("Ingrese una cadena. Para finalizar ingrese '&&&&&'");
            cadena = read.nextLine();
            primerLetra = cadena.substring(0, 1);
            ultimaLetra = cadena.substring(cadena.length() - 1);
            if (primerLetra.equalsIgnoreCase("X") && ultimaLetra.equalsIgnoreCase("O") && cadena.length() <= 5) {
                counterTrue++;

            } else if (cadena.equals("&&&&&")) {
                counterTrue++;
            } else {
                counterFalse++;
            }

        } while (!cadena.equals("&&&&&"));

        System.out.println("Cantidad de lecturas correctas: " + counterTrue + " (incluido el FDE).");
        System.out.println("Cantidad de lecturas incorrectas: " + counterFalse);

    }

}
