# Challenge

Repositorio para el proyecto **Challenge** desarrollado en Java.

## Estructura del Proyecto

challenge/  
├── .idea/ # Archivos de configuración de IntelliJ IDEA  
├── src/ # Código fuente del proyecto  
├── .gitignore # Exclusiones de archivos para Git  
├── challenge.iml # Archivo de módulo de IntelliJ IDEA  
└── README.md # Este archivo  

## Tecnologías

- **Lenguaje:** Java
- **IDE recomendado:** IntelliJ IDEA

## Cómo ejecutar el proyecto

1. **Clona el repositorio:**
git clone https://github.com/MiguelAngelLeon/challenge.git

2. **Abre el proyecto en IntelliJ IDEA** o tu IDE Java preferido.
3. **Ejecuta la clase principal** ubicada en el directorio `src/`.

## Estructura del código fuente (`src/`)

El código fuente se encuentra dentro de la carpeta [`src/`](https://github.com/MiguelAngelLeon/challenge/tree/main/src). Aquí están los archivos principales y su propósito dentro del proyecto:

src/  
├── Principal.java  
├── Presentacion.java  
└── ConversorMoneda.java  

### Descripción de los archivos:

- **Principal.java**  
  Es la clase principal del proyecto y el punto de entrada de la aplicación. Implementa un conversor de monedas que interactúa con el usuario a través de un menú en consola. Permite convertir entre diferentes monedas (USD, ARS, BRL, COP) consultando tasas de cambio en tiempo real mediante una API externa. Utiliza la librería Gson para procesar respuestas en formato JSON.

- **Presentacion.java**  
  Esta clase contiene el método `exibirMenu()`, encargado de mostrar el menú interactivo en consola. Presenta las opciones de conversión de moneda disponibles y guía al usuario en el uso del programa.

- **ConversorMoneda.java**  
  Es un record Java que modela la estructura de la respuesta JSON recibida desde la API de tasas de cambio. Almacena las tasas de conversión en un objeto `JsonObject` para su posterior consulta.

---

Cada archivo cumple una función específica para lograr la conversión de monedas de manera interactiva y dinámica.  
Puedes modificar o ampliar estas clases para agregar nuevas funcionalidades o adaptar el conversor a tus necesidades.

## Contribuir

1. Haz un fork del repositorio.
2. Crea una rama para tu feature o fix (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -am 'Agrega nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto no tiene una licencia especificada.

---
