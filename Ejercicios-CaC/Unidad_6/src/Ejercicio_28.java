/*
Crear un programa que pida una frase al usuario y diga cuantas palabras
contiene (pista: puedes contar los espacios, prestando atencion en que
no esten repetidos).
 */

import java.util.Scanner;

public class Ejercicio_28 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = entrada.nextLine();
        System.out.println(contar(frase));
    }

    private static int contar(String a) {
        char[] array = a.toCharArray();
        int cont = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (char)32 && array[i + 1] != (char)32){
                cont++;
            }
        }
        return cont;
    }
}
