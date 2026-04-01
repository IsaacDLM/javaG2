package herencia.empleados;

public class Main {
    public static void main(String[] args) {
        Programador programadorUno = new Programador("Isaac", "Java");

        System.out.println("Nombre :" + programadorUno.getNombre());
        System.out.println("Lenguaje:" + programadorUno.getLenguajeFav());
    }
}
