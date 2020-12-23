
/*
Almacenar en un arreglo de n posiciones nombres de paises. Implementar
una opcion que al digitar una posicion muestre el dato que contiene
 */

import java.util.Scanner;

public class Ejercicio_10 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrede cantidad de pocisiones para array");
        int n = entrada.nextInt();
        String[] array = new String[n];
        llenar(array);
        mostrar(array);
    }

    public static void mostrar(String[] A) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese posicion a buscar");
        int pos = ent.nextInt();
        for (int i = 0; i < A.length; i++) {
            if (i == pos - 1) {
                System.out.println(A[i]);
            }
        }
    }

    public static String[] llenar(String[] A) {
        Scanner ent=new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Ingrese nombre del pais");
            A[i] = ent.nextLine();
        }
        return A;
    }
}
