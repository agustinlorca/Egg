package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    //Variables
    protected double precio;
    protected String color;
    protected String consumo;
    protected double peso;

    //Constante
    protected final double PRECIO_BASE = 1000;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, String consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsmo() {
        return consumo;
    }

    public void setConsmo(String consmo) {
        this.consumo = consmo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.*/
    public String comprobarConsumoEnergetico(String etiqueta) {

        String etiquetas[] = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < etiquetas.length; i++) {
            if (etiquetas[i].equalsIgnoreCase(etiqueta)) {
                return etiqueta.toUpperCase();
            }
        }
        return "F";
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public String comprobarColor(String color) {

        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                return color.toUpperCase();
            }
        }
        return "BLANCO";
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        //Precio base
        precio = PRECIO_BASE;

        //Color
        System.out.println("Ingrese el color de su electrodomestico");
        String colorElec = leer.next();
        color = comprobarColor(colorElec);

        //Consumo
        System.out.println("Ingrese la etiqueta de consumo");
        String etiqueta = leer.next();
        consumo = comprobarConsumoEnergetico(etiqueta);

        //Peso
        System.out.println("Ingrese el peso en Kg.");
        peso = leer.nextDouble();
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:

        LETRA PRECIO                PESO PRECIO
          A   $1000             Entre 1 y 19 kg $100
          B   $800              Entre 20 y 49 kg $500
          C   $600              Entre 50 y 79 kg $800
          D   $500              Mayor que 80 kg $1000
          E   $300
          F   $100
    */
    public double precioFinal() {

        //Precio que depende del consumo
        double precio = 0;
        String consumo = getConsmo();
        String etiquetas[] = {"A", "B", "C", "D", "E", "F"};
        double precios[] = {1000, 800, 600, 500, 300, 100};

        for (int i = 0; i < etiquetas.length; i++) {
            if (etiquetas[i].equalsIgnoreCase(consumo)) {

                precio = precio + precios[i];
            }
        }

        //Precio que depende del peso
        double peso = getPrecio();
        if (peso >= 1 & peso <= 19) {
            precio = precio + 100;
        } else if (peso >= 20 & peso <= 49) {
            precio = precio + 500;
        } else if (peso >= 50 & peso <= 79) {
            precio = precio + 800;
        } else if (peso >= 80) {
            precio = precio + 1000;
        } else {
            precio = precio + 100;
        }

        return precio + PRECIO_BASE;
    }


    @Override
    public String toString() {
        return "precio= $" + precio + ", color: " + color + ", consmo: " + consumo + ", peso=" + peso + " Kg.";
    }

}
