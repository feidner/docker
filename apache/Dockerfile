FROM httpd:alpine

COPY proxy.conf /usr/local/apache2/conf/
COPY hfe.crt /usr/local/apache2/conf/
COPY hfe.key /usr/local/apache2/conf/
RUN cat /usr/local/apache2/conf/proxy.conf >> /usr/local/apache2/conf/httpd.conf
RUN chown -R www-data:www-data /usr/local/apache2/htdocs/