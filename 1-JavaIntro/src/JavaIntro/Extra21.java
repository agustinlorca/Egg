import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso. */

public class Extra21 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cargar las notas en el siguiente orden");
        System.out.println("1- Primer trabajo práctico evaluativo");
        System.out.println("2- Segundo trabajo práctico evaluativo");
        System.out.println("3- Primer Integrador");
        System.out.println("4- Segundo integrador");
        double notaProm = 0.0;
        double sumaNotas = 0.0;
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Ingrese la nota N°" + j + " del alumno " + i);
                double nota = read.nextDouble();

                while (nota < 1 || nota > 10) {
                    System.out.println("¡Error! Debe ingresar una nota entre 1 y 10");
                    System.out.println("Por favor, ingrese la nota N°" + j + " del alumno " + i);
                    nota = read.nextDouble();
                }

                if (j == 1) {
                    notaProm = 0.1 * nota;
                } else if (j == 2) {
                    notaProm = 0.15 * nota;
                } else if (j == 3) {
                    notaProm = 0.25 * nota;
                } else {
                    notaProm = 0.5 * nota;
                }
                sumaNotas += notaProm;
            }
            if (sumaNotas >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + desaprobados);
    }

}
