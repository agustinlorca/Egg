
package extra1;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import Servicios.ServicioAlquiler;
import java.time.LocalDate;
import java.util.ArrayList;

/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.*/
public class Extra1 {

    public static void main(String[] args) {
       
        ServicioAlquiler sa = new ServicioAlquiler();
        
        ArrayList<Barco> barcos = new ArrayList();
        
        //Creamos los barcos
        Barco barco = new Barco("B-456-789",15,2001);
        Velero velero = new Velero("B-767-123",7,1995,2);
        BarcoMotor barcoM = new BarcoMotor("B-309-491",21,2007,1000);
        Yate yate = new Yate("B-190-003",25,2017,1200,2);
        
        //Añadimos al arrayList de barcos
        barcos.add(barco);
        barcos.add(velero);
        barcos.add(barcoM);
        barcos.add(yate);
        
        //Creamos un contrato de alquiler de un barco
        Alquiler a = sa.crearAlquiler(barcos);
        System.out.println(a);
        System.out.println("El precio de alquiler es de $"+sa.precioAlquiler(a));
      
    }
    
}
