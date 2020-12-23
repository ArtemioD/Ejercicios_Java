/*
Ordenamiento tipo Burbuja. Escribir un programa para realizar el
ordenamiento de un vector de 5 numeros enteros. El usuario ingresa los
numeros que el desea, cree un vector para guardar temporalmente dichos
datos y luego realice el ordenamiento del mismo a traves del metodo de
ordenamiento tipo burbuja.
 */

import java.util.Scanner;

public class Ejercicio_30 {
    public static void start() {
        int num = 5;
        int[] array = new int[num];
        llenar(array);
        burbuja(array);
    }

    private static void burbuja(int[] a) {
        System.out.print("Array antes: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j + 1] < a[j]) {
                    int aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
        System.out.print("\nArray despues: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int[] llenar(int[] a) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros enteros...");
        for (int i = 0; i <a.length; i++){
            a[i] = entrada.nextInt();
        }
        return a;
    }
}
