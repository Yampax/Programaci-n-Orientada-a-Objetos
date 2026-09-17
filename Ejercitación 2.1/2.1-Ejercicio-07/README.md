En este ejercicio implementé la clase CuentaBancaria utilizando los atributos privados titular y saldo. Utilicé la palabra private para aplicar el concepto de encapsulamiento, evitando que estos atributos puedan ser modificados directamente desde fuera de la clase.

Para acceder y modificar los atributos implementé métodos get y set. Los getters permiten obtener el valor actual de titular y saldo, mientras que los setters permiten establecer o modificar sus valores utilizando this para diferenciar el atributo de la clase del parámetro recibido.

También desarrollé los métodos depositar() y retirar() para realizar las operaciones sobre el saldo. En depositar() incorporé una condición que permite aumentar el saldo únicamente cuando el monto ingresado es mayor que cero. En retirar() comprobé que el monto sea positivo y que no supere el saldo disponible antes de realizar la extracción.

En el método main creé una instancia de CuentaBancaria, establecí el titular y el saldo inicial mediante los setters y luego realicé una extracción y un depósito, consultando el saldo mediante el getter.

<img width="1272" height="656" alt="image" src="https://github.com/user-attachments/assets/f4273ba4-65f3-46bd-86b3-d72ae975f9d6" />
