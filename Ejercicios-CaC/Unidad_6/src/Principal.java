import java.util.Scanner;

public class Principal {
    private static final Scanner entrada = new Scanner(System.in);
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String RESET = "\033[0m";

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.print("Ingerese el numero de ejercicio: ");
            int ejercicio = entrada.nextInt();
            System.out.println(ANSI_BLUE + "\n******** Ejercicio " + ejercicio + " *******" + RESET);

            switch (ejercicio) {
                case 1:
                    Ejercicio_01.start(); break;
                case 2:
                    Ejercicio_02.start(); break;
                case 3:
                    Ejercicio_03.start(); break;
                case 4:
                    Ejercicio_04.start(); break;
                case 5:
                    Ejercicio_05.start(); break;
                case 6:
                    Ejercicio_06.start(); break;
                case 7:
                    Ejercicio_07.start(); break;
                case 8:
                    Ejercicio_08.start(); break;
                case 9:
                    Ejercicio_09.start(); break;
                case 10:
                    Ejercicio_10.start(); break;
                case 11:
                    Ejercicio_11.start(); break;
                case 12:
                    Ejercicio_12.start(); break;
                case 13:
                    Ejercicio_13.start(); break;
                case 14:
                    Ejercicio_14.start(); break;
                case 15:
                    Ejercicio_15.start(); break;
                case 16:
                    Ejercicio_16.start(); break;
                case 17:
                    Ejercicio_17.start(); break;
                case 18:
                    Ejercicio_18.start(); break;
                case 19:
                    Ejercicio_19.start(); break;
                case 20:
                    Ejercicio_20.start(); break;
                case 21:
                    Ejercicio_21.start(); break;
                case 22:
                    Ejercicio_22.start(); break;
                case 23:
                    Ejercicio_23.start(); break;
                case 24:
                    Ejercicio_24.start(); break;
                case 25:
                    Ejercicio_25.start(); break;
                case 26:
                    Ejercicio_26.start(); break;
                case 27:
                    Ejercicio_27.start(); break;
                case 28:
                    Ejercicio_28.start(); break;
                case 29:
                    Ejercicio_29.start(); break;
                case 30:
                    Ejercicio_30.start(); break;
            }
            System.out.println(ANSI_BLUE + "******* Fin ejercicio *******\n" + RESET);
        }
    }
}
