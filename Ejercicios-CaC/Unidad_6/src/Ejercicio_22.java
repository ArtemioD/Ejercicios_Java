/*
Desarrollar un algoritmo que, dada una cadena, la computadora la
muestre en formato oracion, es decir, con la primera letra en mayusculas,
seguido del resto de la cadena en minusculas y el agregado de un punto
final. Ejemplo: Ingresa “uN aUtO aZul”, debe devolver “Un auto azul.”.
 */

import java.util.Scanner;

public class Ejercicio_22 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oracion");
        String a = entrada.nextLine();
        recibido(a);
    }

    private static void recibido(String a) {
        String prim = a.substring(0, 1);
        String seg = a.substring(1);
        System.out.println(prim.toUpperCase() + seg.toLowerCase() + ".");
    }
}
