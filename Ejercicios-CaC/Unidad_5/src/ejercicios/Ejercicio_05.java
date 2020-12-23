package ejercicios;

/*
Crea una funcion cantidadDeDivisores, que reciba un numero entero y
devuelva la cantidad de divisores (por ejemplo, para el numero 16, sus
divisores son 1, 2, 4, 8, 16, por lo que la respuesta deberia ser 5). Ayuda:
un numero es multiplo de otro cuando al dividir los numeros obtengo resto
0 (cero).
 */

import java.util.Scanner;

public class Ejercicio_05 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero..");
        int num = entrada.nextInt();
        System.out.println(cantidadDeDivisores(num));
    }

    private static int cantidadDeDivisores(int num) {
        int cont=0;
        for (int i=1;i<=num;i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        return cont;
    }
}
