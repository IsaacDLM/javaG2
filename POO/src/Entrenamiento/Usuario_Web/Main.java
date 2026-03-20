package Entrenamiento.Usuario_Web;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioUno =  new Usuario("correo@gmail.com", true);

        System.out.println("El estado del usuario es: " + usuarioUno.getEstado());
        usuarioUno.setEstado(false);
        System.out.println("El estado del usuario cambio a: " + usuarioUno.getEstado());

    }
}
