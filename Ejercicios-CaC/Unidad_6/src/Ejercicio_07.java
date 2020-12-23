
/*
Desarrollar un algoritmo que permita pedir al usuario un numero entero T
y otro M. La computadora crea un arreglo de enteros de T posiciones
cargado con los multiplos de M y lo muestra. Ejemplo: Se ingresa 4 y 6,
la computadora muestra: 0 6 12 18.
 */

import java.util.Scanner;

public class Ejercicio_07 {
    public static void start() {
        crear();
    }

    private static void cargar(int[] array, Scanner ent) {
        System.out.println("Ingrese un numero entero");
        int m = ent.nextInt();
        System.out.print("Los mltiplos de " + m + " son: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i * m;
            System.out.print(array [i] + ",");
        }
        System.out.println("\b" + ".");
    }

    private static void crear() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero enrero");
        int t = entrada.nextInt();
        int[] array = new int[t];
        cargar(array, entrada);
    }
}
