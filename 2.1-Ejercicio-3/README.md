En este ejercicio se diseñó la clase Auto, definiendo los atributos marca, modelo y encendido. El atributo encendido es de tipo boolean y, al ser un atributo de instancia, se inicializa por defecto en false, representando que el vehículo comienza apagado.

Se implementó un constructor parametrizado que recibe la marca y el modelo del vehículo. Mediante la referencia this se asignan los valores recibidos a los atributos correspondientes de la instancia, permitiendo crear cada objeto con sus datos iniciales.

También se implementaron tres métodos de instancia de tipo void. El método encender() modifica el atributo encendido asignándole el valor true, mientras que apagar() lo establece en false. Ambos métodos representan comportamientos del objeto y permiten modificar su estado.

El método mostrarEstado() utiliza una estructura condicional if/else para comprobar el valor del atributo encendido. Si su valor es true, informa que el vehículo está encendido; de lo contrario, indica que está apagado.

Finalmente, en el método main se creó una instancia de la clase Auto y se simuló una secuencia de funcionamiento: primero se consulta el estado inicial, luego se enciende el vehículo, se vuelve a consultar su estado y finalmente se lo apaga y se verifica nuevamente. De esta manera, se demuestra cómo los métodos pueden modificar y consultar el estado interno de un objeto.

<img width="1274" height="655" alt="image" src="https://github.com/user-attachments/assets/7cb6b696-a342-47e5-8122-c77050691518" />
