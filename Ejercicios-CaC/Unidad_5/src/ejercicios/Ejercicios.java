package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    private static Scanner entrada = new Scanner(System.in);
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingerese el numero de ejercicio: ");
            int ejercicio = entrada.nextInt();
            System.out.println(ANSI_BLUE + "\n******** Ejercicio " + ejercicio + " *******" + RESET);

            switch (ejercicio) {
                case 1:
                    Ejercicio_01.hola(); break;
                case 2:
                    Ejercicio_02.ingresar(); break;
                case 3:
                    Ejercicio_03.impezar(); break;
                case 4:
                    Ejercicio_04.empezar(); break;
                case 5:
                    Ejercicio_05.empezar(); break;
                case 6:
                    Ejercicio_06.empezar(); break;
                case 7:
                    Ejercicio_07.empezar(); break;
                case 8:
                    Ejercicio_08.empezar(); break;
                case 9:
                    Ejercicio_09.empezar(); break;
                case 10:
                    Ejercicio_10.empezar(); break;
            }
            System.out.println(ANSI_BLUE + "******* Fin ejercicio *******\n" + RESET);
        }
    }
}
