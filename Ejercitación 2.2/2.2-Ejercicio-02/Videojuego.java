public class Videojuego {
    String titulo;
    String plataforma;
    double precio;

    public Videojuego (String titulo, String plataforma, double precio){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego("ARK Survival Evolved", "Steam", 14.99);
        Videojuego videojuego2 = new Videojuego("PEAK", "Steam", 5.5);
        Videojuego videojuego3 = new Videojuego("Grand Theft Auto VI", "Play Station", 100);

        System.out.println(String.format(
                "Videojuego: %s | Plataforma : %s | Precio: $%.2f",
                videojuego1.titulo,
                videojuego1.plataforma,
                videojuego1.precio
        ));

        System.out.println(String.format(
                "Videojuego: %s | Plataforma : %s | Precio: $%.2f",
                videojuego2.titulo,
                videojuego2.plataforma,
                videojuego2.precio
        ));

        System.out.println(String.format(
                "Videojuego: %s | Plataforma : %s | Precio: $%.2f",
                videojuego3.titulo,
                videojuego3.plataforma,
                videojuego3.precio
        ));
    }
}
