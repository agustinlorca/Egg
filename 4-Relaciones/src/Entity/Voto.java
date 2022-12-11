
package Entity;

import java.util.ArrayList;


public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> listaVotos;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> listaVotos) {
        this.alumno = alumno;
        this.listaVotos = listaVotos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public ArrayList<Alumno> getListaVotos() {
        return listaVotos;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setListaVotos(ArrayList<Alumno> listaVotos) {
        this.listaVotos = listaVotos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", listaVotos=" + listaVotos + '}';
    }
  
}
