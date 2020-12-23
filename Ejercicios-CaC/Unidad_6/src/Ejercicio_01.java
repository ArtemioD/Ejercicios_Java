
//CreaR un array o arreglo unidimensional con un tamano de 5, asignale los
//valores numericos ingresados por teclado y muestralos por pantalla

import java.util.Scanner;

public class Ejercicio_01 {
    public static void start() {
        int[] array = new int[5];
        cargar(array);
        mostrar(array);
    }

    private static void mostrar(int[] array) {
        for (int i = 0; i < 5; i++) {
            System.out.println("En la posicion " + (i + 1) + ", valor: " + array[i]);
        }
    }

    private static void cargar(int[] array) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores para cargar array");
        for (int i = 0; i < 5; i++) {
            array[i] = entrada.nextInt();
        }
    }
}
