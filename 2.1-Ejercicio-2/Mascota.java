public class Mascota {

    String nombre;
    String especie;
    int edad;

    public Mascota (String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public static void main (String[] args){

        Mascota mascota1 = new Mascota("Roki", "Perro", 8);
        Mascota mascota2 = new Mascota("Giggione Il Gatto Ciccione", "Gato", 2);
        Mascota mascota3 = new Mascota("Luna", "Oryctolagus cuniculus", 2);

        System.out.println("Mascota 1- Nombre: " + mascota1.nombre + ", especie: " + mascota1.especie + ", " + mascota1.edad + " años");
        System.out.println("Mascota 2- Nombre: " + mascota2.nombre + ", especie: " + mascota2.especie + ", " + mascota2.edad + " años");
        System.out.println("Mascota 3- Nombre: " + mascota3.nombre + ", especie: " + mascota3.especie + ", " + mascota3.edad + " años");
    }
}
