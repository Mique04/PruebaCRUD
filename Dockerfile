# Usa una imagen base de OpenJDK 17
FROM openjdk:17

# Copia el archivo JAR de la aplicación al directorio de trabajo
COPY ./target/CRUD-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecutará la aplicación (ajusta el número de puerto según tus necesidades)
#EXPOSE 8080

# Define el comando de inicio para ejecutar la aplicación
CMD ["java", "-jar", "/app.jar" ]