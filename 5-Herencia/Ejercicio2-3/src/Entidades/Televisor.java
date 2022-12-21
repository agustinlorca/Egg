
package Entidades;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }


    public Televisor(double precio, String color, String consmo, double peso,int resolucion,boolean sintonizador) {
        super(precio, color, consmo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la resolucion del televisor en pulgadas.");
        resolucion = leer.nextInt();
        System.out.println("¿Posee sintonizador? (S/N)");
        sintonizador = leer.next().equalsIgnoreCase("S");
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.*/
    
    public double precioFinal(){
        double precio = super.precioFinal();
        if(resolucion>40){
            precio += precio*0.3;
        }
        if(sintonizador){
            precio += 500;
        }
        
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + ", resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
    
    
}
