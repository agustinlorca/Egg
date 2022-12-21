package extra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.ServicioEdificioOf;
import Servicios.ServicioPolideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/
public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<Edificio> listaEdificios = new ArrayList(); //ArrayList de tipo Edificio que va a guardar Polideportivos y Ed de oficinas
        //Servicios
        ServicioEdificioOf sEof = new ServicioEdificioOf();
        ServicioPolideportivo sPoli = new ServicioPolideportivo();

        int opcion = 0;

        do {
            System.out.println("1- Crear edificio de Oficinas");
            System.out.println("2- Crear Polideportivo");
            System.out.println("3- Mostrar información de edificio de Oficinas");
            System.out.println("4- Mostrar información de polideportivos");
            System.out.println("5- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------Crear Edificio de Oficinas-------");
                    EdificioDeOficinas edOf = sEof.crearEdificioOf();
                    listaEdificios.add(edOf);
                    break;
                case 2:
                    System.out.println("------Crear Polideportivo-------");
                    Polideportivo poli = sPoli.crearPoli();
                    listaEdificios.add(poli);
                    break;
                case 3:
                    int contador = 1;
                    for (Edificio edificio : listaEdificios) {
                        if (edificio instanceof EdificioDeOficinas) {
                            EdificioDeOficinas e = (EdificioDeOficinas) edificio;
                            System.out.println("Edificio de Oficinas N°" + contador);
                            System.out.println("Superficie: " + e.calcularSuperficie() + " m^2");
                            System.out.println("Volumen: " + e.calcularVolumen() + " m^3");
                            sEof.cantPersonas(e);
                            System.out.println("");
                            System.out.println("-----------------------");
                            System.out.println("");
                            contador += 1;
                        }
                    }
                    break;
                case 4:
                    int contAb = 0;
                    int contTech = 0;
                    for (Edificio edificio : listaEdificios) {
                        if (edificio instanceof Polideportivo) {
                            Polideportivo p = (Polideportivo) edificio;
                            System.out.println("Polideportivo '" + p.getNombre() + "'");
                            System.out.println("Superficie: " + p.calcularSuperficie() + " m^2");
                            System.out.println("Volumen: " + p.calcularVolumen() + " m^3");
                            System.out.println("Tipo de instalacion: " + p.getTipoInstalacion());
                            if (p.getTipoInstalacion().equals("Techado")) {
                                contTech += 1;
                            } else {
                                contAb += 1;
                            }
                            System.out.println("Cantidad polideportivos abiertos: "+contAb);
                            System.out.println("Cantidad polideportivos techados: "+contTech);
                            System.out.println("");
                            System.out.println("-----------------------");
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

    }

}
