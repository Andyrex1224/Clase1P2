public class Jugador {
    private int id;
    private String nombre;
    private String posicion;
    private int rendimiento;

    public Jugador(int id, String nombre, String posicion, int rendimiento) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.rendimiento = rendimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }


    @Override
    public String toString() {
        return "Jugador: " +
                "id: " + id +
                ", nombre: " + nombre + '\'' +
                ", posicion: " + posicion + '\'' +
                ", rendimiento: " + rendimiento;
    }
}
