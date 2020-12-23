package ejercicios;

/*
Escribir la funcion esVocal, que devuelva true o false segun si un
caracter recibido como parametro es vocal (contemplar mayusculas y
minusculas). Ejemplo: Se invoca esVocal(‘a’) > devuelve true.
 */

import java.util.Scanner;

public class Ejercicio_09 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char car = entrada.next().charAt(0);
        System.out.println(esVocal(car));
    }

    private static boolean esVocal(char a) {
        if (a == (char)97 || a == (char)65 || a == (char)101 || a == (char)69) {
            return true;
        } else if (a == (char)73 || a == (char)105 || a == (char)79 || a == (char)111) {
            return true;
        }else if (a == (char)85 || a == (char)117) {
            return true;
        } else {
            return false;
        }

    }
}
