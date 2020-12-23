/*
Crear una funcion iniciales, que devuelva una cadena formada por las
iniciales de la frase que se indique como parametro (primera letra y la letra
que haya tras cada espacio; por ejemplo, para “Juan Perez” devolveria
“JP”).
 */

import java.util.Scanner;

public class Ejercicio_25 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase...");
        String a = entrada.nextLine();
        System.out.println(iniciales(a));
    }

    private static String iniciales(String a) {
        String b = a.toUpperCase();
        char[] carac = b.toCharArray();
        char[] letra = new char[a.length()];
        letra[0] = carac[0];
        int j = 1;
        for (int i = 0; i < carac.length; i++) {
            if (carac[i] == ' ') {
                letra[j] = carac[i + 1];
                j++;
            }
        }
        String tic = new String(letra);
        return tic.trim();
    }
}
