FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/InventoryManagement.war app.war
ENTRYPOINT ["java", "-war", "app.war"]
