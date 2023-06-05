# MicroservicioVuelo
## Resumen
Microservicio Vuelo que  recoge una lista de vuelos, muestra los vuelos disponibles que tengan disponibles las plazas que solicitemos y actualiza las plazas de los vuelos. 
## Estructura
### Paquetes
* com.curso.inicio
  - Clase **Application.java**
* com.curso.model
  - Clase **Vuelo.java**
    - idVuelo: numero entero, identificador del vuelo
    - compania: nombre de la compañia
    - plazas: numero entero, plazas disponibles del vuelo
    - fechaVuelo: varible datetime que devuelve la fecha del vuelo
    - precio: numero con decimales, precio del vuelo
* com.curso.dao
  - Clase **VuelosDao.java**
* com.curso.service
  - Interfaz **VuelosService.java**
  - Clase **VuelosServiceImpl.java** (Implementa la interfaz **VuelosService.java**)
* com.curso.controller
  - Clase **VuelosController.java**
  
  > GET: Recojo la lista de los vuelos
  
  > PUT: Actualizo las plazas del vuelo

### Metodos
* listaVuelos() -> Lista de vuelos almacenados
* elegirVuelo() -> compara si el vuelo que elegimos tiene plazas disponibles y nos lo devuelve
* actualizarVuelo(int idHotel,int plazas) -> Actualizo un vuelo pasando el id y el numero de plazas utilizadas como parametros
## Autor
* Daniel Rodriguez
## Estado
🟢Terminado🟢
