Springboot-en-Castellano
SpringBoot es un framework de Spring que permite crear aplicaciones standalone, sin necesidad de un servidor de aplicaciones externo a ella.

Para iniciar una aplicación SB (SpringBoot a partir de ahora) bastará con ejecutar el comando "java -jar nombre_de_la_aplicacion.jar"

Índice
introducción
instalación
creación de una aplicación base y ejecución
starters
configuración mediante clases y autoconfiguración
beans e inyección de depencias
YAML como fichero de configuración
CORS configuración
seguridad
configuración del contenedor embebido
acceso a bases de datos SQL y NoSQL
testeo de aplicaciones
spring batch
websockets
webservices
springboot actuator
despliegue en cloud (cloud foundry, heroku, openshift, amazon y Google Cloud)
springboot maven plugin
consejos
FAQs
referencias
Introducción
[Spring Boot] es un framework enfocado a la creación de aplicaciones basadas en Spring sin necesidad de contenedor de aplicaciones.

A pesar de poder ejecutar aplicaciones SB en Java 6 y Java 7 se recomienda su uso a partir de la versión de Java 8.

Los servidores de aplicaciones enbebidos que permite ejecutar SB por defecto son los siguientes:

Tomcat 8 empleando Java 7+.
Tomcat 7 empleando Java 6+.
Jetty 9.3 empleando Java 8+.
Jetty 9.2 empleando Java 7+.
Jetty 8 empleando Java 6+.
Udertown 1.3 empleando Java 7+.
Ir al índice

Instalación
SB es compatible con Maven 3.2 o superior. Se puede consultar los pasos para realizar su instalación en la siguiente dirección http://maven.apache.org/.

SpringBoot CLI

SB CLi es una herramienta de comandos que se puede utilizar para realizar prototipado con Spring. Adicionalmente permitirá ejecutar scripts de groovy.

Es una herramienta opcional y para seguir los ejemplos y guias descritas a continuación no es necesario instalarlo.

Para validar si se encuentra instalado basta con ejecutar el siguiente comando en una consola:

spring -version
Spring Boot v1.5.8.RELEASE
Se puede descargar e instalar manualmente a través del siguiente enlace:

spring-boot-cli-1.5.8.RELEASE-bin.zip

Para sistemas operativos OSX (MAC) se podrá iniciar su instalación mediante los siguientes comandos:

brew tap pivotal/tap
brew install springboot
