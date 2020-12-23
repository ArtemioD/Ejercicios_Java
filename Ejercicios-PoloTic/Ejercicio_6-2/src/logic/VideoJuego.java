package logic;

public class VideoJuego {
    private String codigo;
    private String titulo;
    private String consols;
    private int cantidadJugadores;
    private String categoría;

    public VideoJuego() {
    }

    public VideoJuego(String codigo, String titulo, String consols, int cantidadJugadores, String categoría) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consols = consols;
        this.cantidadJugadores = cantidadJugadores;
        this.categoría = categoría;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsols() {
        return consols;
    }

    public void setConsols(String consols) {
        this.consols = consols;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
    
    
}
