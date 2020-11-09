Antes de intentar ejecutarlo, tiene que tener instalado Maven y Java en su equipo.

Calculadora Spring-Boot
Esta aplicación calculadora se ha desarrollado utilizando Springboot y maven con las funciones de Sumar,restar,multiplicar y dividir.
Para realizar alguna de las funciones anteriormente nombradas, tiene que llamar al siguiente servicio api-rest(http://localhost:8080/calculadora/calcular?numero1=2.5651115545&numero2=2&operacion=suma)


Se ha integrado la libreria de tracer mediante el plugin maven-install-plugin.

Para poder ejecutar dicho proyecto hay que:
-Abrir un CMD y posicionarnos sobre la carpeta donde queremos guardar el proyecto
-descargar el repositorio(git clone https://github.com/Mvillalobos92/prueba-sanitas-miguel.git)
-Abrir el proyecto en Eclipse(u otro IDE) como Proyecto Maven(Import-->Existing Maven Project)
-Hacer update de las dependencias del proyecto(Click derecho sobre el proyecto-->Maven-->Update Project)
-Ejecutar el comando 'Maven  clean install'
-Si ha terminado de manera satifactoria,segundo botón sobre el proyecto-->Run As-->SpringBoot App

Listo!Con esto deberias tener la aplicación corriendo en el puerto 8080

Los parámetros que se le pasan al servicio son :
-numero1
-numero2
-operacion
Es un método de tipoGET (http://localhost:8080/calculadora/calcular?numero1=2.5651115545&numero2=2&operacion=suma) 

Para ejecutar los test podríamos volver al CMD y realizar el comando : comando mvn clean test.

Se ha utilizado Swagger para la documentación del servicio.Una vez levantado el servicio,se puede acceder a la URL http://localhost:8080/swagger-ui.html para ver la información del servicio expuesto.

Se ha realizado un control de errores propio, para devolver un texto dando las razones de porque no ha podido realizarse la operación.


