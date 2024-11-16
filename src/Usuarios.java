
public class Usuarios {
    private String nombre;
    private String cedula;
    private boolean voto;
    public Usuarios liga;

    public Usuarios(String nombre, String cedula, boolean voto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.voto = voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }
    
}
