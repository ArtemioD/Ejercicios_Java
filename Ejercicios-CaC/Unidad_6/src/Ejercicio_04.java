
/*
CreaR un array unidimensional con un tamano de 10, inserta los valores
numericos que desees de la manera que quieras y muestra por pantalla
la media de valores (promedio) del array. Nota: puede utilizar el metodo
random de la Clase Math para generar numeros aleatorios al cargar el
array.
 */

import java.util.Scanner;

public class Ejercicio_04 {
    public static void start() {
        int tam = 10;
        int[] array = new int[tam];
        cargar(array);
        promedio(array);
    }

    private static void promedio(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double a = total / array.length;
        System.out.println("Promedio del array es: " + a);
    }

    private static int[] cargar(int[] array) {
        //Scanner entrada = new Scanner(System.in); // para cargar valores por teclado
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
            //System.out.println("Ingrese valores");
            //array[i] = entrada.nextInt();
        }
        return array;
    }
}
