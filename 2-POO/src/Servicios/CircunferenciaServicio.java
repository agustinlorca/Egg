
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public void area(Circunferencia c1){
        Double area = Math.PI*Math.pow(c1.getRadio(), 2);
        System.out.println("El area de la circunferencia es: "+area);
    }
    public void perimetro(Circunferencia c1){
        Double perimetro = 2*Math.PI*c1.getRadio();
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }
}
