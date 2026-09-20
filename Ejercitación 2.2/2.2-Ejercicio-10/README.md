En este ejercicio creé la clase ColeccionLote para agrupar dos objetos de tipo ArticuloGeek. Utilicé articuloPrincipal y articuloSecundario como atributos de referencia, de manera que la colección pueda trabajar con los objetos ArticuloGeek que fueron creados previamente.

Implementé un constructor para recibir la descripción y las referencias de los dos artículos, utilizando this para asignar los valores recibidos a los atributos de la clase.

Para calcular el valor total del lote, implementé el método calcularValorLote(). En este método obtengo el precio de cada artículo mediante getPrecioBase(), sumo ambos valores y devuelvo el resultado utilizando return.

También implementé mostrarDetalleLote(), que utiliza los métodos getNombre() y getPrecioBase() de cada ArticuloGeek para mostrar por consola la información individual de los artículos.

Finalmente, en el main creé dos objetos ArticuloGeek, los asocié a una instancia de ColeccionLote y probé los métodos para comprobar que el valor total y los detalles de los artículos se mostraran correctamente.

<img width="1269" height="643" alt="image" src="https://github.com/user-attachments/assets/e9e034bd-7131-4916-957e-2c4e7f1a8251" />
