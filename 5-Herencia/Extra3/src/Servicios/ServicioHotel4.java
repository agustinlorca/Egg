package Servicios;

import Entidades.Hotel4;


public class ServicioHotel4 {

    public double precioHabitacion(Hotel4 h){
        
        double precio = 50 + h.getNumCamas();

        //Valor agregado segun capacidad del restaurante
        if (h.getCapacidadRest() < 30) {
            precio += 10;
        } else if (h.getCapacidadRest() < 50) {
            precio += 10;
        } else {
            precio += 50;
        }

        //Valor agregado segun gimnasio
        if (h.getGimnasio().equalsIgnoreCase("A")) {
            precio += 50;
        } else {
            precio += 30;
        }

        return precio;
    }
   
}
