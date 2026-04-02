package herencia.abstracto;

public class NotificacionSMS extends NotificacionBase{
    private int numero;

    public NotificacionSMS (String destinatario, String cuerpoMesaje, int numero){
        super(destinatario, cuerpoMesaje);
        this.numero = numero;
    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS al numero " + numero + " para " + getdestinarario() + "Mensaje: " + getCuerpoMensaje());
    }
}
