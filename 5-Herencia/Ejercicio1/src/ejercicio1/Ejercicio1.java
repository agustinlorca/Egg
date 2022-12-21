package ejercicio1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.*/

public class Ejercicio1 {

    public static void main(String[] args) {

        //Objeto Perro 1
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.alimentarse();

        //Objeto Perro 2
        Animal perro2 = new Perro("Teddy", "Pollo", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Objeto Gato
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siames");
        gato1.alimentarse();
        
        //Objeto Caballo
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();
    }

}
