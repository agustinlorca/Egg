package ejerciciospoo;

import Entidades.PersonaEj7;
import Servicios.PersonaServicioEj7;


/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores*/

public class Ejercicio7 {

    public static void main(String[] args) {
        PersonaServicioEj7 ps = new PersonaServicioEj7();
        //Creamos 4 objetos

        //Persona 1
        PersonaEj7 p1 = ps.crearPersona();
        int imcP1 = ps.calcularIMC(p1);
        boolean edadP1 = ps.esMayorDeEdad(p1);

        //Persona 2
        PersonaEj7 p2 = ps.crearPersona();
        int imcP2 = ps.calcularIMC(p2);
        boolean edadP2 = ps.esMayorDeEdad(p2);

        //Persona 3
        PersonaEj7 p3 = ps.crearPersona();
        int imcP3 = ps.calcularIMC(p3);
        boolean edadP3 = ps.esMayorDeEdad(p3);

        //Persona 4
        PersonaEj7 p4 = ps.crearPersona();
        int imcP4 = ps.calcularIMC(p4);
        boolean edadP4 = ps.esMayorDeEdad(p4);

        //Porcentaje IMC
        int cont1 = 0, cont2 = 0, cont3 = 0;
        
        for (int i = 0; i < 4; i++) {
            if (imcP1 == -1 || imcP2 == -1 || imcP3 == -1 || imcP2 == -1 ){
                cont1++;
            } else if (imcP1 == 0 || imcP2 == 0 || imcP3 == 0 || imcP2 == 0 ){
                cont2++;
            } else {
                cont3++;
            }
        }
        int porcDI = (cont1/4)*100;
        int porcPI = (cont2/4)*100;
        int porcS = (cont3/4)*100;
        System.out.println("El procentaje de las personas por debajo del peso ideal es:  "+porcDI);
        System.out.println("El procentaje de las personas con peso ideal es:  "+porcPI);
        System.out.println("El procentaje de las personas con sobrepeso:  "+porcS);
        
        //Porcentaje mayor de edad
        int contMay = 0, contMen = 0;
        
        for (int i = 0; i < 4; i++) {
            if (edadP1 == true || edadP2 == true || edadP3 == true || edadP4 == true ){
                contMay++;
            } else {
                contMen++;
            }
        }
        int porcMay = (contMay/4)*100;
        int porcMen = (contMen/4)*100;
        
        System.out.println("El procentaje de las personas mayores de edad es:  "+porcMay);
        System.out.println("El procentaje de las personas menores de edad es:  "+porcMen);
        
    }

}
