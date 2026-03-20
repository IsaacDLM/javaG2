package Entrenamiento.El_Videojuego;

public class Videojuego {
    private String titulo;
    private String consola;
    private double precio;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConsola(String consola){
        this.consola = consola;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public double getPrecio(){
        return precio;
    }
}
