package Entrenamiento.El_Calculo;

public class Usuario {
    private String nombre;
    private String nacimiento;

    public int calcularEdad(){
        int edad = 2026 - Integer.parseInt(nacimiento);
        return edad;
    }

    public void setNacimiento(String nacimiento){
        this.nacimiento = nacimiento;
    }

    public void mostrarInfo(){
        System.out.println("La edad del ususario es: " + calcularEdad());
    }
}
