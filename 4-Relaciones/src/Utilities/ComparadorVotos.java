package Utilities;


import Entity.Voto;

import java.util.Comparator;

public class ComparadorVotos {

    public static Comparator<Voto> votoDesc = new Comparator<Voto>() {
        @Override
        public int compare(Voto v1, Voto v2) {
            
            return Integer.compare(v2.getAlumno().getVotos(), v1.getAlumno().getVotos());

        }
    };
}
