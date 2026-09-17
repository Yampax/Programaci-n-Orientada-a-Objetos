En este ejercicio implementé la clase Personaje, utilizando los atributos nombre, puntosVida y puntosAtaque. Declaré estos atributos como private para aplicar el concepto de encapsulamiento y proteger la información de cada personaje.

Utilicé un constructor parametrizado para poder crear cada personaje indicando su nombre, sus puntos de vida y sus puntos de ataque. Mediante this asigné los valores recibidos por el constructor a los atributos correspondientes del objeto.

También implementé el método atacar(Personaje objetivo), que recibe como parámetro una referencia a otro objeto de tipo Personaje. De esta manera, el personaje que realiza el ataque puede modificar los puntos de vida del personaje objetivo utilizando sus puntos de ataque. En este método también muestro por pantalla quién realiza el ataque y cuántos puntos de vida le quedan al objetivo.

El método estaVivo() devuelve un valor booleano dependiendo de si los puntos de vida del personaje son mayores que cero. Utilicé este método dentro de un ciclo while para mantener el combate mientras ambos personajes continúen con vida. Después de cada ataque del guerrero, compruebo si el orco sigue vivo antes de permitirle realizar su contraataque.

Finalmente, cuando uno de los personajes llega a cero o menos puntos de vida, el ciclo termina y mediante una estructura if-else determino cuál de los dos personajes continúa con vida y, por lo tanto, es mostrado como ganador del combate.

<img width="1239" height="500" alt="image" src="https://github.com/user-attachments/assets/7bb056b5-7ff5-44d4-a0ae-569edef896a0" />
