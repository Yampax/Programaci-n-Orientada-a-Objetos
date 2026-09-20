En este ejercicio diseñé las clases GiftCard y Cliente para representar la relación entre un cliente y su tarjeta de regalo. En GiftCard utilicé los atributos privados codigo y saldo, y creé el método descontarSaldo() para verificar si existe saldo suficiente antes de realizar una compra.

En la clase Cliente utilicé nombre y tarjeta como atributos. tarjeta es un atributo de tipo referencia GiftCard, por lo que permite que el objeto Cliente tenga asociada una tarjeta y pueda utilizar sus métodos.

También implementé el método realizarCompra(), que envía el mensaje descontarSaldo() al objeto GiftCard asociado. Dependiendo de si la operación devuelve true o false, muestro por pantalla si la compra pudo realizarse o si fue rechazada por falta de saldo.

Finalmente, en el main creé una GiftCard y un Cliente, vinculé la tarjeta con el cliente y realicé dos compras: una con saldo suficiente y otra que supera el saldo disponible. De esta manera pude comprobar el funcionamiento de la relación entre ambos objetos.

<img width="1277" height="658" alt="image" src="https://github.com/user-attachments/assets/84856a2d-a933-4bee-8cdd-06d8a1635259" />
