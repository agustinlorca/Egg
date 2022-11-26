package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Creamos las raices
    public Raices crearRaices() {
        Raices r = new Raices();
        System.out.println("Ingrese los 3 coeficientes a,b,c respectivamente");
        r.setA(leer.nextDouble());
        r.setB(leer.nextDouble());
        r.setC(leer.nextDouble());
        return r;
    }

    //Obtenemos el discriminante
    public double getDiscriminante(Raices r) {
        double disc = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        return disc;
    }

    //Devuelve true si tiene dos soluciones 
    public boolean tieneRaices(Raices r) {

        if (getDiscriminante(r) > 0) {
            return true;
        } else {
            return false;
        }

    }

    //Devuelve true si tiene una única solucion
    public boolean tieneRaiz(Raices r) {
        boolean retorno = false;

        if (getDiscriminante(r) == 0) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    // Devuelve las dos posibles raices
    public void obtenerRaices(Raices r) {
        double raiz1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
        double raiz2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
        if (tieneRaices(r) == true) {
            System.out.println("En la ecuacion de segundo grado ax2 + bx + c = 0");
            System.out.println("Donde:");
            System.out.println("a= " + r.getA());
            System.out.println("b= " + r.getB());
            System.out.println("c= " + r.getC());
            System.out.println("Las raices son:");
            System.out.println("r1 = " + raiz1);
            System.out.println("r2 = " + raiz2);
        }

    }

    //Devuelve la raiz en caso de tener una solucion
    public void obtenerRaiz(Raices r) {
        double raiz = (-r.getB() + Math.sqrt(getDiscriminante(r))) / 2 * r.getA();
        if (tieneRaiz(r) == true) {
            System.out.println("En la ecuacion de segundo grado ax2 + bx + c = 0");
            System.out.println("Donde:");
            System.out.println("a= " + r.getA());
            System.out.println("b= " + r.getB());
            System.out.println("c= " + r.getC());
            System.out.println("La raiz es r = " + raiz);
        }
    }

    public void calcular(Raices r) {
               
        if (tieneRaices(r)){
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else System.out.println("No existe solucion para la ecuacion.");
    }

}
