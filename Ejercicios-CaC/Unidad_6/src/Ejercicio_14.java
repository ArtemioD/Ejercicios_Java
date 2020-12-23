
/*
Buscar el valor mayor de un array de N datos utilizando un bucle for
mejorado.
 */

import java.util.Scanner;

public class Ejercicio_14 {
    public static void start() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese tamano del array");
        int tam = ent.nextInt();
        int[] array = new int[tam];
        cargar(array);
        buscar(array);
    }

    private static void buscar(int[] A) {
        int max = 0;
        for (int i: A) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("El maximo es: " + max);
    }

    private static int[] cargar(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100) + 1;
        }
        return A;
    }
}
