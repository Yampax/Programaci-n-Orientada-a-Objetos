public class Contador {

    int valor;

    public Contador() {
        valor = 0;
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0) {
            valor--;
        }
    }

    public void resetear() {
        valor = 0;
    }

    public int getValor() {
        return valor;
    }


    public static void main(String[] args){
        Contador contador1 = new Contador();

        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();

        System.out.println("El valor es: " + contador1.getValor());

        contador1.decrementar();

        System.out.println("El valor es: " + contador1.getValor());

        contador1.resetear();

        System.out.println("El valor es: " + contador1.getValor());
    }
}
