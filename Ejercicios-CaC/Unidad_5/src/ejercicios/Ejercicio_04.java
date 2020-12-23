package ejercicios;

/*
Crea una funcion cubo, que reciba un numero y lo devuelva elevado al
cubo
 */

import java.util.Scanner;

public class Ejercicio_04 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();
        System.out.println(cubo(num));
    }

    private static int cubo(int num) {
        int a = num * num * num;
        return a;
    }
}
