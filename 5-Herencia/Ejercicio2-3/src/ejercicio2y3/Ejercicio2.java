
package ejercicio2y3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

  /*Ejercicio 2)
        *Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
        consumo energético (letras entre A y F) y peso.
        *Crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados.
        *Se debe crear también una subclase llamada Televisor con los siguientes atributos:
        resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
        */

public class Ejercicio2 {
    
    public static void main(String[] args) {
        //Lavadora
       
        System.out.println("---------Lavadora-----------");
        Lavadora lav = new Lavadora();
        lav.crearLavadora();
        lav.setPrecio(lav.precioFinal());
        System.out.println(lav);
        
       //Televisor
       
        System.out.println("---------Televisor-----------");
        Televisor tv = new Televisor();
        tv.crearTelevisor();
        tv.setPrecio(tv.precioFinal());
        System.out.println(tv);
    }
}
