# Patrones de diseño

Estudio para el ciclo formativo de Diseño de Aplicaciones Multiplataforma sobre los distintos patrones de diseño de OOP en Java.

## Descripción

En este documento se guardan explicaciones sencillas sobre todo lo que aprendí a la hora de construír ejemplos de los patrones de diseño y también una explicación en mayor profundidad

### Decoradores

La manera más simple de explicar qué es un decorador es en pensar en algún videojuego de acción, aventura. En ese tipo de juegos es bastante común la existencia de un enemigo básico, como ejemplo diré un slime, el cual luego recibe "modificaciones" a lo largo del juego. Por ejemplo en la zona de fuego en vez de encontrarte con un slime básico te podrías encontrar con un slime de magma. El hecho de ser de magma a lo mejor hace que haga más daño o que tenga más vida o que tenga una mayor resistencia elemental. Los decoradores quieren solucionar el problema de tener que crear una nueva clase para cada tipo de slime que queremos y simplemente coger la clase que ya tenemos de Slime y dejarnos convertirla en un slime de magma.

Cómo podemos hacer esto? Pues propongámonos que tenemos una interfaz para crear enemigos, con esa interfaz creamos nuestro slime base el cual tiene unos valores asociados a su ataque, defensa, incluso su nombre, lo que tenemos que hacer para crear varias variaciones de slimes es muy simple. Creamos una clase abstracta para decorar a slimes, y luego a partir de esa clase creamos distintos tipos de clases de slimes que cambian los valores por defecto del slime base.

## Referencias

### Decoradores

[Información general] (https://www.geeksforgeeks.org/java/decorator-design-pattern-in-java-with-example/)
