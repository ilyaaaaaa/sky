# FROM openjdk:17-jdk-slim
#
# WORKDIR /app
#
# COPY target/*.jar app.jar
#
# EXPOSE 8080
#
# ENTRYPOINT ["java", "-jar", "app.jar"]

FROM postgres:latest

ENV POSTGRES_USER=myuser
ENV POSTGRES_PASSWORD=secret
ENV POSTGRES_DB=mydatabase

# COPY ./src/main/resources/db/schema.sql /docker-entrypoint-initdb.d/

EXPOSE 5432
