
package Utilities;

import Entity.Pais;

import java.util.Comparator;


public class ComparadorPais {
    
     public static Comparator<Pais> paisesAsc = new Comparator <Pais>(){
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getPais().compareTo(p2.getPais());
        }  
    };
}
