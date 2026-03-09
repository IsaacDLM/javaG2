package interfaces;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo(){
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcuarArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando un circulo");
    }
}
