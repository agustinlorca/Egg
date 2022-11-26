package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        //Instanciamos
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextInt());
        return r1;
    }

    public void superficie(Rectangulo r1) {

        int superficie = r1.getBase() * r1.getAltura();
        System.out.println("La superficie del rectangulo, con base de " + r1.getBase() + " m y altura de " + r1.getAltura() + "m, es: " + superficie + " m2");

    }

    public void perimetro(Rectangulo r1) {
        int perimetro = (r1.getBase() + r1.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo, con base de " + r1.getBase() + " m y altura de " + r1.getAltura() + "m, es: " + perimetro + " m");
    }

    public void dibujarRectangulo(Rectangulo r1) {

        for (int i = 0; i < r1.getAltura(); i++) {

            for (int j = 0; j < r1.getBase() - 1; j++) {
                System.out.print(" * ");

            }

            System.out.println(" * ");

        }
        System.out.println("");
    }

}
