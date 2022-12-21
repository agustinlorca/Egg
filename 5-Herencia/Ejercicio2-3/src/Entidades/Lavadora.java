package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, String consmo, double peso, double carga) {
        super(precio, color, consmo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora");
        carga = leer.nextDouble();

    }
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.*/
    
    public double precioFinal() {

        double precio = super.precioFinal();

        if (getCarga() > 30) {
            precio += 500;
        }
        return precio;

    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga = " + carga + "Kg.}";
    }

}
