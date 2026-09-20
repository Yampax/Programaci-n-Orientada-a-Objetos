public class ColeccionLote {
    String descripcion;
    ArticuloGeek articuloPrincipal;
    ArticuloGeek articuloSecundario;

    public ColeccionLote(String descripcion, ArticuloGeek articuloPrincipal, ArticuloGeek articuloSecundario){
        this.descripcion = descripcion;
        this.articuloPrincipal = articuloPrincipal;
        this.articuloSecundario = articuloSecundario;
    }

    public double calcularValorLote(){
        double aux = 0;
        aux += articuloPrincipal.getPrecioBase();
        aux += articuloSecundario.getPrecioBase();

        return aux;
    }

    public void mostrarDetalleLote(){
        System.out.println("Nombre del articulo: " + articuloPrincipal.getNombre());
        System.out.println("Precio unitario: $" + articuloPrincipal.getPrecioBase());
        System.out.println("Nombre del articulo: " + articuloSecundario.getNombre());
        System.out.println("Precio unitario: $" + articuloSecundario.getPrecioBase());
    }

    public static void main(String[] args) {

        ArticuloGeek articulo1 = new ArticuloGeek("Figura de Goku", 15000);
        ArticuloGeek articulo2 = new ArticuloGeek("Manga de One Piece", 8000);

        ColeccionLote lote = new ColeccionLote(
                "Colección Geek",
                articulo1,
                articulo2
        );

        System.out.println("El valor total del Lote es: $" + lote.calcularValorLote());

        lote.mostrarDetalleLote();
    }}
