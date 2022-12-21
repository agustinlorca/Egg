package Entidades;

import java.util.Date;

public class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, int anio, int mastiles) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }
    
    
}
