package ejerciciospoo;

/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
import java.util.Date;

/* 
    La clase Date tiene como atributo, una array con los meses, comenzando con
    enero en la posición "0", hasta dicimbre en la posición "11"; por eso se le
    resta uno.
    Lo mismo sucede con el año, al cual se le resta 1900 por atributos del arrays.
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();   // esto da x default la fecha de hoy.
        int dia, mes, anio;

        System.out.println("Ingrese el día, mes y año:");
        dia = leer.nextInt();
        mes = leer.nextInt() - 1;
        anio = leer.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);

        System.out.println("fecha Actual: " + fechaActual);
        System.out.println("fecha cargada: " + fecha);

        /*
        ¿¿ cuantos años hay entre esa fecha y la fecha actual ??
         */
        System.out.println((int) (fechaActual.getYear()) - (int) (fecha.getYear()));
    }

}
