
/*
Buscar los dos mayores de un array de N datos.
 */

import java.util.Scanner;

public class Ejercicio_13 {
    public static void start() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int tam = ent.nextInt();
        int[] array = new int[tam];
        cargar(array);
        buscar(array);
    }

    private static void buscar(int[] A) {
        int max1 = 0, max2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            }else if (A[i] > max2 && A[i] != max1) {
                max2 = A[i];
            }
        }
        System.out.println("El mayor es: " + max1);
        System.out.println("El segundo mayor es: " + max2);
    }

    private static int[] cargar(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 100) + 1;
        }
        return A;
    }
}
