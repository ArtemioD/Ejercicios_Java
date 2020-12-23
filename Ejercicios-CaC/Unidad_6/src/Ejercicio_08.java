
/*
Desarrollar un algoritmo que permita ingresar 5 numeros pertenecientes
al arreglo A y otros 5 numeros pertenecientes al arreglo B. La
computadora crea y muestra un arreglo C, donde cada posicion es el
resultado de la suma del numero en la misma posicion en el arreglo A con
el numero en la misma posicion en el arreglo B. Ejemplo: Se ingresa 1 2
3 4 5 y 4 7 1 3 6 la computadora muestra: 5 9 4 7 11.
 */

import java.util.Scanner;

public class Ejercicio_08 {
    public static void start() {
        int tam = 5;
        int[] A = new int[tam];
        int[] B = new int[tam];
        cargar(A);
        cargar(B);
        sumar(A, B);
    }

    private static void sumar(int[] a,int[] b) {
        int[] C = new int[a.length];
        System.out.print("Array 'C' es: ");
        for (int i = 0; i <a.length; i++) {
            C[i] = a[i] + b[i];
            System.out.print(C[i] + ",");
        }
        System.out.println("\b" + ".");
    }

    public static int[] cargar(int[] array) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores para array");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }
        return array;
    }
}
