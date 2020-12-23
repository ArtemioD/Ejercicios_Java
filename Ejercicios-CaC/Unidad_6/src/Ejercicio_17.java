
/*
Crear una matriz n x n y llenarla con los numeros que el usuario desee.
Sume todos los numeros que componga la columna 1 y muestre el
resultado por pantalla
 */

import java.util.Scanner;

public class Ejercicio_17 {
    public static void start() {
        Scanner ent=new Scanner(System.in);
        System.out.println("Ingrese el tamano para array");
        int tam=ent.nextInt();
        int[][] matriz = new int[tam][tam];
        llenar(matriz);
        mostrar(matriz);
    }

    private static void mostrar(int[][] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Dimension " + (i + 1) + " contiene: ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println("\b\b.");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma += a[i][j];
                j = a.length;
            }
        }
        System.out.println("La suma es: " + suma);
    }

    private static int[][] llenar(int[][] a) {
        Scanner entr = new Scanner(System.in);
        System.out.println("Ingrese los datos para llenar array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = entr.nextInt();
            }
        }
        return a;
    }
}
