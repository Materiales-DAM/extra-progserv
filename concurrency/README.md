# Concurrencia

Implementa un programa que sirva para gestionar una granja de gallinas.

## Main

El programa debe realizar lo siguiente:

- Pide al usuario la cantidad de huevos que han puesto las gallinas.
- Arranca dos hilos FarmerTask (cada uno representa a un granjero).
- El hilo principal debe esperar a que los dos hilos anteriores finalicen, en ese momento mostrará el mensaje “Se han recogido todos los huevos” y terminará el programa
- Asegurate de que el código anterior no existe ninguna race condition. Utiliza bloques sincronizados para conseguirlo.

## FarmerTask

Cada hilo recibe un contador con la cantidad de huevos que quedan por recoger.
Pasos:
- Mientras no se hayan recogido todos los huevos, el hilo extraerá un huevo (decrementando el contador), imprimirá “Otro huevo” y esperará 100 milisegundos antes de volver a recoger otro huevo.
- Cuando se hayan recogido todos los huevos los hilos terminan su ejecución

## Calificación (3 puntos)

La puntuación será cero si:
- No compila
- No se crea/inicia ningún hilo
