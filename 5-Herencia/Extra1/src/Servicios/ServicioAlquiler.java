package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.DAYS;

public class ServicioAlquiler {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler(ArrayList<Barco> barcos) {
        Alquiler a = new Alquiler();
        
        System.out.println("Ingrese su nombre completo");
        a.setNombre(leer.next());

        System.out.println("Ingrese su N° de DNI");
        a.setDni(leer.nextInt());

        //Seteamos la fecha de alquiler a la actual
        a.setFechaAlq(LocalDate.now());

        System.out.println("¿Por cuantos días desea alquilar?");
        int dias = leer.nextInt();
        a.setFechaDev(LocalDate.now().plusDays(dias));

        //Seteamos un numero aleatorio para la posicion del amarre
        a.setAmarre((int) (Math.random() * 20));

        //
        System.out.println("Selecciona el barco que desea alquilar");
        for (int i = 0; i < barcos.size(); i++) {
            System.out.println(i+1 + "-" + " " + barcos.get(i).toString());
        }
        int opcion = leer.nextInt();
        a.setBarco(barcos.get(opcion-1));
        
        return a;
    }
    
    public double precioAlquiler(Alquiler a){
        
        //Cantidad dias
        int dias = (int) ChronoUnit.DAYS.between(a.getFechaAlq(),a.getFechaDev());
        
        //Modulo normal
        double modulo = 10*a.getBarco().getEslora();
        
        //Precio barco normal
        double precio = dias*modulo;
        
        //Segun cada barco calculamos su precio
        if (a.getBarco() instanceof Velero){
            Velero object = (Velero) a.getBarco();
            precio = dias * (modulo + object.getMastiles());
        }
        if (a.getBarco() instanceof BarcoMotor){
            BarcoMotor object = (BarcoMotor) a.getBarco();
            precio = dias* (modulo + object.getPotencia());
        }
         if (a.getBarco() instanceof Yate){
            Yate object = (Yate) a.getBarco();
            precio = dias* (modulo + object.getPotencia() + object.getCamarotes());
        }
       
        return precio;
    }
}
