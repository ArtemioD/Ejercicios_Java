
/*
Crear un arreglo de n posiciones y llenarlo con nombres de personas.
 */

import java.util.Scanner;

public class Ejercicio_05 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres...");
        int can = entrada.nextInt();
        String[] array = new String[can];
        llenar(array);
    }

    private static void llenar(String[] array) {
        Scanner entr = new Scanner(System.in);
        System.out.println("Ingrese los nombres...");
        for (int i = 0; i < array.length; i++) {
            array [i] = entr.next();
        }
    }
}
