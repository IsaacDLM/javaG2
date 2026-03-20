package Entrenamiento.Coches;

public class Main {
    public static void main(String[] args) {
        Coche cocheUno = new Coche();
        
        cocheUno.modelo = "Bravus";
        cocheUno.marca = "Mercedes Benz";
        
        Coche cocheDos = new Coche();
        
        cocheDos.modelo = "Deportivo";
        cocheDos.marca = "Ferrary";
        
        System.out.println("La marca del primer coche es: " + cocheUno.marca);
    }
}
