package Entrenamiento;

import java.util.Scanner;

public class El_Recaudador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] precios = new int[5];
        int precio;
        int total = 0;

        for(int i = 0; i <= precios.length - 1; i ++) {
            System.out.println("Introduzaca el precio del producto " + (i + 1) + " : ");
            precio = sc.nextInt();
            precios [i] = precio;
        }

        System.out.println("---- Lista de precios ----");
        for (int i = 0; i <= precios.length - 1; i++){
            System.out.print(precios[i] + " ");
        }

        for(int i = 0; i <= precios.length - 1; i++){
            total+= precios[i];
        }
        System.out.println("\n" + "---- Total ----");
        System.out.println("El total es: " + total);
    }
}
