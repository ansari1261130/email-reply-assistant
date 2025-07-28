# Stage 1: Build the JAR
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR
FROM openjdk:24-jdk
COPY --from=build /app/target/*.jar /email-reply-assistant.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/email-reply-assistant.jar"]
