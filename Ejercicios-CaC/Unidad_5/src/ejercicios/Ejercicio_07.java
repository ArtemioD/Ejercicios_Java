package ejercicios;

/*
Escribir el procedimiento imprimirSimbolo, que imprima por consola n
veces un caracter en la misma linea. Tanto n como el caracter se reciben
como parametro. Ejemplo: Se invoca imprimirSimbolo(5,’#’) >
imprime “#####”.
 */

import java.util.Scanner;

public class Ejercicio_07 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de veses que quiere imprimir");
        int veses = entrada.nextInt();
        System.out.println("Ingrese el caracter");
        char carac = entrada.next().charAt(0);
        imprimirSimbolo(veses, carac);
    }

    private static void imprimirSimbolo(int veses,char carac) {
        for (int i = 1; i <= veses; i++) {
            System.out.print(carac);
        }
    }
}
