public class SocioGeek {

   private int numeroSocio;
   private String nombre;
   private int puntosFidelidad;

   public SocioGeek(int numeroSocio, String nombre, int puntosFidelidad){
     this.numeroSocio = numeroSocio;
     this.nombre = nombre;
     this.puntosFidelidad = puntosFidelidad;
   }

    public String getNombre() {
        return nombre;
    }
    public int getNumeroSocio() {
        return numeroSocio;
    }
    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    
    public void setPuntosFidelidad(int puntosFidelidad) {
        if (puntosFidelidad >= 0){
            this.puntosFidelidad = puntosFidelidad;
        } else {
            System.out.println("Error: los puntos ingresados son menor que 0");
        }
    }

    public static void main(String[] args) {
       SocioGeek socio = new SocioGeek(001, "Leo Messi", 0);

       socio.setPuntosFidelidad(100);
       socio.setPuntosFidelidad(-1);

    }
}
