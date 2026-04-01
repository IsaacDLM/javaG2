import java.time.LocalDate;

public class Socios implements Comparable<Socios> {
    private String id;
    private String nombre;
    private String nacimiento;

    public Socios(String id, String nombre, String nacimiento){
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public int calculoEdad(){
        int edad;
        LocalDate hoy = LocalDate.now();
        String fechaActual = hoy.toString();
        String dia = fechaActual.substring(8, 10);
        String mes = fechaActual.substring(5,7);
        String año = fechaActual.substring(0, 4);

        String diaNacimiento = nacimiento.substring(0, 2);
        String mesNacimiento = nacimiento.substring(3, 5);
        String añoNacimiento = nacimiento.substring(6, 10);

        int añoAct = Integer.parseInt(año);
        int añoNac = Integer.parseInt(añoNacimiento);

        if (dia.equals(diaNacimiento) && mes.equals(mesNacimiento)){
            edad = añoAct - añoNac;
        }else {
            edad = (añoAct - añoNac) - 1;
        }

        return edad;
    }

    @Override
    public int compareTo(Socios otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + calculoEdad());
    }

}
