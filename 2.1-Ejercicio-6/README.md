En este ejercicio implementé la clase Libro, utilizando los atributos titulo, autor, paginasTotales y paginaActual para representar la información y el estado de un libro.

Para crear los objetos utilicé un constructor que recibe el título, el autor y la cantidad total de páginas. Además, establecí paginaActual en 0, ya que al crear un libro todavía no se ha comenzado a leer.

Luego implementé el método leer(int paginas), que permite avanzar en la lectura modificando el valor de paginaActual. También agregué una condición para controlar que la página actual no supere la cantidad total de páginas. Si se alcanza o supera el límite, paginaActual se ajusta al total y se informa que la lectura ha finalizado.

Finalmente, implementé el método mostrarProgreso(), encargado de mostrar los datos del libro y calcular el porcentaje de lectura. Para obtener un resultado decimal utilicé un casting a double, evitando así la división entera de Java.

<img width="1281" height="659" alt="image" src="https://github.com/user-attachments/assets/903374f7-a921-492e-9100-c3be6fe9c27f" />
