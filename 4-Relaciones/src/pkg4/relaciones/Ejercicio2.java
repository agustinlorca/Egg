package pkg4.relaciones;

import Entity.Juego;
import Entity.Jugador;
import Entity.Revolver;
import Service.RuletaService;
import java.util.ArrayList;

/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.*/
public class Ejercicio2 {

    public static void main(String[] args) {
        RuletaService rs = new RuletaService();
        ArrayList<Jugador> jugadores = new ArrayList();
        
        //Establecemos la posicion actual y posicicon de agua en el revolver
        Revolver revolver = rs.llenarRevolver();
        
        //
        Juego juego1 = rs.llenarJuego(jugadores, revolver);
        rs.ronda(juego1);
        
    }
}
