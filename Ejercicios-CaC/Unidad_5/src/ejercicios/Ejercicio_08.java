package ejercicios;

/*
Definir la funcion azar, que devuelva un numero entero aleatorio entre 0 y
un numero recibido como parametro, sin incluir a este ultimo. Ejemplo:
Se invoca azar(10) > devuelve un numero entre 0 y 9.
 */

import java.util.Scanner;

public class Ejercicio_08 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = entrada.nextInt();
        System.out.println(azar(num));
    }

    private static int azar(int a) {
        int x= (int) Math.floor(Math.random() * a);
        return x;
    }
}
