package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    private static final Scanner entrada = new Scanner(System.in);
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String RESET = "\033[0m";
    
    public static void main(String[] args) {
        int ejercicios_total = 10;
        
        for (int i = 0; i < ejercicios_total; i++) {
            System.out.print("Ingerese el numero de ejercicio: ");
            int ejercicio = entrada.nextInt();
            System.out.println(ANSI_BLUE + "\n******** Ejercicio " + ejercicio + " *******" + RESET);
            
            switch(ejercicio) {
                case 1:
                    Ejercicio_01.start(); break;
                case 2:
                    Ejercicio_02.start(); break;
                case 3:
                    Ejercicio_02.start(); break;
                    
            }
            System.out.println(ANSI_BLUE + "******* Fin ejercicio *******\n" + RESET);
        }
            
        
    }
    
}
