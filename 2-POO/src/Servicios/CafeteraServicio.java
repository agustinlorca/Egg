package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int contador = 0;

    public Cafetera llenarCafetera() {

        Cafetera c1 = new Cafetera();
        if (contador == 0) {
            System.out.println("Ingrese la capacidad maxima de la cafetera");
            c1.setCapacidadMaxima(leer.nextInt());
        }
        contador++;
        if (c1.getCantidadActual() == c1.getCapacidadMaxima()) {
            System.out.println("La cafetera ya está llena.");

        } else {
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }

        return c1;
    }

    public void servirTaza(Cafetera c1) {
        System.out.println("Ingrese el tamaño de la taza en mililitros");
        int taza = leer.nextInt();
        
        
        if (taza < c1.getCantidadActual()) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("¡Disfrute su café!");
        } else if (c1.getCantidadActual() == 0) {
            System.out.println("¡La cafetera está vacía!");
            System.out.println("Para rellenarla vaya a la opción 1.");

        } else {
            taza = c1.getCantidadActual();
            c1.setCantidadActual(0);
            System.out.println("No hay suficiente café para llenar su taza.");
            System.out.println("Se le servirá el café restante que es de " + taza + " ml.");
        }

    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c1) {

        if (c1.getCantidadActual() == c1.getCapacidadMaxima()) {
            System.out.println("La cafetera ya está llena. No es necesario agregar más.");
        } else {
            System.out.println("Ingrese la cantidad de café en mililitros que desea añadir");
            int cantidad = leer.nextInt();
            while (c1.getCantidadActual() + cantidad > c1.getCapacidadMaxima()) {
                System.out.println("La cantidad que desea agregar excede la capacidad máxima de la cafetera.");
                System.out.println("¡Por favor! Ingrese una cantidad correcta.");
                cantidad = leer.nextInt();
            }
            c1.setCantidadActual(c1.getCantidadActual() + cantidad);
        }

    }
}
