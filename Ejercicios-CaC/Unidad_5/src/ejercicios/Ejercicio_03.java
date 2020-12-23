package ejercicios;

/*
Crea una funcion esPar que devuelva el valor logico true o false segun
si el numero que se indique como parametro es par o no lo es.
 */

import java.util.Scanner;

public class Ejercicio_03 {

    public static void impezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o no lo es:");
        int x = entrada.nextInt();
        System.out.println(esPar(x));
    }

    private static boolean esPar(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}
