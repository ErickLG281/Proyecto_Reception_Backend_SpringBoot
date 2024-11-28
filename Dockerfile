# Usa una imagen de JDK 23 como base
FROM openjdk:23-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY target/reception-backend-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que la aplicación Spring Boot escuchará
EXPOSE 8081

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

