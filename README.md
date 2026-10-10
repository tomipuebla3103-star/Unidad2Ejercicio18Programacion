<img width="516" height="302" alt="WhatsApp Image 2026-10-05 at 23 56 27" src="https://github.com/user-attachments/assets/e1938648-c485-4d1c-90f5-35f498d7b711" />

La Estación de Carga para Vehículos Eléctricos

Descripción
Este proyecto consiste en un sistema en Java que simula la carga de un vehículo eléctrico. El surtidor envía energía al vehículo mediante mensajes y controla el progreso de la carga hasta alcanzar el nivel máximo de batería.

Clases
- **VehiculoElectrico:** almacena la capacidad de la batería y el nivel de carga actual. Contiene el método `recibirCarga(double kw)`, que incrementa la energía de la batería.
- **SurtidorElectrico:** se encarga de iniciar y controlar el proceso de carga mediante el método `iniciarCarga(VehiculoElectrico vehiculo, int minutos)`.

 Funcionamiento
En el `main` se crea un vehículo eléctrico con poca batería y se lo conecta a un surtidor. Luego, se inicia la rutina de carga durante una cantidad determinada de minutos. Durante el proceso, se muestra por consola el progreso de la batería.

 Recorrido del mensaje
1. El programa crea un vehículo eléctrico con su capacidad y nivel de batería inicial.
2. Se crea el surtidor eléctrico.
3. El surtidor recibe el vehículo y el tiempo de carga solicitado.
4. El surtidor envía mensajes al vehículo para suministrarle energía.
5. El vehículo recibe la carga y actualiza su nivel de batería.
6. El proceso continúa hasta que se cumple el tiempo indicado o la batería alcanza el 100%.
7. Finalmente, se muestra el nivel de carga alcanzado por el vehículo.

 Validaciones
El sistema debe evitar que la batería supere su capacidad máxima y detener automáticamente la carga cuando alcanza el 100%. También debe controlar que el tiempo de carga sea válido.

 Objetivo
Practicar la comunicación entre objetos en Java, el envío de mensajes con parámetros, la actualización de atributos y el uso de condiciones para controlar un proceso de carga.
