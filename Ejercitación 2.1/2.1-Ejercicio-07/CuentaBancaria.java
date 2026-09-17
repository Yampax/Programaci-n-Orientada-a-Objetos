public class CuentaBancaria {
    //Variable
    private String titular;
    private double saldo;

    //Metodos getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodos setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Operaciones
    public void depositar(double monto){
        if (monto > 0){
            System.out.println("Usted a depositado " + monto);
            setSaldo(getSaldo() + monto);
        } else {
            System.out.println("El monto que quiere ingresar es invalido");
        }
    }

    public void retirar(double monto){
        if (monto > 0 && monto <= getSaldo()){
            System.out.println("Usted a retirado " + monto);
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("El monto supera el saldo disponible o es inválido");
        }
    }

    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setTitular("Juan Carlos Bodoque");
        cuenta1.setSaldo(1000.31);

        System.out.println("Titular de la cuenta: " + cuenta1.getTitular());

        cuenta1.retirar(750);
        System.out.println("Dinero disponible: " + cuenta1.getSaldo());

        cuenta1.depositar(250);
        System.out.println("Dinero disponible: " + cuenta1.getSaldo());
    }
}
