En este ejercicio se define la clase Comic con los atributos titulo, precio y stock utilizando el modificador private para proteger el estado interno del objeto.

El constructor implementa una validación defensiva para evitar que el precio y el stock inicial sean negativos. También se proporcionan métodos getter para consultar los atributos y un setter para modificar el precio manteniendo la validación correspondiente. No se implementa un setter directo para el stock, ya que su modificación debe realizarse mediante los métodos de negocio de la clase.

El método reponerStock(int cantidad) permite aumentar el stock únicamente cuando la cantidad recibida es válida. Por otro lado, venderUnidad() comprueba que exista al menos una unidad disponible antes de disminuir el stock. De esta manera, se garantiza que el stock nunca pueda ser menor a cero.

Finalmente, en el método main se realizan ventas cuando el stock se encuentra en cero y también después de reponer unidades, permitiendo comprobar que la clase impide realizar ventas cuando no hay productos disponibles.

<img width="1279" height="652" alt="image" src="https://github.com/user-attachments/assets/122a791a-5fa7-4868-89bc-1008059f5bc1" />
