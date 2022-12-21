package Servicios;

import Entidades.Hotel5;

public class ServicioHotel5 extends ServicioHotel4 {

    public double precioHabitacion(Hotel5 h) {

        return super.precioHabitacion(h) + h.getCantLimusinas()*15;
    }

}
