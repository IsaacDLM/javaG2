package herencia.empleados;

public class Programador extends Empleado{
    private String lenguajeFav;

    public Programador(String nombre, String lenguajeFav){
        super(nombre);
        this.lenguajeFav = lenguajeFav;
    }

    public String getLenguajeFav(){
        return lenguajeFav;
    }
}
