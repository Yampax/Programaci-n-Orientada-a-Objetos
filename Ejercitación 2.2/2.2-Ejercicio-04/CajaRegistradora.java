public class CajaRegistradora {

    double montoRecaudado;
    int totalVentasRealizadas;

    public CajaRegistradora(){
        this.montoRecaudado = 0;
        this.totalVentasRealizadas = 0;
    }

    public void registrarVenta(double monto){
        montoRecaudado += monto;
        totalVentasRealizadas ++;
    }

    public double obtenerPromedioVenta(){
        double aux = 0;
        if (totalVentasRealizadas == 0){
            System.out.println("No se realizaron ventas.");
        } else {
            aux = montoRecaudado / totalVentasRealizadas;
        }
        return aux;
    }
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        System.out.println("Promedio de ventas: " + caja.obtenerPromedioVenta());
        caja.registrarVenta(8000);
        caja.obtenerPromedioVenta();
        caja.registrarVenta(5250);
        caja.registrarVenta(250);
        System.out.println("Promedio de ventas: " + caja.obtenerPromedioVenta());
    }
}
