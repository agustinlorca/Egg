package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        //Instanciamos el objeto Operacion

        Operacion op1 = new Operacion();

        //Le asignamos un valor a cada atributo (num1 y num2) del objeto Operacion
        System.out.println("Ingrese dos numeros enteros");
        op1.setNumero1(leer.nextInt());
        op1.setNumero2(leer.nextInt());
        return op1;
    }

    public void sumar(Operacion op1) {
        int suma = op1.getNumero1() + op1.getNumero2();
        System.out.println("La suma entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: " + suma);
    }

    public void restar(Operacion op1) {
        int resta = op1.getNumero1() - op1.getNumero2();
        System.out.println("La resta entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: " + resta);
    }

    public void multiplicar(Operacion op1) {
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0) {
            System.out.println("¡Error! El resultado de la multiplicación es 0.");
        } else {
            int multiplicacion = op1.getNumero1() * op1.getNumero2();
            System.out.println("El producto entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: " + multiplicacion);
        }
    }
    public void dividir(Operacion op1){
        
        if (op1.getNumero2() == 0){
            System.out.println("¡Error! No se puede dividir por 0.");
        } else {
            double division = (double) op1.getNumero1() / (double) op1.getNumero2();
             System.out.println("La division entre " + op1.getNumero1() + " y " + op1.getNumero2() + " es: " + division);
        }
    }

}
