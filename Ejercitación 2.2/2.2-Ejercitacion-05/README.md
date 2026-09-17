En este ejercicio se define la clase SocioGeek utilizando los atributos numeroSocio, nombre y puntosFidelidad con acceso private, evitando que puedan ser modificados directamente desde fuera de la clase.

Se implementa un constructor parametrizado que permite inicializar los tres atributos al crear un objeto. Además, se proporcionan métodos getter para acceder de forma controlada a los valores de cada atributo.

Para modificar puntosFidelidad se implementa un setter con validación defensiva. El método verifica mediante una estructura condicional que el valor recibido sea mayor o igual a cero. Si cumple esta condición, el nuevo valor es asignado; de lo contrario, se rechaza y se muestra un mensaje de error, manteniendo protegido el estado interno del objeto.

Finalmente, en el método main se prueba primero una asignación válida de puntos y luego una asignación negativa, comprobando que el valor inválido no sea aceptado.

<img width="1290" height="656" alt="image" src="https://github.com/user-attachments/assets/5c42653d-9445-4693-aa5e-be144de19c8c" />
