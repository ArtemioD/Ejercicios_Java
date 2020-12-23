
/*
Crear un arreglo de n posiciones y llenarlo con los numeros que el usuario
desee y luego busque en el array un numero ingresado por teclado.
 */

import java.util.Scanner;

public class Ejercicio_06 {
    public static void start() {
        Scanner entreda = new Scanner(System.in);
        System.out.println("Ingrese el tamano del array...");
        int tam = entreda.nextInt();
        int[] array = new int[tam];
        llenar(array);
        buscar(array);
    }
    private static void buscar(int[] array) {
        Scanner entrada = new Scanner(System.in);
        String posicion = "";
        System.out.println("Ingrese el numero a buscar...");
        int num = entrada.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                posicion += (i + 1) + ",";
            }
        }
        if (posicion.equals("")) {
            System.out.println("Valor no encontrado.");
        } else {
            System.out.println("El valor buscado esta en la posicion: " + posicion + "\b" + ".");
        }
    }

    private static int[] llenar(int[] array) {
        Scanner entr = new Scanner(System.in);
        System.out.println("Ingrese los valores..");
        for (int i = 0; i < array.length; i++) {
            array[i] = entr.nextInt();
        }
        return array;
    }
}
