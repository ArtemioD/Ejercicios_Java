/*
Crear un programa que pida al usuario su nombre y apellidos y los
muestre con las mayusculas y minusculas correctas (apareceran en
mayusculas la primera letra y la que haya tras cada espacio;
las demas apareceran en minusculas. Por ejemplo, si introduce
“nAcho cabaNes”, es escribira “Nacho Cabanes”)
 */

import java.util.Scanner;

public class Ejercicio_29 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido...");
        String nombre = entrada.nextLine();
        dotos(nombre);
    }

    private static void dotos(String a) {
        String s = a.toLowerCase();
        char[] caracter  =s.toCharArray();
        caracter[0] = Character.toUpperCase(caracter[0]);
        for(int i = 0; i < caracter.length; i++) {
            if (caracter[i] == (char)32 && caracter[i + 1] != (char)32) {
                caracter[i + 1] = Character.toUpperCase(caracter[i + 1]);
            }
            System.out.print(caracter[i]);
        }
    }
}
