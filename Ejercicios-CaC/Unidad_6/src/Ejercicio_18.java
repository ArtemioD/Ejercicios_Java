/*
Disenar un algoritmo que recorra las butacas de una sala de cine y
determine cuantas butacas desocupadas hay en la sala. Suponga que
inicialmente tiene un array (arreglo) con valores booleanos que si es
verdadero implica que esta ocupada y si es falso la butaca esta
desocupada. Tenga en cuenta que el array debera ser creado e
inicializado al principio del algoritmo.
 */

import java.util.Random;

public class Ejercicio_18 {
    public static void start() {
        int fila = 5;
        int colum = 9;
        boolean[][] matriz = new boolean[fila][colum];
        llenar(matriz);
        buscar(matriz);
    }

    private static void buscar(boolean[][] a) {
        int des = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == false) {
                    des++;
                }
            }
        }
        System.out.println("Hay " + des + " butacas desocupadas hay en la sala.");
    }

    private static boolean[][] llenar(boolean[][] a) {
        Random azar = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = azar.nextBoolean();
            }
        }
        return a;
    }
}
