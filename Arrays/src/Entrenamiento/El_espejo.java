package Entrenamiento;

/*
Declara un array estatico con los valores {10, 20, 30, 40, 50}.
recorrelo con un bucle FOR clasico para imprimir todos sus valores en una linea.
luego haz otro que los imprima al revez.
 */

public class El_espejo {
    public static void main(String[] args) {
        int [] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i <= numeros.length - 1; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");

        for (int i = numeros.length -1 ; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
