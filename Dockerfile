FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /Shop
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /Shop
COPY --from=build /Shop/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
