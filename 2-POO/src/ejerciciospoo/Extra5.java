
package ejerciciospoo;

import java.util.Scanner;

/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un*/

public class Extra5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = meses[7];
        System.out.println("¡Adivine el mes secreto!");
        System.out.println("Introduzca el nombre del mes");
        String mes = leer.next().toLowerCase();
        while (!mes.equals(mesSecreto)){
            System.out.println("¡No acertaste!");
            System.out.println("Intente adivinar con otro mes");
            mes = leer.next().toLowerCase();
        }
        System.out.println("¡Acertaste! Bien hecho.");
    }
    
}
