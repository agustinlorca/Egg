package ejerciciospoo;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
public class Ejercicio9 {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
        m.setNumero1(Math.random() * 100);
        m.setNumero2(Math.random() * 100);
        System.out.println("Numero 1: " + m.getNumero1());
        System.out.println("Numero 2: " + m.getNumero2());
        System.out.println("Numero mayor: " + ms.devolverMayor(m));
        ms.calcularPotencia(m);
        ms.calculaRaiz(m);
    }

}
