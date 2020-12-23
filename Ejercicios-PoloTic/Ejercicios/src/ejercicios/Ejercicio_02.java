package ejercicios;

import java.util.Scanner;

/*
Realozar un programa que muestre por pantalla palabras que sean ingresadas por 
teclado hasta que se ingrese la palabra "salir".
*/

public class Ejercicio_02 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        boolean bandera = true;
        
        while (bandera == true) {
            System.out.println("Ingrese una palabra: ");
            palabra  = entrada.next();
            if (palabra.equalsIgnoreCase("salir")) {
                bandera = false;
            }else{
                System.out.println(palabra);
            }
        }
        
    }
    
}
