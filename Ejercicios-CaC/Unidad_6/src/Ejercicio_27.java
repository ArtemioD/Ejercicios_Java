/*
Crear un programa que pida su nombre al usuario y diga cuantas vocales
y consonantes contiene (por ejemplo, “Aurora” tiene 4 vocales y 2
consonantes).
 */

import java.util.Scanner;

public class Ejercicio_27 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre...");
        String nombre = entrada.nextLine();
        lerras(nombre);
    }

    private static void lerras(String a) {
        String b = a.toLowerCase();
        char[] c = b.toCharArray();
        int vocal = 0, conson = 0;
        for (int i = 0; i <a.length(); i++) {
            if (c[i] == (char)111 || c[i] == (char)97 || c[i] == (char)105) {
                vocal++;
            }else if (c[i] == (char)101 || c[i] == (char)117) {
                vocal++;
            }else {
                conson++;
            }
        }
        System.out.println("\"" + a + "\"" + " tiene " + vocal + " vocales y " + conson + " consonantes.");
    }
}
