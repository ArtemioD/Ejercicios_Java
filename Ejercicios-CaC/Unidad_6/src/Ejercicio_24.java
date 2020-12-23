/*
Desarrollar un algoritmo que, dado un numero entero de entre 2 y 4
digitos, la computadora indique si es capicua. Ayuda: Detectar la cantidad
de cifras del numero. Si se ingresa como cadena, basta con saber la
longitud, luego extraer cada cifra con funciones de cadena y hacer las
respectivas comparaciones. Si se ingresa como entero, basta saber en
que rango de numeros esta, luego extraer cada cifra usando
descomposicion matematica y hacer las respectivas comparaciones.
Ejemplo: Ingresa 1881, debe imprimir “Es capicua”.
 */

import java.util.Scanner;

public class Ejercicio_24 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        String a;
        do {
            System.out.println("Ingrese un numero entero entre 2 y 4 digitos...");
            a = entrada.next();
        }while (!(a.length() >= 2 && a.length() <= 4));
        int num = Integer.parseInt(a);
        System.out.println(capicua(num));
    }

    private static String capicua(int a) {
        int num = a;
        int numeroInvertido = 0, resto;
        while (num != 0){
            resto = num % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            num /= 10;
        }
        if (numeroInvertido == a) {
            return "Es capicua.";
        }else {
            return "NO es capicua.";
        }
    }
}
