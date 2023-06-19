# Ejercicio REST (4 puntos)

Consiste en implementar un servicio REST que permita gestionar una base de datos de autores y libros.

## Configuración

Añade todo lo necesario para que cuando arranque el servicio arranquen los controladores `AuthorController` y `BookController`

## DTO

Implementa los DTO y sus métodos de mapeo

## Endpoints

- Listado de autores
  - Incluye parámetro opcional para filtrar los autores por país
- Añadir un libro a un autor 
- Eliminar un libro de un autor

Los endpoint deben lanzar los errores que correspondan a cada situación

## Datos precargados

Cada vez que el servicio arranque tendrá los siguientes datos precargados:
- Un autor con authorId 1 y un libro asociado al mismo.
- Un autor con authorId 2 y un libro asociado al mismo.

Estos datos nos sirven para comprobar los endpoints que se piden.

## Calificación del ejercicio

El ejercicio puntuará cero puntos en los siguientes casos:
- Si no compila
- Si no arranca
- Si no funciona ningún endpoint
