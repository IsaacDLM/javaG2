package Entrenamiento.El_Videojuego;

public class Main {
    public static void main(String[] args) {
        Videojuego videojuego = new Videojuego();

        videojuego.setConsola("PC");
        videojuego.setTitulo("Counter Strike");
        videojuego.setPrecio(12.50);

        Videojuego videojuegoDos = new Videojuego();

        videojuegoDos.setConsola("play 5");
        videojuegoDos.setTitulo("GTA V");
        videojuegoDos.setPrecio(25.95);

        Videojuego videojuegoTres = new Videojuego();

        videojuegoTres.setConsola("NINTENDO");
        videojuegoTres.setTitulo("Mario Kart");
        videojuegoTres.setPrecio(95.99);

        System.out.println("El titulo del video juego es : " + videojuegoDos.getTitulo());
        System.out.println("El precio del video juego es : " + videojuegoDos.getPrecio());
    }
}
