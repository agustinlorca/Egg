package Entity;

public class Ahorcado {

    private String palabraBuscar[];
    private int letrasEncontradas = 0;
    private int maximosIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int maximosIntentos) {
        this.palabraBuscar = palabraBuscar;
        this.maximosIntentos = maximosIntentos;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getMaximosIntentos() {
        return maximosIntentos;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setMaximosIntentos(int maximosIntentos) {
        this.maximosIntentos = maximosIntentos;
    }
    

}
