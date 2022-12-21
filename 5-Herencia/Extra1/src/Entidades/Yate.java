package Entidades;

import java.util.Date;

public class Yate extends BarcoMotor {

    protected int camarotes;

    public Yate() {
    }

   

    public Yate(String matricula, double eslora, int anio, double potencia,int camarotes) {
        super(matricula, eslora, anio, potencia);
        this.camarotes = camarotes;
    }
    

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +"potencia= "+ super.getPotencia()+", camarotes= " + camarotes + '}';
    }

}
