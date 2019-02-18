FROM tomcat:9-jre11-slim

ENV http_proxy http://10.0.2.2:3128
ENV https_proxy https://10.0.2.2:3128

RUN apt-get update
RUN apt-get install apache2-bin -y

RUN chown -R www-data:www-data /usr/local/apache2/htdocs/