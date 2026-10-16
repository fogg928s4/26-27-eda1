# Elecciones 

Para las elecciones de delegado considero que lo mejor sería un array de enteros para llevar el recuento de los votos.

## Justificación

El voto es anónimo, por lo cual solo sería necesario almacenar el número de votos por posición en el array. El tamaño del array debería de ser la cantidad de candidatos + 2 para ajustar a los votos nulos y abstenciones.

```java

final int CANDIDATOS_POSTULADOS = 3;
int[] votosPorCandidato = new int[CANDIDATOS_POSTULADOS + 2];

```

Considero que una lista no hace falta, pues al momento de las elecciones, se conoce de forma fija la cantidad de candidatos postulados.

## Alternativa con objetos

Otra forma sería con un array de una clase `Candidato` la cual tiene como atributos los nombres de los candidatos, junto con los votos que han recibido. Esto permite también conocer los nombres de los candidatos, los cuales son importantes al momento de anunciar los resultados.
