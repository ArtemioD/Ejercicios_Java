
/*
Llenar un vector con numeros enteros (numeros positivos o negativos).
Mostrar la cantidad de numeros positivos y la cantidad de numeros
negativos que hay en dicho arreglo.
 */

import java.util.Scanner;

public class Ejercicio_09 {
    public static void start() {
        int tam = 5;
        int[] array = new int[tam];
        llenar(array);
        mostrar(array);
    }

    private static void mostrar(int[] array) {
        int pos = 0, neg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            } else if (array[i] < 0){
                neg++;
            }
        }
        System.out.println("La cantidad de numeros positivos es: " + pos);
        System.out.println("La cantidad de numeros negativos es: " + neg);
    }

    private static int[] llenar(int[] array) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numeros positivos o negativos");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }
        return array;
    }
}
