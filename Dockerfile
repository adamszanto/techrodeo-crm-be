# Alap image: OpenJDK 23, mivel Java 23-at használunk
FROM openjdk:23-jdk-slim AS build

# Munkakönyvtár beállítása
WORKDIR /app

# Másoljuk a projekt fájljait a konténerbe
COPY . .

# Gradle Wrapper használata a buildhez
RUN ./gradlew build --no-daemon

# Második fázis: A Spring Boot alkalmazás futtatása
FROM openjdk:23-jdk-slim

# Munkakönyvtár beállítása
WORKDIR /app

# A jar fájl másolása a build fázisból
COPY --from=build /app/build/libs/techrodeo-crm-be-0.0.1-SNAPSHOT.jar techrodeo-crm-be.jar

# Alkalmazás futtatása
ENTRYPOINT ["java", "-jar", "techrodeo-crm-be.jar"]

# Exponáljuk a 8080-as portot
EXPOSE 8080
