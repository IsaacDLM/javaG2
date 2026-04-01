package herencia.electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Lavadora miLavadora = new Lavadora("Mabe", 8);

        System.out.println("Marca: " + miLavadora.getMarca());
        System.out.println("Carga: " + miLavadora.getKilosCarga());
    }
}
