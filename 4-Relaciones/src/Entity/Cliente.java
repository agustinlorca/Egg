
package Entity;


public class Cliente {
    private String nombreApellido;
    private long DNI;
    private String mail;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombreApellido, long DNI, String mail, String domicilio, String telefono) {
        this.nombreApellido = nombreApellido;
        this.DNI = DNI;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public long getDNI() {
        return DNI;
    }

    public String getMail() {
        return mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre y Apellido: " + nombreApellido + ", DNI: " + DNI + ", Mail: " + mail + ", Domicilio: " + domicilio + ", Telefono: " + telefono + '}';
    }
    
    
}
