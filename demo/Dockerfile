# Usamos una imagen oficial con Maven y JDK 17
FROM maven:3.9.3-eclipse-temurin-17

# Directorio de la app dentro del contenedor
WORKDIR /app

# Copiamos pom.xml primero para aprovechar cache
COPY pom.xml .

# Descargamos dependencias de Maven
RUN mvn dependency:go-offline

# Copiamos el resto del código
COPY src ./src

# Comando por defecto para compilar y ejecutar tests
CMD ["mvn", "clean", "test"]
