public class ArticuloGeek {
    private String nombre;
    private double precioBase;

    public ArticuloGeek(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
