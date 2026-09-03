public class Auto {
    String marca;
    String modelo;
    boolean encendido;

    public Auto (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender(){
        encendido = true;
    }

    public void apagar(){
        encendido = false;
    }

    public void mostrarEstado(){
        if (encendido == true){
           System.out.println("El vehículo esta encendido");
        } else {
            System.out.println("El vehículo esta apagado");
        }
    }

    public static void main (String[] args){

        Auto auto1 = new Auto("Mitsubishi", "evolution");

        auto1.mostrarEstado();

        auto1.encender();
        auto1.mostrarEstado();

        auto1.apagar();
        auto1.mostrarEstado();
    }
}
