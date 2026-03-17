package Entrenamiento;

import java.util.Scanner;

/*
Crea una tabla con 6 nombres (String). Pide al usuario que escriba
un nombre. Recorrer la tabla para ver si ese nombre existe. Usa una variable
booleana "econtrado" que empiece en false y cambie a true. usar el metodo .equals()
 */
public class El_Detective_Basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombres = {"Maria", "Claudia", "Blanca", "Jose"};
        String nombre;

        System.out.println("Ingrese el nombre a buscar: ");
        nombre = sc.nextLine();

        // La variable es la "llave" que detendra el bucle al encontrar lo que buscamos //
        boolean encontrado = false;
        for (int i = 0; i < nombres.length && !encontrado; i++){
            if(nombres[i].equalsIgnoreCase(nombre)){
                encontrado = true;
            }
        }
        // Separamos la logica de buscar, con la logica de mostrar el resultado //
        if(encontrado){
            System.out.println("Nombre encontrado!!");
        }else {
            System.out.println("Nombre no encontrado");
        }
    }
}
