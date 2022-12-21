
package ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;


/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/


public class Ejercicio4 {
   
    public static void main(String[] args) {
        
       // Calculo perimetro y area de un circulo
        Circulo c = new Circulo(5);
        double areaC = c.calcularArea();
        double perimetroC = c.calcularPerimetro();
        
        System.out.println("El area del circulo con radio = "+c.getRadio()+", es: "+areaC+" u^2.");
        System.out.println("El perimetro del circulo con radio = "+c.getRadio()+", es: "+perimetroC+" u.");
        
        System.out.println("-----------------------------------");
        
        //Calculo perimetro y area de un rectangulo
        Rectangulo r = new Rectangulo(3.5,7);
        
        System.out.println("El area del rectangulo con base = "+r.getBase()+" y altura = "+r.getAltura()+", es: "+r.calcularArea()+" u^2.");
        System.out.println("El perimetro del rectangulo con base = "+r.getBase()+" y altura = "+r.getAltura()+", es: "+r.calcularPerimetro()+" u.");
        
    }
    
}
