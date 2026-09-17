public class Personaje {
    private String nombre;
    private int puntosVida;
    private int puntosAtaque;

    public Personaje (String nombre, int puntosVida, int puntosAtaque){
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
    }

    public void atacar(Personaje objetivo){
        objetivo.puntosVida -= this.puntosAtaque;

        System.out.println(this.nombre + " ataca a " + objetivo.nombre);
        System.out.println(objetivo.nombre + " queda con " + objetivo.puntosVida + " puntos de vida.");
    }

    public boolean estaVivo(){
        return puntosVida > 0;
    }

    public static void main(String[] args) {

        Personaje personaje1 = new Personaje("Guerrero", 100, 20);
        Personaje personaje2 = new Personaje("Orco", 100, 15);

        while (personaje1.estaVivo() && personaje2.estaVivo()) {

            personaje1.atacar(personaje2);

            if (personaje2.estaVivo()) {
                personaje2.atacar(personaje1);
            }
        }

        System.out.println("\n--- FIN DEL COMBATE ---");

        if (personaje1.estaVivo()) {
            System.out.println(personaje1.nombre + " ha ganado.");
        } else {
            System.out.println(personaje2.nombre + " ha ganado.");
        }
    }
}
