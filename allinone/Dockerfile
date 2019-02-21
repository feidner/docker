#FROM debian:buster-slim
FROM tomcat:9-jre11-slim

ARG SPRING_JAR
ARG TOMCAT_WAR

ENV http_proxy http://10.0.2.2:3128
ENV https_proxy https://10.0.2.2:3128

RUN apt-get update
RUN apt-get install apache2 -y
RUN apt-get install links -y

RUN a2enmod proxy
RUN a2enmod proxy_http
RUN a2enmod proxy_balancer
RUN a2enmod rewrite

ENV APACHE_LYNX="links -dump"

COPY config/apache2.conf /etc/apache2/
COPY config/server_with_proxy_connector.xml /usr/local/tomcat/conf/server.xml

COPY ${TOMCAT_WAR} /usr/local/tomcat/webapps

WORKDIR /tmp

COPY start.sh start.sh
COPY ${SPRING_JAR} spring.jar

ENTRYPOINT ["bash", "start.sh"]