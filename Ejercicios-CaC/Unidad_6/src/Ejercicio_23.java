/*
Desarrollar un algoritmo que, dado un numero de tres cifras, la
computadora muestre la suma de las cifras, sin realizar otra cuenta
auxiliar. Ayuda: Ingresar el numero como cadena, extraer cada posicion
de la cadena, convertirlas a numero y realizar la suma. Ejemplo: Ingresa
123, debe devolver 6.
 */

import java.util.Scanner;

public class Ejercicio_23 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el numero...");
        String cadena = entrada.next();
        convertir(cadena);
    }

    private static void convertir(String a) {
        int num = Integer.parseInt(a);
        int i, c, b = 0;
        for (i = 0; i < a.length(); i++){
            c = num % 10;
            b += c;
            num /= 10;
        }
        System.out.println("La suma es: " + b);
    }
}
