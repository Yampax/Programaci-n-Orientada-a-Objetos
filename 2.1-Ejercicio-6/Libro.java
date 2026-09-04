public class Libro {

    //Variables
    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;

    //Constructor
    public Libro (String titulo, String autor, int paginasTotales){
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0;
    }

    //Metodos
    public void leer(int paginas){
        paginaActual += paginas;

        if (paginaActual >= paginasTotales){
            paginaActual = paginasTotales;
            System.out.println("La lectura ha finalizado");
        }
    }

    public void mostrarProgreso(){
        double porcentaje = ((double) paginaActual / paginasTotales) * 100;

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Página actual: " + paginaActual);
        System.out.println("Páginas totales: " + paginasTotales);
        System.out.println("Progreso: " + porcentaje + "%");
    }
    public static void main(String[] args){

    Libro libro1 = new Libro("El Eternauta", "Héctor Germán Oesterheld", 376);

    libro1.leer(77);
    libro1.mostrarProgreso();

    }
}
