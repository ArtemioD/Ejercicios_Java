
/*
Llenar una matriz de 3 x 3 (array de 2 dimensiones) completamente de
numeros aleatorios entre 0 y 9.
 */

public class Ejercicio_16 {
    public static void start() {
        int tam = 3;
        int[][] matriz = new int[tam][tam];
        llenar(matriz);
        mostrar(matriz);
    }

    private static void mostrar(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Dimension " + (i + 1) + " contiene: ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println("\b\b.");
        }
    }

    private static int[][] llenar(int[][] a) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random() * 10);
            }
        }
        return a;
    }
}
