
/*
Desarrollar un algoritmo que permita mostrar un arreglo de caracteres de
atras para adelante. Ejemplo: Arreglo {‘A’,’V’,’A’,’J’}, la computadora
muestra: ‘J’ ‘A’ ‘V’ ‘A’
 */

import java.util.Scanner;

public class Ejercicio_03 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int tam = entrada.nextInt();
        char[] array = new char[tam];
        cargar(array,entrada);
        mostrar(array);
    }

    private static void mostrar(char[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);
    }

    private static char [] cargar(char[] array, Scanner z) {
        System.out.println("Ingrese caracteres para cargar el vector");
        for (int i = 0; i < array.length; i++) {
            array[i] = z.next().charAt(0);
        }
        return array;
    }
}
