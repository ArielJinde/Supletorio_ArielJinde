package arielfb.fisei.supletorio_arieljinde;

public class Tareas_AJ {
    String id,tipo_tarea,titulo,descripcion;

    public Tareas_AJ(String id, String tipo_tarea, String titulo, String descripcion) {
        this.id = id;
        this.tipo_tarea = tipo_tarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo_tarea() {
        return tipo_tarea;
    }

    public void setTipo_tarea(String tipo_tarea) {
        this.tipo_tarea = tipo_tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
