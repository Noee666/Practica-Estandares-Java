\### Análisis de Errores y Buenas Prácticas en Java



A continuación se detalla el análisis del código de la clase `producto`, identificando áreas de mejora basadas en las convenciones estándar de Java:



| Categoría | Error Detectado | Explicación | Solución |

| :--- | :--- | :--- | :--- |

| \*\*Nombres de clases\*\* | `producto` | En Java, las clases deben usar la convención `PascalCase` (la primera letra siempre en mayúscula). | Cambiar el nombre a `Producto`. |

| \*\*Nombres de variables\*\* | `CODIGO` | El uso de mayúsculas sostenidas (ALL\_CAPS) está estrictamente reservado para constantes (`static final`). | Cambiar a `codigo` usando `camelCase`. |

| \*\*Nombres de variables\*\* | `Nombre` y `Precio` | Las variables deben escribirse usando `camelCase`, comenzando siempre con letra minúscula. | Cambiar a `nombre` y `precio`. |

| \*\*Nombres de métodos\*\* | `Mostrar()` | Al igual que las variables, los métodos en Java deben iniciar con minúscula (`camelCase`). | Cambiar a `mostrar()`. |

| \*\*Encapsulamiento\*\* | Atributos `public` | Dejar las propiedades como públicas rompe el principio de ocultamiento; cualquier otra clase podría alterar los datos sin validación. | Cambiar los atributos a `private` y crear métodos `getters` y `setters`. |

| \*\*Sangría\*\* | Ausencia total de tabulación | Todo el código está alineado a la izquierda. No hay jerarquía visual que separe la clase, los constructores y los métodos. | Aplicar 1 nivel de sangría (4 espacios o 1 tab) dentro de la clase y 2 niveles dentro de los métodos. |

| \*\*Formato\*\* | `String c,String n...` | Faltan espacios en blanco después de las comas en la lista de parámetros, lo que hace que el texto se vea amontonado. | Agregar un espacio después de cada coma: `String c, String n, double p`. |

| \*\*Formato\*\* | `CODIGO=c;` | Faltan espacios alrededor del operador de asignación (`=`). El espaciado correcto es vital para descansar la vista. | Separar los operadores: `codigo = c;`. |

| \*\*Legibilidad\*\* | Parámetros `c`, `n`, `p` | Usar variables de una sola letra es una mala práctica porque no describen qué dato están recibiendo. | Usar el mismo nombre del atributo y distinguirlo con `this`: `this.precio = precio;`. |

