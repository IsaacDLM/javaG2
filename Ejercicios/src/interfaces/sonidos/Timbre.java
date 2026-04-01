package interfaces.sonidos;

public class Timbre implements Sonido{

    @Override
    public void hacerRuido(){
        System.out.println("El timbre hace: Ding!! Dong!!");
    }
}
