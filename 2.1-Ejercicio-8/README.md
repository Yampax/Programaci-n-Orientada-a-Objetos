En este ejercicio implementé la clase Estudiante con los atributos nombre y calificaciones. Para almacenar las calificaciones utilicé un ArrayList<Double>, lo que me permite guardar una cantidad variable de notas.

En el constructor inicialicé la lista de calificaciones utilizando new ArrayList<>(), de manera que cada estudiante tenga su propia lista vacía al momento de ser creado.

Luego desarrollé el método agregarNota(double nota), donde utilicé una condición para comprobar que la nota se encuentre dentro del rango válido, entre 0.0 y 10.0. Si la nota cumple con esta condición, se incorpora a la lista mediante el método add().

Para calcular el promedio implementé el método calcularPromedio(). En este método utilicé un bucle for-each para recorrer todas las calificaciones y acumular su valor en una variable. Luego dividí la suma por la cantidad de notas utilizando calificaciones.size().

Finalmente, desarrollé el método haAprobado(), que devuelve un valor booleano. El método compara el promedio obtenido con 6.0 y retorna true si el estudiante aprobó o false si no alcanzó el promedio necesario.

<img width="1278" height="657" alt="image" src="https://github.com/user-attachments/assets/bf8b149c-cff1-47dc-94b6-aefa4e8aa9f5" />
