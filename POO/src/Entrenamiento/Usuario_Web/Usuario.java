package Entrenamiento.Usuario_Web;

public class Usuario {
    private String email;
    private boolean estado;

    public Usuario(String email, boolean estado) {
        this.email = email;
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
