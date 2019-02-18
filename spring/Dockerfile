FROM openjdk:jre-slim
VOLUME /tmp
ARG JAR_FILE

ENV _JAVA_OPTIONS "-Xms256m -Xmx512m -Djava.awt.headless=true"

COPY ${JAR_FILE} /tmp/app.jar

RUN groupadd -g 999 appuser && \
    useradd -r -u 999 -g appuser appuser
USER appuser

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/tmp/app.jar"]
