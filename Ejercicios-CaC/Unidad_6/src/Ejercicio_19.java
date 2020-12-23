/*
Array de 2 dimensiones. Una escuela tiene un total de 3 aulas con la
siguiente capacidad:
Identificador Aula Cantidad de Bancos del Aula
Azul 40
Verde 35
Amarillo 30
Sabiendo la cantidad de bancos de cada aula, el usuario debera ingresar
la cantidad de alumnos inscriptos para cursar tercer grado y el sistema
debera determinar que aula (Azul, Verde o Amarillo) es la indicada para la
cantidad ingresada. La escuela ya sabe que la maxima capacidad de sus
aulas es de 40 alumnos, por lo tanto, la cantidad de alumnos inscriptos
que ingresa el usuario siempre sera un numero menor o igual a 40. Se
espera que el aula asignada sea la que deje menos bancos libres.
 */

import java.util.Scanner;

public class Ejercicio_19 {
    public static void start() {
        int[][] matriz = new int[3][];
        matriz[0] = new int[30];
        matriz[1] = new int[35];
        matriz[2] = new int[40];
        alumnos(matriz);
    }

    private static void alumnos(int[][] a) {
        Scanner ent=new Scanner(System.in);
        int cant; String aula = "";
        do {
            System.out.println("Ingrese la cantidad de alumnos / de 1 a 40...");
            cant = ent.nextInt();
        } while (!(40 >= cant && cant > 0));
        int[] alumnos = new int[cant];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i].length >= alumnos.length && alumnos.length <= 30) {
                    aula = "amarillo.";
                }else if (a[i].length >= alumnos.length && alumnos.length <= 35) {
                    aula = "verde.";
                }else if (a[i].length >= alumnos.length && alumnos.length <= 40) {
                    aula = "azul.";
                }
            }
        }
        System.out.println("El aula es: " + aula);
    }
}
