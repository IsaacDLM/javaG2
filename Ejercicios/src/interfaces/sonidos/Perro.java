package interfaces.sonidos;

public class Perro implements Sonido{

    @Override
    public void hacerRuido() {
        System.out.println("El perro hace: !Guau, guau!");
    }
}
