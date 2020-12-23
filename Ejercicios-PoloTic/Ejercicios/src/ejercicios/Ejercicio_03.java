/*
En tres vectores diferentes se guardan los datos de temperaturas máximas y
mínimas de 5 ciudades de Misiones. 

En el primer vector se guardan los nombres de las ciudades, 
en el segundo las temperaturas mínimas alcanzadas y 
en el tercero las temperaturas máximas alcanzadas en la última semana. 

Se necesita un programa que permita la carga de las ciudades, sus temperaturas
mínimas y máximas; además, deberá poder informar por pantalla cual fue la
ciudad con la temperatura más baja y cual con la temperatura más alta (dando
a conocer al mismo tiempo la cantidad de grados).
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String[] city = new String[5];
        double[] tem_MIN = new double[5];
        double[] tem_MAX = new double[5];
        int min = 0, max = 0;
        
        for (int i = 0; i < tem_MAX.length; i++) {
            System.out.println("Por favor, ingrese nombre de la Ciudad con su temperatura MINIMA y MAXIMA: ");
            city[i] = scanner.next();
            
            tem_MIN[i] = scanner.nextDouble();
            if (tem_MIN[i] < tem_MIN[min]) {
                min = i;
            }
            
            tem_MAX[i] = scanner.nextDouble(); 
            if (tem_MAX[i] > tem_MAX[max] ) {
                max = i;     
            }
        }
        System.out.println("Ciudad con la temperatura mas baja es: " + city[min] + " " + tem_MIN[min] + "°C");
        System.out.println("Ciudad con la temperatura mas alta es: " + city[max] + " " + tem_MAX[max] + "°C");
        
    }
    
}
