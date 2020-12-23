/*
********* Ejercicio Nº 2: Objetos + Arreglos (Vectores y matrices) *********
a)Una casa de videojuegos necesitael siguiente modelado de objetos para 
administrar los datos de sus juegosque dispone para la venta:

•Crear una clase llamada VideoJuego, que tenga los siguientes atributos: 
    codigo, titulo, consola, cantidadJugadores, categoría (tener en cuenta 
    todos sus atributos, constructores , métodos getters y setters).
•Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. 
    Crear 5 videojuegos y guardarlos en el vector.
•Recorrer el vector creado y mostrar por pantalla el titulo, 
    consola y cantidad de jugadores de los videojuegos almacenados.
•Cambiar  el  nombre  y  la  cantidad  de  jugadores  de  dos  videojuegos. 
    Mostrar  por  pantalla  los  datos  de  todos  los  videojuegos  luego  del cambio.
•Recorrer el vector y mostrar por pantalla únicamente a los videojuegos 
    que sean de la consola “Nintendo 64”
*/

package logic;

public class Principal {

    public static void main(String[] args) {
        
        VideoJuego juegos[] = new VideoJuego[5];
        
        VideoJuego videoJuego1 = new VideoJuego("25", "Matar A Todos", "Nintendo 64", 2, "Matador");
        VideoJuego videoJuego2 = new VideoJuego("28", "Tetris", "PlayStation 4", 2, "Mata");
        VideoJuego videoJuego3 = new VideoJuego("29", "Pong", " Nintendo", 2, "Matador");
        VideoJuego videoJuego4 = new VideoJuego("38", "Pic-Man", " Wii", 2, "Matador");  
        VideoJuego videoJuego5 = new VideoJuego("8", "Space Invaders", " Xbox", 2, "Matador");
        
        juegos[0] = videoJuego1;
        juegos[1] = videoJuego2;
        juegos[2] = videoJuego3;
        juegos[3] = videoJuego4;
        juegos[4] = videoJuego5;
        
        for(VideoJuego a: juegos) {
            System.out.println("Titulo: " + a.getTitulo() + ";-------- Cantidad de jugadores: " + a.getCantidadJugadores());
            a.setTitulo("Tetris");
            a.setCantidadJugadores(10);
        }
        
        System.out.println("********* cambiamos ************");
        
        for(VideoJuego a: juegos) {
            System.out.println("Titulo: " + a.getTitulo() + ";--------- Cantidad de jugadores: " + a.getCantidadJugadores());
            
        }
        
        System.out.println("******* solo Nintendo 64");
        
        for(VideoJuego a: juegos) {
            if ("Nintendo 64".equals(a.getConsols()))
            System.out.println(a.getConsols());   
        }
        
        
        
    }
    
}
