# DOCKER FILE for BUILD a IMAGE
FROM maven:3.9.9-eclipse-temurin-17-alpine
COPY ./src /usr/src/app/src
COPY ./pom.xml /usr/src/app
EXPOSE 8080
RUN mvn -f /usr/src/app/pom.xml clean package
CMD ["mvn", "-f", "/usr/src/app/pom.xml", "spring-boot:run"]