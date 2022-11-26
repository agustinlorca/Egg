package ejerciciospoo;

/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Instanciamos dos arreglos de tipo vector.
        float arregloA[] = new float[50];
        float arregloB[] = new float[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = (float) Math.random() * 99;
            System.out.print("["+arregloA[i] + "]");
        }
        System.out.println("");

        // ordenamos arreglo en orden ascendente (de menor a mayor).
        Arrays.sort(arregloA, 0, 49);

        for (int i = 0; i < 20; i++) {
            // rellenamos los primeros 10 lugares con los primeros numeros del arreglo A.
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = (float) 0.5;
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("["+arregloA[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("["+arregloB[i] + "]");
        }
        System.out.println("");
    }

}
