package herencia.abstracto;

public class NotificacionEmail extends NotificacionBase{
    private String asunto;

    public NotificacionEmail(String destinatario, String cuerpoMensaje, String asunto){
        super(destinatario, cuerpoMensaje);
        this.asunto = asunto;
    }

    @Override
    public void enviar(){
        System.out.println("Email enviado!!!");
    }
}
