
package Servicios;

import Entidades.NIF;
import java.util.Scanner;


public class NIFservicio {
    private Scanner leer = new Scanner(System.in);
    public NIF crearNIF(){
        //Instanciamos
        NIF nif = new NIF();
        //Creamos un array con todas las letras correspondientes
        String letra[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        //Solicito al usuario su N° de DNI
        System.out.println("Ingrese su numero de dni sin puntos");
        nif.setDNI(leer.nextLong());
        //Calculamos la letra correspondiente
        long resto = nif.getDNI() % 23;
        for (int i = 0; i < 23; i++) {
            if (resto == i){
               nif.setLetra(letra[i]);
            }
        }
        return nif;
    }
    
    public void mostrar(NIF n) {
        System.out.println("Su NIF (número de identificación fiscal) es:  "+n.getDNI()+"-"+n.getLetra());
    }
}
