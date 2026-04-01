import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socios [] socios = new Socios[3];

        socios[0] = new Socios("z7342", "Juan Perez", "25-12-1994");
        socios[1] = new Socios("k8482", "Carlo Magno", "18-10-1957");
        socios[2] = new Socios("w9229", "Alfonsa Lorenzo", "25-03-2005");

        Arrays.sort(socios);

        System.out.println("Lista de socios: ");
        for (int i = 0; i < socios.length; i++) {
            socios[i].mostrarInfo();
        }
    }
}