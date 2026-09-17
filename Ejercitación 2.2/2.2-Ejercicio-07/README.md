En este ejercicio se define la clase CalculadoraPromocion con el atributo privado descuentoBase, utilizado para almacenar el porcentaje de descuento general.

Se implementan tres versiones sobrecargadas del método calcularPrecioFinal. La primera recibe únicamente el precio base y aplica el descuento almacenado en el objeto. La segunda recibe el precio base y un porcentaje especial, permitiendo aplicar un descuento diferente al descuento base. La tercera recibe el precio base y un cupón fijo de tipo int, que se resta directamente al precio.

Las tres versiones utilizan el mismo nombre de método, pero poseen diferentes parámetros, lo que permite aplicar el concepto de sobrecarga. Finalmente, en el método main se invocan las tres variantes con diferentes tipos y cantidades de argumentos. De esta manera, se demuestra que la JVM selecciona la firma correspondiente según los argumentos utilizados en cada llamada.

<img width="1279" height="652" alt="image" src="https://github.com/user-attachments/assets/98d88851-0baa-4015-af89-4b4231ead26d" />
