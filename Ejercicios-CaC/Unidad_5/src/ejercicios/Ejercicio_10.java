package ejercicios;

/*
Escribir la funcion obtenerMesEnTexto, que devuelva una cadena que
representa un mes expresado en letras segun un numero entero entre 1
y 12 recibido como parametro. Si el parametro no es valido, devolver una
cadena vacia. Ejemplo: Se invoca obtenerMesEnTexto(4) > devuelve
“Abril”
 */

import java.util.Scanner;

public class Ejercicio_10 {
    public static void empezar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entero entre 1 y 12 ");
        int num = entrada.nextInt();
        System.out.println(obtenerMesEnTexto(num));
    }

    private static String obtenerMesEnTexto(int a) {

        switch (a) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Error, mes no existe !";
        }

    }
}
