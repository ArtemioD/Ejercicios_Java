
/*
Desarrollar un algoritmo que permita mostrar un arreglo de enteros con
sus valores a la mitad. Ejemplo: Arreglo {1,2,3,4}, la computadora
muestra: 0.5 1.0 1.5 2.0.
 */

import java.util.Scanner;

public class Ejercicio_02 {
    public static void start() {
        Scanner entreda = new Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int tam = entreda.nextInt();
        int[] array = new int[tam];
        cargar(array);
        dividir(array);
    }

    private static void dividir(int[] array) {
        double x = 1.0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posicion " + (i + 1) + ", valor: " + (array[i] * x) / 2);
        }
    }

    private static int[] cargar(int[] array) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores para cargar array");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }
        return array;
    }
}
