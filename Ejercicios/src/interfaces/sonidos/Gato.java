package interfaces.sonidos;

public class Gato implements Sonido{
    
    @Override
    public void hacerRuido (){
        System.out.println("El gato hace: Miau!! Miau!!");
    }
}
