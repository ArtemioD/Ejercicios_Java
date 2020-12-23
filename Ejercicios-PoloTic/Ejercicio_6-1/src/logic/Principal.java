/*
**********  Ejercicio Nº1: Getters y Settersa)  **********
a.) Una concesionaria de autos necesita del siguiente modelado de 
objetos para administrar los autos que dispone para la venta:

•Crear unaclase llamada Auto,que teng a los siguientes atributos:
    color,marca,modelo,patente, cantidad de puertas 
    (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
•Crear 3 objetos Auto utilizando parámetros
•Crear 1 objeto Auto sinparámetros.
•Mostrar por pantalla la marca, modelo y patente de los 3 autos creados con parámetros.
•Intentar obtener la marca del auto creado sin parámetros. 
    ¿Se obtiene algún valor? De ser así... ¿Qué valor se obtiene?


b.)Una mueblería de muebles de algarrobo necesita del siguiente modelado 
de objetos para administrar los datos de sus muebles que dispone para la venta:

•Crear una clase llamada Mueble que tenga los siguientes atributos: nombre, 
    alto, ancho, material,cantidad.
•Crear 3 muebles utilizandoparámetros.
•Mostrar por pantalla el nombre y el material de los 3 muebles.
•Colocar “Madera” como material de los 3 mueblescreados.
•Mostrar nuevamente por pantalla el nombre y el material de los 3 muebles 
que fueron cambiados.

*/


package logic;

public class Principal {
    public static void main(String[] args) {
        //ejercicio_A();
        ejercicio_B();
        
       
    }
    
    private static void ejercicio_A() {
        Auto auto1 = new Auto("Rojo", "Ford", "Mustang", "15-RT-85", 2);
        Auto auto2 = new Auto("Blanco", "Ford", "Falcon", "55-FG-99", 4);
        Auto auto3 = new Auto("Verde", "BMW", "X-5", "05-TP-51", 5);
        
        Auto auto = new Auto();
        
        System.out.println("Marca: " + auto1.getModelo() + ", Modelo: " + auto1.getModelo() + ", Patente: " + auto1.getPatente());
        System.out.println("Marca: " + auto2.getModelo() + ", Modelo: " + auto2.getModelo() + ", Patente: " + auto2.getPatente());
        System.out.println("Marca: " + auto3.getModelo() + ", Modelo: " + auto3.getModelo() + ", Patente: " + auto3.getPatente());
        
        System.out.println("Marca: " + auto.getModelo() + ", Modelo: " + auto.getModelo() + ", Patente: " + auto.getPatente());
    }

    private static void ejercicio_B() {
        
        Mueble mueble1 = new Mueble("Mesa",25, 10.35, "Herro", 5);
        Mueble mueble2 = new Mueble("Silla",25, 10.35, "Herro y Madera", 5);
        Mueble mueble3 = new Mueble("Cama",25, 10.35, "Herro Dulce", 5);
        
        System.out.println("Nombre: " + mueble1.getNombre() + ", Material: " + mueble1.getMaterial());
        System.out.println("Nombre: " + mueble2.getNombre() + ", Material: " + mueble2.getMaterial());
        System.out.println("Nombre: " + mueble2.getNombre() + ", Material: " + mueble2.getMaterial());
        
        mueble1.setMaterial("Madera");
        mueble2.setMaterial("Madera");
        mueble3.setMaterial("Madera");
        
        System.out.println("***************************************");
        
        System.out.println("Nombre: " + mueble1.getNombre() + ", Material: " + mueble1.getMaterial());
        System.out.println("Nombre: " + mueble2.getNombre() + ", Material: " + mueble2.getMaterial());
        System.out.println("Nombre: " + mueble2.getNombre() + ", Material: " + mueble2.getMaterial());
        
    }
    
}
