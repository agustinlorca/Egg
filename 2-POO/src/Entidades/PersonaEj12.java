
package Entidades;
import java.util.Date;

public class PersonaEj12 {
    private String nonmbre;
    private Date fechaNacimiento;

    public PersonaEj12() {
    }

    public PersonaEj12(String nonmbre, Date fechaNacimiento) {
        this.nonmbre = nonmbre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNonmbre() {
        return nonmbre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNonmbre(String nonmbre) {
        this.nonmbre = nonmbre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
}
