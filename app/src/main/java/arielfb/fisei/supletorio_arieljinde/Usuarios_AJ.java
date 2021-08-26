package arielfb.fisei.supletorio_arieljinde;

public class Usuarios_AJ {
    private String codigo;
    private String telefono;
    private String nombre;
    private String apellido;
    private String correo;
    private String dirrecion;

    public Usuarios_AJ() {
    }

    public Usuarios_AJ(String codigo, String telefono, String nombre, String apellido, String correo, String dirrecion) {
        this.codigo = codigo;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dirrecion = dirrecion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }
}
