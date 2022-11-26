package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();

        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el N° de DNI sin puntos");
        c1.setDNI(leer.nextLong());
        System.out.println("Ingrese el saldo actual");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }

    public void ingresar(Cuenta c1) {
        System.out.println("Ingrese una cantidad de dinero a ingresar");
        int ingreso = leer.nextInt();
        c1.setSaldoActual(ingreso + c1.getSaldoActual());

    }

    public void retirar(Cuenta c1) {
        System.out.println("Ingrese una cantidad de dinero a retirar");
        int retiro = leer.nextInt();
        if (retiro > c1.getSaldoActual()) {
            c1.setSaldoActual(0);

        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        }
    }

    public void extraccionRapida(Cuenta c1) {

        System.out.println("Ingrese la cantidad de dinero a retirar");
        int extraccion = leer.nextInt();
        double limite = (double) c1.getSaldoActual() * 0.2;
        
        while ((double) extraccion > limite){
            System.out.println("¡Error! Solo puede retirar el 20% de su saldo en una extracción rápida");
            System.out.println("Ingrese nuevamente una cantidad correcta");
            extraccion = leer.nextInt();
        }
        c1.setSaldoActual(c1.getSaldoActual() - extraccion);
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println("N° de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDNI());
    }
}
