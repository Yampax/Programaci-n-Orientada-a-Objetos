import java.util.ArrayList;
public class CarritoDeCompras {
    //Array
    ArrayList<Producto> listado;

    public CarritoDeCompras(){
        listado = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        listado.add(producto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : listado){
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarDetalle(){
        for (Producto producto : listado){
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio unitario: " + producto.getPrecio());
        }
        System.out.println("Precio tota: " + calcularTotal());

    }

    public static void main (String[] args){

        //Productos
        Producto producto1 = new Producto();
        producto1.setNombre("Cerveza Duff");
        producto1.setPrecio(3000);

        Producto producto2 = new Producto();
        producto2.setNombre("Guepardex");
        producto2.setPrecio(1500);

        Producto producto3 = new Producto();
        producto3.setNombre("Mr.Gru's Old Fashioned Jelly");
        producto3.setPrecio(750);

        Producto producto4 = new Producto();
        producto4.setNombre("Chocolate Wonka");
        producto4.setPrecio(5000);

        Producto producto5 = new Producto();
        producto5.setNombre("Rusi Cola");
        producto5.setPrecio(1200);

        Producto producto6 = new Producto();
        producto6.setNombre("Comodo 3.000");
        producto6.setPrecio(20000);

        CarritoDeCompras carrito1 = new CarritoDeCompras();

        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto3);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto5);
        
        carrito1.mostrarDetalle();
    }
}
