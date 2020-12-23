/*
Desarrollar un algoritmo que permita ingresar una cadena de texto. La
computadora muestra la cadena enteramente en mayusculas. Ejemplo:
Ingresa “Computadora”, debe devolver “COMPUTADORA”.
 */

import java.util.Scanner;

public class Ejercicio_20 {
    public static void start() {
        ingresar();
    }

    private static void ingresar() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Escribe algo para comenzar");
        String a = ent.nextLine();
        System.out.println(a.toUpperCase());
    }
}
