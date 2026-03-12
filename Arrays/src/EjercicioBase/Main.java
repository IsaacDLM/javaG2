package EjercicioBase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int[] sueldos = new int[0];
        int sueldo;

        do {
            System.out.println("Introduzca el sueldo de cada encuestado y escriba -1 para finalizar: ");
            sueldo = sc.nextInt();

            if (sueldo > 0) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[sueldos.length - 1] = sueldo;
            } else if (sueldo < -1) {
                System.out.println("Sueldo no valido");
            }
        } while (sueldo != -1);

        if (sueldos.length == 0) {
            System.out.println("No se han introducido sueldos. Adios!");
        }else {
            do {
                System.out.println("\n------ MENU ------");
                System.out.println("1. Sueldos ordenados de forma decreciente");
                System.out.println("2. Sueldo maximo y minimo");
                System.out.println("3. Media de sueldos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: \n");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        int[] sueldosParaOrdenar = new int[sueldos.length];
                        for (int i = 0; i < sueldos.length; i++) {
                            sueldosParaOrdenar[i] = sueldos[i];
                        }
                        ordenarDecreciente(sueldosParaOrdenar);

                        for (int i = 0; i < sueldosParaOrdenar.length; i++) {
                            System.out.println((i + 1) + ". " + sueldosParaOrdenar[i] + "€");
                        }
                        break;

                    case 2:
                        System.out.println("Sueldo Maximo: " + calcularMaximo(sueldos) + "€");
                        System.out.println("Sueldo Minimo: " + calcularMinimo(sueldos) + "€" + "\n");
                        break;

                    case 3:
                        System.out.println("La media de los sueldos es: " + calcularMedia(sueldos) + "\n");
                        break;

                    case 4:
                        System.out.println("\nHasta pronto");
                        break;

                    default:
                        System.out.println("Opcion no valida, intentelo de nuevo");
                }
            } while (opcion != 4);
        }
    }
    public static void ordenarDecreciente(int tabla[]) {
        for (int i = 0; i < tabla.length - 1; i++) {
            int indiceMax = i;
            for (int j = i + 1; j < tabla.length; j++) {
                if (tabla[j] > tabla[indiceMax]) {
                    indiceMax = j;
                }
            }
            int almacenTemp = tabla[i];
            tabla[i] = tabla[indiceMax];
            tabla[indiceMax] = almacenTemp;
        }
    }
    public static int calcularMaximo(int tabla[]) {
        int maximo = 0;

        if (tabla.length > 0) {
            maximo = tabla[0];
            for (int i = 1; i < tabla.length; i++) {
                if (tabla[i] > maximo) {
                    maximo = tabla[i];
                }
            }
        }
        return maximo;
    }
    public static int calcularMinimo(int tabla[]) {
        if (tabla.length == 0) return 0;
        int minimo = tabla[0];

        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] < minimo) {
                minimo = tabla[i];
            }
        }
        return minimo;
    }
    public static double calcularMedia(int tabla[]) {
        if (tabla.length == 0) return 0.0;
        double suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }
        return suma / tabla.length;
    }
}

