FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/InventoryManagement.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
