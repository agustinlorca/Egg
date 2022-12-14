
package Entity;

import java.time.LocalDate;



public class Cuota {
    private int numCuota;
    private double monto;
    private boolean estaPaga;
    private LocalDate fechaVto;
    private String formaPago ="-";
    

    public Cuota() {
    }

    public Cuota(int numCuota, double monto, boolean estaPaga, LocalDate fechaVto, String formaPago) {
        this.numCuota = numCuota;
        this.monto = monto;
        this.estaPaga = estaPaga;
        this.fechaVto = fechaVto;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isEstaPaga() {
        return estaPaga;
    }

    public LocalDate getFechaVto() {
        return fechaVto;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstaPaga(boolean estaPaga) {
        this.estaPaga = estaPaga;
    }

    public void setFechaVto(LocalDate fechaVto) {
        this.fechaVto = fechaVto;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
   
    
    
    @Override
    public String toString() {
        return "Cuota N°" + numCuota+" {" + "Monto = $" + monto + ", Esta paga: " + estaPaga + ", FechaVto: " + fechaVto + ", Forma de pago: " + formaPago + '}';
    }
    
    
   
    
    
    
}
