public class GiftCard {
    private String codigo;
    private  double saldo;

    public GiftCard(String codigo, double saldo){
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public boolean descontarSaldo(double monto){
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
