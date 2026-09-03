En este ejercicio implementé la clase Contador, utilizando un atributo entero llamado valor para representar el estado actual del contador.

Se definieron dos constructores. El constructor por defecto inicializa el atributo valor en 0, mientras que el constructor parametrizado permite establecer un valor inicial diferente al momento de crear una instancia. En este último utilicé la referencia this para indicar que estoy haciendo referencia al atributo de la instancia.

Luego implementé los métodos solicitados. El método incrementar() aumenta el valor del contador en una unidad mediante el operador ++. El método decrementar() disminuye el valor en una unidad, pero utiliza una estructura condicional if para garantizar que el contador no pueda adquirir valores negativos. Si el valor ya es 0, el método no realiza ninguna modificación.

El método resetear() permite restablecer el contador a 0, mientras que getValor() retorna el valor entero actual del atributo.

Finalmente, en el método main creé una instancia utilizando el constructor por defecto y probé los diferentes métodos. Primero incrementé el contador tres veces, obteniendo el valor 3; luego lo decrementé una vez, obteniendo 2; y finalmente utilicé resetear() para volver el contador a 0.

<img width="1274" height="656" alt="image" src="https://github.com/user-attachments/assets/aa4a34e5-8ae2-4ea4-b8da-3e03609f9437" />
