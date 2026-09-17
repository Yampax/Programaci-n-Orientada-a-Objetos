public class ArticuloGeek {
    String nombre;
    double precioBase;

    public static void main(String[] args) {
        ArticuloGeek articulo1 = new ArticuloGeek();
        ArticuloGeek articulo2 = new ArticuloGeek();

        articulo1.nombre = "Figura de colección articcculada de Ben10";
        articulo1.precioBase = 15000;

        articulo2.nombre = "Sobre Base set Pokemon";
        articulo2.precioBase = 8500;

        System.out.println("Artículo 1:");
        System.out.println("Nombre: " + articulo1.nombre);
        System.out.println("Precio base: $" + articulo1.precioBase);

        System.out.println();

        System.out.println("Artículo 2:");
        System.out.println("Nombre: " + articulo2.nombre);
        System.out.println("Precio base: $" + articulo2.precioBase);
    }
}
