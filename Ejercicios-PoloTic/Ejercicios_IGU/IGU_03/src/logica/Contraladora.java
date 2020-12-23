package logica;

public class Contraladora {
    
    String[] array = new String[5];
    int cont = 0;
    
    public void cargarNombres(String nombre) {
      
        //for (int i = x; i < array.length; i++) {
          if(array[cont] == null) {
              array[cont] = nombre;
              cont += 1;
          }   
        //}  
    }

    public boolean buscarNombres(String nombre) {
        
        boolean si_no = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(nombre)) {
                si_no = true;  
            }  
        }
        return si_no;
    }  
}
