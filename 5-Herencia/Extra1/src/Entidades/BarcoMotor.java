
package Entidades;

import java.util.Date;


public class BarcoMotor extends Barco{
    
    protected double potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(String matricula, double eslora, int anio, double potencia) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }
    
}
