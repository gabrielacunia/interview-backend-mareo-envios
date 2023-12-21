# Etapa de compilación
FROM maven:3.8.5-openjdk-17 as build
WORKDIR /app

# Copiar los archivos pom.xml y descargar las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente y construir el artefacto
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM openjdk:17
WORKDIR /app

# Copiar el artefacto construido desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]