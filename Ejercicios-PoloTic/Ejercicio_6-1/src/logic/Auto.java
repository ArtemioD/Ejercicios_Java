package logic;

public class Auto {
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private int cant_puertas;

    public Auto() {
    }

    public Auto(String color, String marca, String modelo, String patente, int cant_puertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }
    
    
            
    
}

