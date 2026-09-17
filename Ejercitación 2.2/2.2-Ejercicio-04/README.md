En este ejercicio se define la clase CajaRegistradora con los atributos montoRecaudado y totalVentasRealizadas, que permiten llevar el control del dinero recaudado y de la cantidad de ventas realizadas.

Se implementa un constructor que inicializa ambos atributos en 0, estableciendo el estado inicial de la caja. El método registrarVenta(double monto) permite registrar cada venta, sumando el importe al monto total recaudado e incrementando en uno la cantidad de ventas.

El método obtenerPromedioVenta() calcula el promedio de las ventas dividiendo el monto recaudado por la cantidad de ventas. Antes de realizar la división, se utiliza una estructura if/else para comprobar que exista al menos una venta y evitar una división por cero.

Finalmente, en el método main se crea una instancia de CajaRegistradora, se registran tres ventas de prueba y se muestra por pantalla el promedio obtenido mediante la invocación del método correspondiente.

<img width="1291" height="649" alt="image" src="https://github.com/user-attachments/assets/5dbd3014-1b22-4071-838f-eac93dfee761" />
