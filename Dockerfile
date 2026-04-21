FROM eclipse-temurin:25-jdk
ARG JAR_FILE=targer/*.jar
COPY ./target/pratikum6-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080