package ejercicios;

/*
Crea una funcion mayorDeTres, que reciba tres numeros enteros y
devuelva el valor del mayor de ellos. Por ejemplo, para los numeros 5, 7
y 5, devolveria el valor 7
 */

import java.util.Scanner;

public class Ejercicio_06 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tres numeros enteros");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        System.out.println("El mayor es: " + mayorDeTres(num1, num2, num3));
    }

    private static int mayorDeTres(int a, int b, int c) {
        int mayor = Math.max(Math.max(a, b), c);
        return mayor;
    }
}
