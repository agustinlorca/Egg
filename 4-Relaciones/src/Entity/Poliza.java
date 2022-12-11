
package Entity;

import java.util.ArrayList;
import java.util.Date;


public class Poliza {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int numPoliza;
    private Date fechaInicio;
    private Date fechaFinal;
    private ArrayList<Cuota> cuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean incluyeGranizo;
    private String granizo = incluyeGranizo();
    private double montoGranizo = 0;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, int numPoliza, Date fechaInicio, Date fechaFinal, ArrayList<Cuota> cuotas, double montoAsegurado, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cuotas = cuotas;
        this.montoAsegurado = montoAsegurado;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    
    public String incluyeGranizo(){
        String aux = new String();
        if(incluyeGranizo){
            aux = "Si";
        } else aux="No";
        
        return aux;
    }

    @Override
    public String toString() {
        return "Poliza{" + "Cliente=" + cliente + ", Vehiculo=" + vehiculo + ", Numero de Poliza=" + numPoliza + ", Fecha Inicio: " + fechaInicio.toString() + ", Fecha Final:" + fechaFinal.toString() + ", Cuotas=" + cuotas + ", Forma de Pago: " + formaPago + ", Monto Asegurado = $" + montoAsegurado + ", Incluye Granizo: " + granizo + ", Monto Granizo = $" + montoGranizo + ", Tipo de Cobertura: " + tipoCobertura + '}';
    }

   
    
    
    
}
