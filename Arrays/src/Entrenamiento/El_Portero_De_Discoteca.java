package Entrenamiento;

/*
Crea una tabla de numeros aleatorios o fijos {3, 8, 5, 12, 7, 14}
recorre la tabla y usando if dentro del bucle, imprime por consola solo los numeros que sean
pares
 */

import java.util.Scanner;

public class El_Portero_De_Discoteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        int numero;

        System.out.println("Ingrese los 5 numeros");
        for(int i = 0; i <= numeros.length - 1; i++){
            System.out.println("Ingrese el numero: ");
            numero = sc.nextInt();
            numeros[i] = numero;
        }

        // el error en esto es que al encontrar el primer impar. el bucle se detiene. //
        /*
        for (int i = 0; i < numeros.length && numeros[i] % 2 == 0 ; i++ ){
            System.out.println(numeros[i]);
        }
        */

        // Esta es la manera mas limpia de cumplir con el requerimiento //
        for (int i : numeros){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
