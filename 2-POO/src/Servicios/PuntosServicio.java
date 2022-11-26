

package Servicios;

import Entidades.Puntos;
import java.util.Scanner;


public class PuntosServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos() {
        Puntos p = new Puntos();
        System.out.println("Ingrese dos numeros para el punto P1(x1,y1), respectivamente");
        p.setX1(leer.nextInt());
        p.setY1(leer.nextInt());
        System.out.println("Ingrese dos numeros para el punto P2(x2,y2), respectivamente");
        p.setX2(leer.nextInt());
        p.setY2(leer.nextInt());
        return p;
    }
    
    public void calcularDistancia(Puntos p){
        int x1 = p.getX1(),y1 =p.getY1();
        int x2= p.getX2(), y2= p.getY2();
        
        //Calculamos (x2 - x1)^2 y (y2 - y1)^2
        double restaX = Math.pow(x2-x1,2);
        double restaY = Math.pow(y2-y1,2);
        // Calculamos la raiz de (x2 - x1)^2 + (y2 - y1)^2
        double distancia = Math.sqrt(restaX + restaY);
        System.out.println("La distancia entre P1("+p.getX1()+","+p.getY1()+") y P2("+p.getX2()+","+p.getY2()+") es: "+ distancia);
    }
    
}
