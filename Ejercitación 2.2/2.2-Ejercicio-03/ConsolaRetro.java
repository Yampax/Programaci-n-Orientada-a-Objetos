public class ConsolaRetro {
    String modelo;
    String numeroSerie;
    boolean encendida;

    public ConsolaRetro (String modelo, String numeroSerie){
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }


    public void encender(){
        encendida = true;

        System.out.println("La consola se ha encendido.");
    }

    public void apagar(){
        encendida = false;

        System.out.println("La consola se ha apagado.");
    }

    public void mostrarEstado(){
        if (encendida == true){
            System.out.println("La consola se encuentra encendida.");
        } else {
            System.out.println("La consola se encuentra apagada.");
        }
    }

    public static void main(String[] args) {
        ConsolaRetro consola1 = new ConsolaRetro("Atari 2600", "1213x_za");

        consola1.mostrarEstado();
        consola1.encender();
        consola1.mostrarEstado();
        consola1.apagar();
        consola1.mostrarEstado();
    }
}
