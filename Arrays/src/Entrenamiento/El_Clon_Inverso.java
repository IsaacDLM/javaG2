package Entrenamiento;

import java.util.Arrays;

public class El_Clon_Inverso {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] clon = new int[original.length];

        int j = clon.length - 1;

        for (int i = 0; i < original.length; i ++){
            clon[j] = original[i];
            j--;
        }

        // Solucion matematica //
        // Eliminamos la variable "j" y usamos el original.length - 1 como valor inicial
        // y vamos retrocediendo restandole el i que va aumentando de 1 en 1 siendo 5 - 0, 5 - 1, 5 - 2, etc.
        /*
        for(int i = 0; i < original.length; i++{
            clon[original.length - 1 - i] = original[i];
        }
         */
        System.out.println(Arrays.toString(clon));
    }
}
