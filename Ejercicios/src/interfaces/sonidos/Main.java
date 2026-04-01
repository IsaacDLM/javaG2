package interfaces.sonidos;

public class Main {
    public static void main(String[] args) {
        Perro perroUno = new Perro();
        Gato gatoUno = new Gato();
        Timbre tiempreUno = new Timbre();

        perroUno.hacerRuido();
        gatoUno.hacerRuido();
        tiempreUno.hacerRuido();
    }
}
