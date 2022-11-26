package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

public class MatematicaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Matematica m1 = new Matematica();

    public double devolverMayor(Matematica m1) {
        double esMayor = 0.0;
        if (m1.getNumero1() > m1.getNumero2()) {
            esMayor = m1.getNumero1();
        } else {
            esMayor = m1.getNumero2();
        }
        return esMayor;
    }

    public void calcularPotencia(Matematica m1) {
        double num1Round = Math.round(m1.getNumero1() * 100.0) / 100.0;
        double num2Round = Math.round(m1.getNumero2() * 100.0) / 100.0;
        double potencia = 0;
        if (num1Round < num2Round) {

            potencia = Math.pow(num2Round, num1Round);
            System.out.println(num2Round + " elevado a " + num1Round + " es: " + potencia);
        } else {
            potencia = Math.pow(num1Round, num2Round);
            System.out.println(num1Round + " elevado a " + num2Round + " es: " + potencia);
        }

    }

    public void calculaRaiz(Matematica m1) {
        double num1 = Math.abs(m1.getNumero1());
        double num2 = Math.abs(m1.getNumero2());
        double raiz = 0;
        if (num1 < num2) {

            raiz = Math.sqrt(num1);
            System.out.println("La raiz cuadrada de " + num1 + " es: " + raiz);

        } else {
            raiz = Math.sqrt(num2);
            System.out.println("La raiz cuadrada de " + num2 + " es: " + raiz);

        }
    }

}
