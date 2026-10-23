# Elecciones - Reto 004

## Justificación para la solución


<div align=center>

|Dato|Decisión|Justificación|Alternativa descartada|Limitación asumida|
|-|-|-|-|-|
|Candidatos|Lista que puede estar vacia|Puede presentarse una elección sin candidatos|El array de candidatos supone una cantidad fija de candidatos, la cual puede cambiar. |No existe un acceso aleatorio.|
|Papeletas|Pila|Al momento de contar los votos, estos se almacenan como una pila, emulando la forma en que se contarian en una pizarra con rayas. En caso de haber un error o discrepancia, se elimina el último ingresado.|La cola no emula correctamente el proceso al tratar de eliminar o corregir votos.|Los votos sin contar aun deberían almacenarse, y recrear el proceso desde 0 puede no ser efectivo|
|Alumnos en clase|Lista|La cantidad de alumnos no puede tomarse como los matriculados, es cambiante. Se debe de admitir cambios (o incluso polizontes)|Array, por los cambios que los alumnos presentes pueden sufrir|En una clase muy larga el acceso es lento.|
|Votos por candidatos|Array de `n` candidatos + 2 para admitir votos nulos + abastenciones de tipo `Candidato`|Los votos permiten el acceso aleatorio a la información del candidato|Dos arrays paralelos, una con la cuenta de votos y otro con la información de candidatos|Se debe de delegar bien la responsabilidad de si es *el Candidato* quien *tiene* los votos |

</div>
