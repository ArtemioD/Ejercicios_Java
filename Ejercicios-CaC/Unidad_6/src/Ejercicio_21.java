/*
Desarrollar un algoritmo que permita ingresar tres cadenas de texto. La
computadora muestra una cadena completa que representa a las tres
ingresadas en orden inverso, separadas por un espacio. Se debe informar
la longitud de la cadena resultante. Ejemplo: Ingresa “Estoy”,
“aprendiendo” y “programacion”, debe devolver “programacion
aprendiendo Estoy” con longitud 30.
 */

import java.util.Scanner;

public class Ejercicio_21 {
    public static void start() {
        String[] array = new String[3];
        cadena(array);
        modificar(array);
    }

    private static void modificar(String[] a) {
        String longitud = "";
        System.out.print("\nModificado: ");
        for (int i = a.length - 1; i >= 0; i--) {
            longitud += a[i] + " ";
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCon longitud: " + (longitud.length() - 1));
    }

    private static String[] cadena(String[] a) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.println("Ingrese una cadenas de texto");
            a[i] = entrada.next();
        }
        System.out.print("Resibido: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return a;
    }
}
