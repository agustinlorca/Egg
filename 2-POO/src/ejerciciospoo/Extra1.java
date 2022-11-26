
package ejerciciospoo;

import Entidades.Cancion;
import Servicios.CancionServicio;

/*Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.*/

public class Extra1 {

   
    public static void main(String[] args) {
        CancionServicio cs = new CancionServicio();
        Cancion c1 = cs.crearCancion();
        System.out.println(c1);
    }
    
}
