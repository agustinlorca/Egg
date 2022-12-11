package Entity;

public class Alumno {

    private String nombreCompleto;
    private int DNI;
    private int votos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int DNI, int votos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public int getVotos() {
        return votos;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre Completo: " + nombreCompleto + ", DNI: " + DNI + ", Votos: " + votos + '}';
    }

  
}
