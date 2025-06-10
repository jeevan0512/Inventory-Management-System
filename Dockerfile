FROM tomcat:9.0-jdk17
COPY target/InventoryManagement.war /usr/local/tomcat/webapps/InventoryManagement.war
