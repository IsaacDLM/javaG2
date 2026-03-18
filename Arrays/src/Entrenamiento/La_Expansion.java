package Entrenamiento;

/*
Crea una tabla de tamaño 3 con los numeros {1, 2, 3}. Utiliza la herramienta "Arrays.copyOf()"
para crear una tabla que sea el doble de grande. Copiando los datos de la primera. Imprime la nueva tabla
usando Arrays.toString().
 */

import java.util.Arrays;

public class La_Expansion {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3};
        int [] nuevosNumeros;

        nuevosNumeros = Arrays.copyOf(numeros, 6);

        System.out.println(Arrays.toString(nuevosNumeros));
    }
}
