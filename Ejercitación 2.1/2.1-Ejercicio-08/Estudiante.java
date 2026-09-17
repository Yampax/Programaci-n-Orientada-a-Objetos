import java.util.ArrayList;

public class Estudiante {

    String nombre;
    ArrayList<Double> calificaciones;

    public Estudiante (String nombre){
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarNota(double nota){
        if (nota >= 0.0 && nota <= 10.0) {
            calificaciones.add(nota);
        } else {
            System.out.println("La nota ingresada no es válida");
        }
    }

    public double calcularPromedio(){
        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        if (calificaciones.isEmpty()) {
            return 0;
        }
        return suma / calificaciones.size();
    }

    public boolean haAprobado() {
        return calcularPromedio() >= 6.0;
    }

    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Juan");

        estudiante1.agregarNota(7.0);
        estudiante1.agregarNota(8.0);
        estudiante1.agregarNota(6.0);

        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        System.out.println("¿Aprobó?: " + estudiante1.haAprobado());
    }
}
