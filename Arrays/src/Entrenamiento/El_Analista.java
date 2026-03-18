package Entrenamiento;

import java.util.Scanner;

public class El_Analista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        int numero;

        System.out.println("Ingrese los 5 numeros");

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i + 1) + " : ");
            numero = sc.nextInt();

            numeros[i] = numero;
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
            if(numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}
