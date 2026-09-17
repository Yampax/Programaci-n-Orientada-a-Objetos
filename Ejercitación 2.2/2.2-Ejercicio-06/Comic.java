public class Comic {

    private String titulo;
    private double precio;
    private int stock;

    public Comic(String titulo, double precio, int stock){
        this.titulo = titulo;
        if (precio >= 0){
            this.precio = precio;
        } else {
            System.out.println("Error de carga: el precio cargado es negativo");
        }
        if (stock >= 0){
            this.stock = stock;
        } else {
            System.out.println("Error de carga: el stock cargado es negativo");
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio no puede ser negativo");
        }
    }



    public void reponerStock(int cantidad){
        if (cantidad >= 0){
            stock += cantidad;
        } else {
            System.out.println("Error: La cantidad ingresada es negativa");
        }
    }
    public void venderUnidad(){
        if (stock > 0){
            stock --;
            System.out.println("unidad vendida");
        } else {
            System.out.println("Se agotaron las unidades de este producto");
        }
    }

    public static void main(String[] args) {
        Comic comic = new Comic("Absolute Batman", 5000, 1);

        comic.venderUnidad();
        comic.venderUnidad();

        comic.reponerStock(2);

        comic.venderUnidad();
        comic.venderUnidad();
        comic.venderUnidad();
    }
}
