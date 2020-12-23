/*
Crear un programa que pida su nombre al usuario y lo escriba al reves (de
la ultima letra a la primera: a partir de “Nacho” escribiria “ohcaN”).
 */

import java.util.Scanner;

public class Ejercicio_26 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        alReves(nombre);
    }

    private static void alReves(String a) {
        char[] nombre = a.toCharArray();
        for (int i = nombre.length - 1; i >= 0; i--){
            System.out.print(nombre[i]);
        }
    }
}
