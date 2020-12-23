
/*
Escribir un programa en Java para realizar la busqueda del nombre de un
cliente en un vector que contiene 5 clientes en total. El cliente a buscar
sera ingresado por pantalla por el usuario. El algoritmo debera devolver,
en caso de que ese nombre exista, la posicion en donde se encuentra
dicho cliente dentro del vector.
 */

import java.util.Scanner;

public class Ejercicio_15 {
    public static void start() {
        String[] array = {"Jose", "Margarita", "Diego", "Alma", "Ruben"};
        buscar(array);
    }

    private static void buscar(String[] A) {
        Scanner entrada = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Ingrese el nombre a buscar");
        String nombre = entrada.next();
        for (int i = 0; i < A.length; i++) {
            if (A[i].equalsIgnoreCase(nombre)) {
                posicion = i + 1;
                i = A.length;
            }
        }
        if (posicion == 0) {
            System.out.println("El cliente no encontrado.");
        }else {
            System.out.println("El cliente esta en la posicion: " + posicion);
        }
    }
}
