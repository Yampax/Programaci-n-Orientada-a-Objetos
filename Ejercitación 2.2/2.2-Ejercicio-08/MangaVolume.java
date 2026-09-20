public class MangaVolume {
   String tituloSerie;
   int numeroTomo;
   int cantidadPaginas;

   public MangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas){
       this.tituloSerie = tituloSerie;
       this.numeroTomo = numeroTomo;
       this.cantidadPaginas = cantidadPaginas;
   }

   public boolean esEdicionEspecial(){
       return esTomoExtenso();
   }

   private boolean esTomoExtenso(){
       return cantidadPaginas > 300;
   }

    @Override
    public String toString() {
        return "Título: " + tituloSerie
                + "\nNúmero de tomo: " + numeroTomo
                + "\nCantidad de páginas: " + cantidadPaginas
                + "\nEdición especial: " + esEdicionEspecial();
    }

    public static void main(String[] args) {

        MangaVolume manga1 = new MangaVolume("One Piece", 100, 320);
        MangaVolume manga2 = new MangaVolume("Dragon Ball", 5, 250);

        System.out.println(manga1);
        System.out.println();
        System.out.println(manga2);
    }
}
