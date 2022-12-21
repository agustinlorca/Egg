package extra3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import static Entidades.Hotel.precioDesc;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import Servicios.ServicioHotel4;
import Servicios.ServicioHotel5;
import java.util.ArrayList;
import java.util.Scanner;

/*Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:

• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.*/


public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alojamiento> alojamientos = new ArrayList();
        ArrayList<Hotel> hoteles = new ArrayList();

        //Servicios de hotel
        ServicioHotel4 sh4 = new ServicioHotel4();
        ServicioHotel5 sh5 = new ServicioHotel5();

        //Creamos distintos alojamientos y lo añadimos al arraylist
        alojamientos.add(new Hotel4("Novotel", "Ruta 5", "Buenos Aires", "Geronimo Reyes", 40, 120, 6, "B", "La italiana", 25, 0));
        alojamientos.add(new Hotel4("Kenton Palace", "Calle 123", "Bariloche", "Oscar Gimenez", 20, 50, 4, "A", "Buffete Kenton", 30, 0));

        alojamientos.add(new Hotel5("Iberoestar Quetzal", "Riviera Maya 123", "Playa del Carmen", "Carlos Monserrat", 40, 95, 9, "B", "Nusr-Et", 40, 1, 3, 5, 0));
        alojamientos.add(new Hotel5("Burj Al Arab", "Umm Suqeim 3 ", "Dubai", "Jalifa bin Zayed ", 202, 450, 56, "B", "Al Iwan", 200, 1, 101, 25, 0));

        alojamientos.add(new Camping("Rivadavia", "El Carrizal", "Rivadavia", "Gustavo Dias", false, 3500, 500, 14, false));
        alojamientos.add(new Camping("Los Olivos", "San Isidrio 156 ", "Rivadavia", "Eduardo Martinez", true, 1200, 80, 8, true));

        alojamientos.add(new Residencia("Mendoza", "Sgto. Cabral 765", "Mendoza", "Martin Lopez", false, 350, 20, true, true));
        alojamientos.add(new Residencia("Palo Alto", "Gorriti 4776", "Palermo-Bs.As.", "Pablo Lopez", true, 850, 50, false, true));

        int opcion = 0;
        do {
            System.out.println("----------------------MENU------------------------");
            System.out.println("1- Consultar todos los alojamientos");
            System.out.println("2- Consultar hoteles (mas caro a mas barato)");
            System.out.println("3- Consultar campings con restaurante");
            System.out.println("4- Consultar residencias con descuento a gremios");
            System.out.println("5- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamiento alojamiento : alojamientos) {

                        System.out.println(alojamiento.toString());
                        System.out.println("-----------------------------------------");
                    }
                    break;
                case 2:

                    for (Alojamiento alojamiento : alojamientos) {
                        if (alojamiento instanceof Hotel5) {
                           
                            Hotel5 h5 = (Hotel5) alojamiento;  //Creamos un objeto de hotel5
 
                            double precio = sh5.precioHabitacion(h5); //Calculamos el precio
                            h5.setPrecioHab(precio); //Lo guardamos en el objeto
                            hoteles.add(h5); //Lo añadimos al arraylist de hoteles
                            
                            continue; 
                        }
                        if (alojamiento instanceof Hotel4) {

                            Hotel4 h4 = (Hotel4) alojamiento;

                            double precio = sh5.precioHabitacion(h4);
                            h4.setPrecioHab(precio);
                            hoteles.add(h4);
                        }
                    }
                    //Ordenamos el arrayList segun precio de mayor a menor
                    hoteles.sort(precioDesc);

                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel.toString());
                        System.out.println("-----------------------------------------");
                    }
                    
                    break;
                case 3:
                    for (Alojamiento alojamiento : alojamientos) {
                        if (alojamiento instanceof Camping){
                            Camping c = (Camping) alojamiento;
                            
                            if(c.isRestaurante()){
                                System.out.println(alojamiento.toString());
                                System.out.println("-----------------------------------------");
                            }
                        }
                    }
                    break;
                case 4:
                     for (Alojamiento alojamiento : alojamientos) {
                        if (alojamiento instanceof Residencia){
                            Residencia r = (Residencia) alojamiento;
                            
                            if(r.isDescGremios()){
                                System.out.println(alojamiento.toString());
                                System.out.println("-----------------------------------------");
                            }
                        }
                    }
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("¡Opción no válida!");
                    break;
            }

        } while (opcion != 5);
        System.out.println("¡Usted salió del sistema!");
    }

}
