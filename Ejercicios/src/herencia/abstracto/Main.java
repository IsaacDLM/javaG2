package herencia.abstracto;

public class Main {
    public static void main(String[] args) {
        Enviable miAviso;

        miAviso = new NotificacionEmail("Isaac", "Hola que haces?", "saludo");
        miAviso.enviar();

        miAviso = new NotificacionSMS("Banca", "Que vas a cenar?", 727718323);
        miAviso.enviar();
    }
}
