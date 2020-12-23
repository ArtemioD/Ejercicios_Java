package ejercicios;

import java.util.Scanner;

/*
Realizar un programa que permita intercambiar el valor de dos variables.
Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
un valor a una variable se sobrescribe el valor anterior.
*/

public class Ejercicio_01 {
    public static void start() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrece primer numero : ");
        int var1 = entrada.nextInt();
        System.out.print("Ingrece el segundo numero: ");
        int var2 = entrada.nextInt();
        
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        
        System.out.println("var1 = " + var1 + "\nvar2 = " + var2);
        
    }
    
}
