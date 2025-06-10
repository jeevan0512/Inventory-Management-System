FROM tomcat:9.0-jdk17

# Clean default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file as ROOT.war (so app is available at '/')
COPY target/InventoryManagement.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
