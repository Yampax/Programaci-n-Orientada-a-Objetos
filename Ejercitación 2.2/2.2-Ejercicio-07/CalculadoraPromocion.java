public class CalculadoraPromocion {

    private double descuentoBase;

    public CalculadoraPromocion (double descuentoBase){
        this.descuentoBase = descuentoBase;
    }

    public double calcularPrecioFinal(double precioBase) {
        return precioBase - (precioBase * descuentoBase / 100);
    }

    public double calcularPrecioFinal(double precioBase, double porcentajeEspecial) {
        return precioBase - (precioBase * porcentajeEspecial / 100);
    }

    public double calcularPrecioFinal(double precioBase, int cuponFijo) {
        return precioBase - cuponFijo;
    }
    

    public static void main(String[] args) {
        CalculadoraPromocion calculadora = new CalculadoraPromocion(10);

        double precio1 = calculadora.calcularPrecioFinal(10000);
        double precio2 = calculadora.calcularPrecioFinal(10000, 20.0);
        double precio3 = calculadora.calcularPrecioFinal(10000, 1500);

        System.out.println("Precio con descuento base: $" + precio1);
        System.out.println("Precio con descuento especial: $" + precio2);
        System.out.println("Precio con cupón fijo: $" + precio3);
    }
}
