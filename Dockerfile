FROM tomcat:9.0-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file as ROOT.war so it deploys at root context
COPY target/InventoryManagement.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 (default Tomcat port)
EXPOSE 8080

# Start Tomcat in the foreground so container stays alive
CMD ["catalina.sh", "run"]
