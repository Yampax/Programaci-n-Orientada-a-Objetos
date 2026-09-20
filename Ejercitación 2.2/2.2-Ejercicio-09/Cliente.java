public class Cliente {
    String nombre;
    GiftCard tarjeta;

    public Cliente(String nombre, GiftCard tarjeta){
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public void realizarCompra(double monto){
        if (tarjeta.descontarSaldo(monto)) {
            System.out.println(nombre + " realizó una compra de $" + monto);
        } else {
            System.out.println(nombre + " no pudo realizar la compra de $" + monto
                    + " por saldo insuficiente.");
        }
    }

    public static void main(String[] args) {

        GiftCard tarjeta = new GiftCard("GC001", 10000);

        Cliente cliente = new Cliente("Lucas", tarjeta);

        cliente.realizarCompra(3000);
        cliente.realizarCompra(8000);
    }

}
