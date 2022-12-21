package ejercicio2y3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/*
Ejercicio 3)
    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
    para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
    Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
    deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
    televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
    precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
    2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
    electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        double totalLav = 0;
        double totalTV = 0;
        double total = 0;

        //Creamos 5 electrodomesticos
        Lavadora lav1 = new Lavadora(1000, "blanco", "A", 110, 40);
        Lavadora lav2 = new Lavadora(1000, "gris", "B", 75, 20);
        Televisor tv1 = new Televisor(1000, "negro", "C", 35, 32, false);
        Televisor tv2 = new Televisor(1000, "rojo", "A", 45, 70, true);

        //Agregamos al arrayList de electrodomesticos
        listaElectrodomesticos.add(lav1);
        listaElectrodomesticos.add(lav2);
        listaElectrodomesticos.add(tv1);
        listaElectrodomesticos.add(tv2);

        //Recorremos el arrayList
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {

            if (electrodomestico instanceof Lavadora) {
                Lavadora lav = (Lavadora) electrodomestico;
                
                lav.setPrecio(lav.precioFinal());
                totalLav += lav.getPrecio();
                
                System.out.println(electrodomestico);
            }
            if (electrodomestico instanceof Televisor) {
                Televisor tv = (Televisor) electrodomestico;
                
                tv.setPrecio(tv.precioFinal());
                totalTV += tv.getPrecio();
                
                System.out.println(electrodomestico);
            }
        }

        System.out.println("Total lavadoras = $" + totalLav);
        System.out.println("Total televisores = $" + totalTV);
        total = totalLav + totalTV;
        System.out.println("Total electrodomesticos = $" + total);
    }
}
