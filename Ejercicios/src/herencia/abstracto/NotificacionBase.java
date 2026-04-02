package herencia.abstracto;

public abstract class NotificacionBase implements Enviable{
    private String destinatario;
    private String cuerpoMensaje;

    public NotificacionBase (String destinatario, String cuerpoMensaje){
        this.destinatario = destinatario;
        this.cuerpoMensaje = cuerpoMensaje;
    }

    public String getdestinarario(){
        return destinatario;
    }

    public String getCuerpoMensaje(){
        return cuerpoMensaje;
    }
}
