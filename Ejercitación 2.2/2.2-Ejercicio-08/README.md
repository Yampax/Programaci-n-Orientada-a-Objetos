En este ejercicio creé la clase MangaVolume con los atributos necesarios para representar un tomo de manga: tituloSerie, numeroTomo y cantidadPaginas. También implementé un constructor para poder asignar estos valores al momento de crear cada objeto.

Para determinar si un tomo es una edición especial, creé el método público esEdicionEspecial(), que utiliza el método privado esTomoExtenso(). Este último verifica si el tomo tiene más de 300 páginas y devuelve true o false dependiendo del resultado.

También sobrescribí el método toString() para poder mostrar de manera ordenada los datos de cada tomo. De esta forma, puedo imprimir directamente los objetos utilizando System.out.println(manga).

Finalmente, creé dos objetos en el método main, con diferentes cantidades de páginas, para comprobar el funcionamiento de los métodos y verificar que se determine correctamente si cada tomo es una edición especial.

<img width="1277" height="654" alt="image" src="https://github.com/user-attachments/assets/3fa297e7-525e-44d2-8f20-af1b35528021" />
