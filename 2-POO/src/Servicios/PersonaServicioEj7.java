package Servicios;

import Entidades.PersonaEj7;
import java.util.Scanner;

public class PersonaServicioEj7 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonaEj7 crearPersona() {
        PersonaEj7 p1 = new PersonaEj7();
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());

        
        do {
            System.out.println("Ingrese su sexo");
            System.out.println("'H': hombre");
            System.out.println("'M': mujer");
            System.out.println("'O': otro");
            p1.setSexo(leer.next().toUpperCase());
            if (!p1.getSexo().equals("H") & !p1.getSexo().equals("M") & !p1.getSexo().equals("O")){
                System.out.println("El dato ingresado no es válido.");
            }
        } while (!p1.getSexo().equals("H") & !p1.getSexo().equals("M") & !p1.getSexo().equals("O"));
       
        System.out.println("Ingrese su peso en Kg");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura en metros");
        p1.setAltura(leer.nextDouble());
        while (p1.getAltura() < 0.2 || p1.getAltura() > 3.0) {
            System.out.println("El dato que ingresó no corresponde a una altura correcta.");
            System.out.println("Por favor, ingrese su altura nuevamente");
            p1.setAltura(leer.nextDouble());
        }
        return p1;
    }

    public int calcularIMC(PersonaEj7 p1) {
        double calculoIMC = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        double IMC = Math.round(calculoIMC * 100.0) / 100.0;
        int retorno = 0;
        if (IMC < 20.0) {
            System.out.println(p1.getNombre() + ", tu IMC es " + IMC + ", lo que significa que estás por debajo de tu peso ideal.");
            retorno = -1;
        } else if (IMC > 20.0 & IMC < 25.0) {
            System.out.println(p1.getNombre() + ", tu IMC es " + IMC + ", lo que significa que estás en el peso ideal.");

            retorno = 0;
        } else {
            System.out.println(p1.getNombre() + ", tu IMC es " + IMC + ", lo que significa que tienes sobrepeso.");
            retorno = 1;
        }
        return retorno;
    }

    public boolean esMayorDeEdad(PersonaEj7 p1) {
        boolean mayorEdad = false;
        if (p1.getEdad() > 18) {
            System.out.println(p1.getNombre() + ",tu edad es " + p1.getEdad() + ", y por lo tanto sos mayor de edad.");
            mayorEdad = true;

        } else {
            System.out.println(p1.getNombre() + ",tu edad es " + p1.getEdad() + ", y por lo tanto no sos mayor de edad.");
            mayorEdad = false;
        }
        return mayorEdad;
    }
}
