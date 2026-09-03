public class Calculadora {

    public double suma (double A, double B){
        double aux = 0;
        aux = A + B;
        return aux;
    }

    public double resta (double A, double B){
        double aux = 0;
        aux = A - B;
        return aux;
    }

    public double mult (double A, double B){
        double aux = 0;
        aux = A * B;
        return aux;
    }

    public double divi (double A, double B){
        double aux = 0;
        if (B == 0){
            System.out.println("Error matemático, no se puede dividir entre 0");
        } else {
            aux = A / B;
        }
        return aux;
    }

    public static void main (String[] args){

        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.suma(10, 5));
        System.out.println("Resta: " + calculadora.resta(10, 5));
        System.out.println("Multiplicación: " + calculadora.mult(10, 5));
        System.out.println("División: " + calculadora.divi(10, 5));
        System.out.println("División: " + calculadora.divi(10, 0));
    }
}
