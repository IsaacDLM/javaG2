package Entrenamiento;

import java.util.Scanner;

public class El_Contador_De_Frecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] votos = {1,2,1,2,1,1,3,4};
        int candidato;
        int cantVotos = 0;

        System.out.print("De que candidato desea contar los votos?: ");
        candidato = sc.nextInt();
        
        for (int i = 0; i < votos.length; i ++){
            if(votos[i] == candidato){
                cantVotos++;
            }
        }

        System.out.println("El candidato " + candidato + " tiene: " + cantVotos );
    }
}
