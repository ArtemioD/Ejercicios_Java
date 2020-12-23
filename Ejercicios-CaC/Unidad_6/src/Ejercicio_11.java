
/*
Cargar un vector con numeros aleatorios y poner en blanco una posicion
determinada por el usuario.
 */

import java.util.Scanner;

public class Ejercicio_11 {
    public static void start() {
        Scanner entr = new Scanner(System.in);
        System.out.println("Ingrese el tamano de array");
        int tam = entr.nextInt();
        int[] array=new int[tam];
        cargar(array);
        blanco(array);
    }

    private static void blanco(int[] a) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese la posicion a limpiar");
        int pos = ent.nextInt();
        System.out.print("Array antes: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nArray despues: ");
        for (int i = 0; i < a.length; i++) {
            if (i == pos - 1) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }

    private static int[] cargar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100) +1;
        }
        return a;
    }
}
