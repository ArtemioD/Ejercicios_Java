/*
Crear un array o arreglo unidimensional donde tu le indiques el tamano
por teclado y crear una funcion que rellene el array o arreglo con los
multiplos de un numero pedido por teclado. Por ejemplo, si defino un array
de tamano 5 y elijo un 3 en la funcion,
el array contendra 3, 6, 9, 12, 15. Mostrarlos por pantalla usando otra
funcion distinta.
 */

import java.util.Scanner;

public class Ejercicio_12 {
    public static void start() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Indique el tamano del array");
        int tam = ent.nextInt();
        int[] array = new int[tam];
        cargar(array);
        mostrar(array);
    }

    private static void mostrar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("\b\b.");
    }

    private static int[] cargar(int[] a) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = ent.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1) * num;
        }
        System.out.print("Los multiplos de " + num + " son: ");
        return a;
    }
}
