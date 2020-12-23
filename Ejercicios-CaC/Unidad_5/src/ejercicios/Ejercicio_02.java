package ejercicios;

/*
Codifique un programa en Java que permita ingresar dos numeros. Se le
preguntara al usuario si dichos numeros quiere sumarlos o restarlos. Si el
usuario ingresa ‘S’ dichos numeros se sumaran; si ingresa ‘R’, se restara.
La suma y la resta de dichos numeros debe realizarse con dos funciones.
En el caso de la suma, dicho metodo recibira como parametros los dos
numeros ingresados y devolvera la suma de los dos numeros. En el caso
de la resta se procedera de la misma manera, pero el metodo devolvera
la resta de los mismos.
 */

import java.util.Scanner;

public class Ejercicio_02 {

    public static void ingresar() {
        int total = 0;
        char x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        do {
            System.out.println("Ingrese 'S' para sumar y 'R' para restar");
            x = entrada.next().charAt(0);
        } while (!(x == (char)83 || x == (char)115 || x == (char)82 || x == (char)114));
        if (x == (char)83 || x == (char)115) {
            total = sumar(a, b);
        } else {
            total = restar(a, b);
        }
        System.out.println(total);
    }

    private static int sumar(int a, int b) {
        return a+b;
    }

    private static int restar(int a, int b) {
        return a-b;
    }

}
