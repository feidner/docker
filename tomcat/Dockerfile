FROM tomcat:9-jre11-slim

ARG WAR_FILE

COPY ${WAR_FILE} /usr/local/tomcat/webapps
COPY server.xml /usr/local/tomcat/conf

