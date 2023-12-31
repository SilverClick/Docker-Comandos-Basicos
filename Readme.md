# Docker-Comandos-basicos


### 1.**Descarga la imagen 'ubuntu' y comprueba que está en tu equipo**:

```
docker pull ubuntu
docker images
```

El primer comando descarga la imagen de Ubuntu desde el Docker Hub, y el segundo comando lista las imágenes disponibles en tu sistema.
### 2.**Crea un contenedor sin ponerle nombre. ¿Está arrancado? Obtén el nombre**:

```
docker run -di ubuntu
docker ps
```

El primer comando crea un contenedor a partir de la imagen de Ubuntu sin especificar un nombre. El segundo comando muestra la lista de contenedores en ejecución.

### 3.**Crea un contenedor con el nombre 'dam_ubu1'. ¿Cómo puedes acceder a él?**:

```
docker run -di --name dam_ubu1 ubuntu
docker exec -it dam_ubu1 bash
```

El primer comando crea un contenedor con el nombre 'dam_ubu1' a partir de la imagen de Ubuntu. El segundo comando te permite acceder al contenedor mediante una sesión interactiva de bash.

### 4.**Comprueba qué dirección IP tiene y si puedes hacer un ping a google.com**:

Dentro del contenedor 'dam_ubu1', ejecuta los siguientes comandos:

```
apt update
apt install net-tools
apt install iputils-ping
ifconfig
ping google.com
```

Estos comandos mostrarán la configuración de red y realizarán un ping a google.com desde el contenedor.

### 5.**Crea un contenedor con el nombre 'dam_ubu2'. ¿Puedes hacer ping entre los contenedores?**:

```
docker run -di --name dam_ubu2 ubuntu

# En dam_ubu1
ping dam_ubu2

# En dam_ubu2
ping dam_ubu1
```

Estos comandos crean otro contenedor con el nombre 'dam_ubu2' y luego conectan ambos contenedores a la red de puente (bridge) para permitir la comunicación entre ellos. Luego, se realiza un ping de un contenedor al otro.
### 6.**Sal del terminal. ¿Qué ocurrió con el contenedor?**:

Cuando cierras la terminal, los contenedores que se ejecutan en segundo plano siguen funcionando. Sin embargo, si utilizaste el comando `exit` dentro del contenedor, éste se detendrá.

### 7.**¿Cuánta memoria en el disco duro ocupaste?**:

Para verificar cuánto espacio en disco está utilizando Docker, puedes ejecutar el siguiente comando:

```
docker system df
```

Este comando mostrará la utilización de espacio en disco por parte de las imágenes, contenedores y volúmenes de Docker.

### 8.**¿Cuánta RAM ocupan los contenedores? ¿Hay algún comando docker para saber esto?**:

Puedes utilizar el siguiente comando para obtener información detallada sobre el uso de recursos de los contenedores:

```
docker stats
```

Este comando mostrará estadísticas en tiempo real de los contenedores en ejecución, incluyendo el uso de CPU, memoria y red.


